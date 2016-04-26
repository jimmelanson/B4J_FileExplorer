Type=Class
Version=4.2
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@

'Requires JavaObject library
'In your Main module add the following:
'Sub Process_Globals
'	Privatge listViewExplorer As ListView
'	Private explorer As FileExplorer
'End Sub
'
'Sub AppStart (Form1 As Form, Args() As String)
'	explorer.Initialize(listViewExplorer, Dir)
'	explorer.LoadContents
'End Sub

'Sub listViewExplorer_MouseClicked (EventData As MouseEvent)
'	explorer.MouseClicked(EventData)
'End Sub

'Sub listViewExplorer_SelectedIndexChanged(Index As Int)
'	explorer.SelectedIndex(Index)
'End Sub
'
'Module raises the following events:
'
'FileExplorer_MouseClick(Uri As String)
'FileExplorer_DoubleClick(Uri As String)
'FileExplorer_ChangeDirectory(Index As Int)
'FileExplorer_SelectedIndexChanged(Index As Int)


Sub Class_Globals
	Private fx As JFX
	Private f As FileChooser
	Private MyComputerListView As ListView
	Private strThisDirectoryURI As String
	Private listThisDirectoryContents As List
	Private listThisDirectoryDirs As List
	Private listThisDirectoryFiles As List
	Private intLastSelectedIndex As Int
	
	Private strSingleClickSelectedItemType As String
	Private strSingleClickSelectedItemValue As String
	Private strSingleClickSelectedItemURI As String

	Private strDblClickSelectedItemType As String
	Private strDblClickSelectedItemValue As String
	Private strDblClickSelectedItemURI As String
	
	Private DefaultImage As Image
	Private JO As JavaObject
	Private mModule As Object
	Private mEventName As String
	Private ListenerIndexChange As Object
	Private ListenerDblClick As Object
	Private ListenerMouseClick As Object
	Private ListenerChangeDirectory As Object
	
End Sub

'If you pass the directory as an empty string, the module will look for the user's default folder, depending on the OS.
Public Sub Initialize(Module As Object, EventName As String, listViewNode As ListView, InitialDirectory As String)
	mModule = Module
	mEventName = EventName
    JO.InitializeNewInstance("javafx.beans.property.SimpleObjectProperty",Array(Me,"value"))
	'Will take this out if can't listen to main
    ListenerIndexChange = JO.CreateEvent("javafx.beans.InvalidationListener","SelectedIndexChanged","")
    JO.RunMethod("addListener",Array(ListenerIndexChange))
	
    ListenerDblClick = JO.CreateEvent("javafx.beans.InvalidationListener","DoubleClick","")
    JO.RunMethod("addListener",Array(ListenerDblClick))
    ListenerMouseClick = JO.CreateEvent("javafx.beans.InvalidationListener","MouseClick","")
    JO.RunMethod("addListener",Array(ListenerMouseClick))
    ListenerChangeDirectory = JO.CreateEvent("javafx.beans.InvalidationListener","ChangeDirectory","")
    JO.RunMethod("addListener",Array(ListenerChangeDirectory))
	listThisDirectoryContents.Initialize
	listThisDirectoryDirs.Initialize
	listThisDirectoryFiles.Initialize
	intLastSelectedIndex = -1
	DefaultImage.Initialize(File.DirAssets, "unknown_filetype.png")
  	Dim JO As JavaObject
    Dim strDefaultFolder As String = JO.InitializeStatic("javax.swing.filechooser.FileSystemView").RunMethodJO("getFileSystemView", Null).RunMethodJO("getDefaultDirectory", Null).RunMethod("getAbsolutePath", Null)
	MyComputerListView = listViewNode
	If MyComputerListView.IsInitialized Then
		If InitialDirectory <> "" Then
			If File.IsDirectory(InitialDirectory, "") = True Then
				generate_directory_content_list(InitialDirectory)
			Else
				generate_directory_content_list(strDefaultFolder)
			End If
		Else
			generate_directory_content_list(strDefaultFolder)
		End If
	End If
	Private strSingleClickSelectedItemType As String
	Private strSingleClickSelectedItemValue As String
	Private strSingleClickSelectedItemURI As String
	Private strDblClickSelectedItemType As String
	Private strDblClickSelectedItemValue As String
	Private strDblClickSelectedItemURI As String
End Sub

#Region Public Methods

'Returns the URI of the current directory being displayed
Public Sub CurrentDirectory As String
	Return strThisDirectoryURI
End Sub

'Returns "parent", "file", "or directory" of the currently selected list item.
'Indicate True of False if you want to only read this from a double click.
Public Sub SelectedItemType(boolDoubleClick As Boolean) As String
	If boolDoubleClick = True Then
		Return strDblClickSelectedItemType
	Else
		Return strSingleClickSelectedItemType
	End If
End Sub

'Returns directory name or file name of the currently selected item. Does not return the URI.
'Indicate True of False if you want to only read this from a double click.
Public Sub SelectedItemValue(boolDoubleClick As Boolean) As String
	If boolDoubleClick = True Then
		Return strDblClickSelectedItemValue
	Else
		Return strSingleClickSelectedItemValue
	End If
End Sub

'Returns URI of the currently selected item.
'Indicate True of False if you want to only read this from a double click.
Public Sub SelectedItemURI(boolDoubleClick As Boolean) As String
	If boolDoubleClick = True Then
		Return strDblClickSelectedItemURI
	Else
		Return strSingleClickSelectedItemURI
	End If
End Sub

'You only need to call this once, in the AppStart sub. After that, it's called automatically by the class.
Public Sub LoadContents
	MyComputerListView.Items.Clear
	Dim a As AnchorPane
	a.Initialize("DeviceAnchorPane")
	Dim im As ImageView
	im.Initialize("DeviceIcon")
	im.SetImage(fx.LoadImage(File.DirAssets, "folder_up.png"))
	a.AddNode(im, 0, 0, 16, 16)
	Dim lblThis As Label
	lblThis.Initialize("DeviceList")
	lblThis.Text = ".."
	a.AddNode(lblThis, 18, 0, -1, -1)
	MyComputerListView.Items.Add(a)
	If listThisDirectoryDirs.Size > 0 Then
		For i = 0 To listThisDirectoryDirs.Size -1
			Dim a As AnchorPane
			a.Initialize("DeviceAnchorPane")
			Dim im As ImageView
			im.Initialize("DeviceIcon")
			im.SetImage(fx.LoadImage(File.DirAssets, "folder.png"))
			a.AddNode(im, 0, 0, 16, 16)
			Dim lblThis As Label
			lblThis.Initialize("DeviceList")
			lblThis.Text = listThisDirectoryDirs.Get(i)
			a.AddNode(lblThis, 18, 0, -1, -1)
			MyComputerListView.Items.Add(a)
		Next
	End If
	If listThisDirectoryFiles.Size > 0 Then
		For i = 0 To listThisDirectoryFiles.Size -1
			Dim a As AnchorPane
			a.Initialize("DeviceAnchorPane")
			Dim im As ImageView
			im.Initialize("")
			im.SetImage(GetFileIcon(strThisDirectoryURI, listThisDirectoryFiles.Get(i)))
			a.AddNode(im, 0, 0, 16, 16)
			Dim lblThis As Label
			lblThis.Initialize("")
			lblThis.Text = listThisDirectoryFiles.Get(i)
			a.AddNode(lblThis, 18, 0, -1, -1)
			MyComputerListView.Items.Add(a)
		Next
	End If
End Sub

'Call this after performing an action on the listView that is your explorer
Public Sub ReloadContents(Dir As String)
	If Dir <> "" Then
		If File.IsDirectory(Dir, "") = True Then
			generate_directory_content_list(Dir)
			LoadContents
		End If
	Else
		If File.IsDirectory(strThisDirectoryURI, "") = True Then
			generate_directory_content_list(strThisDirectoryURI)
			LoadContents
		End If
	End If
End Sub


Public Sub RenameFolder(strParent As String, strCurrentFolderName As String, strNewFolder As String)
	'This sub is from Erel on the forum: https://www.b4x.com/android/forum/threads/rename-a-folder.53339/#content
	If File.IsDirectory(strParent, strCurrentFolderName) = True Then
		If File.IsDirectory(strParent, strNewFolder) = False Then
			Dim jo1, jo2 As JavaObject
			jo1.InitializeNewInstance("java.io.File", Array(File.Combine(strParent, strCurrentFolderName)))
			jo2.InitializeNewInstance("java.io.File", Array(File.Combine(strParent, strNewFolder)))
			Log(jo1.RunMethod("renameTo", Array(jo2)))
		End If
	End If
End Sub


'Your Main module needs to pass the list view node's MouseEvent to the class.
'Sub listViewExplorer_MouseClicked (EventData As MouseEvent)
'	explorer.MouseClicked(EventData)
'End Sub
Public Sub MouseClicked (EventData As MouseEvent)
	strSingleClickSelectedItemType = ""
	strSingleClickSelectedItemValue = ""
	strSingleClickSelectedItemURI  = ""
	strDblClickSelectedItemType = ""
	strDblClickSelectedItemValue = ""
	strDblClickSelectedItemURI  = ""
	If intLastSelectedIndex > -1 Then
		Dim ap As AnchorPane = MyComputerListView.Items.Get(intLastSelectedIndex)
		If ap.NumberOfNodes = 2 Then
			If GetType(ap.GetNode(1)) = "javafx.scene.control.Label" Then
				'Dim thisLabel As Label = ap.GetNode(1)
				If intLastSelectedIndex = 0 Then
					strSingleClickSelectedItemType = "parent"
					strSingleClickSelectedItemValue = ""
					strSingleClickSelectedItemURI  = ""
					If SubExists(mModule, mEventName&"_MouseClick") Then CallSub2(mModule, mEventName&"_MouseClick",File.GetFileParent(strThisDirectoryURI))
					If EventData.ClickCount > 1 Then
						strDblClickSelectedItemType = "parent"
						strDblClickSelectedItemValue = ""
						strDblClickSelectedItemURI  = ""
						change_directory(File.GetFileParent(strThisDirectoryURI))
					End If
				Else If intLastSelectedIndex > ((listThisDirectoryDirs.Size - 1) + 1) Then
					'This is a file
					strSingleClickSelectedItemType = "file"
					strSingleClickSelectedItemValue = listThisDirectoryFiles.Get((intLastSelectedIndex - 1) - listThisDirectoryDirs.Size)
					strSingleClickSelectedItemURI  = File.Combine(strThisDirectoryURI, listThisDirectoryFiles.Get((intLastSelectedIndex - 1) - listThisDirectoryDirs.Size))
					If SubExists(mModule, mEventName&"_MouseClick") Then CallSub2(mModule, mEventName&"_MouseClick",File.GetFileParent(strThisDirectoryURI))
					If EventData.ClickCount > 1 Then
						strDblClickSelectedItemType = "file"
						strDblClickSelectedItemValue = listThisDirectoryFiles.Get((intLastSelectedIndex - 1) - listThisDirectoryDirs.Size)
						strDblClickSelectedItemURI  = File.Combine(strThisDirectoryURI, listThisDirectoryFiles.Get((intLastSelectedIndex - 1) - listThisDirectoryDirs.Size))
						If SubExists(mModule, mEventName&"_DoubleClick") Then CallSub2(mModule, mEventName&"_DoubleClick",strDblClickSelectedItemURI)
					End If
				Else
					'This is a directory
					strSingleClickSelectedItemType = "directory"
					strSingleClickSelectedItemValue = listThisDirectoryDirs.Get(intLastSelectedIndex - 1)
					strSingleClickSelectedItemURI  = File.Combine(strThisDirectoryURI, listThisDirectoryDirs.Get(intLastSelectedIndex - 1))
					If SubExists(mModule, mEventName&"_MouseClick") Then CallSub2(mModule, mEventName&"_MouseClick",File.GetFileParent(strThisDirectoryURI))
					If EventData.ClickCount > 1 Then
						strDblClickSelectedItemType = "directory"
						strDblClickSelectedItemValue = listThisDirectoryDirs.Get(intLastSelectedIndex - 1)
						strDblClickSelectedItemURI  = File.Combine(strThisDirectoryURI, listThisDirectoryDirs.Get(intLastSelectedIndex - 1))
						'If SubExists(mModule, mEventName&"_DoubleClick") Then CallSub2(mModule, mEventName&"_DoubleClick",strDblClickSelectedItemURI)
						change_directory(File.Combine(strThisDirectoryURI, listThisDirectoryDirs.Get(intLastSelectedIndex - 1)))
					End If
				End If
			End If
		End If

		'Will take this out if can't listen to main
		If SubExists(mModule, mEventName&"_SelectedIndexChanged") Then CallSub2(mModule, mEventName&"_SelectedIndexChanged", intLastSelectedIndex)

	End If
End Sub

'Your Main module needs to pass the list view node's SelectedIndexChanged EventData to the class.
'Sub listViewExplorer_SelectedIndexChanged(Index As Int)
'	explorer.SelectedIndex(Index)
'End Sub
Public Sub SelectedIndex(Index As Int)
	If Index > -1 Then
		intLastSelectedIndex = Index
	Else
		intLastSelectedIndex = 0
	End If
End Sub

#End Region

#Region class methods

Public Sub GetFileIcon(Dir As String, FileName As String) As Image
	'Source: DonManfred post on B4X forum: https://www.b4x.com/android/forum/threads/get-the-fileicon-from-a-file.63866/
	'Modification: Add conditional test to ensure the Dir & FileName exists, and are a file.
	'Modification: Added default image, because if there is no image the jo.InitializeStatic returns uninitialized
	If File.IsDirectory(Dir, FileName) = False Then
		If File.Exists(Dir, FileName) = True Then
			Dim JO As JavaObject
			Dim JavaFile As JavaObject
			JavaFile.InitializeNewInstance("java.io.File", Array(File.Combine(Dir, FileName)))
			Dim icon As JavaObject = JO.InitializeStatic("sun.awt.shell.ShellFolder").RunMethodJO( "getShellFolder", Array(JavaFile)).RunMethod("getIcon", Array(True))
			If icon.IsInitialized = True Then
			    Return fileicon_to_image(icon)
			Else
				Return DefaultImage
			End If
		Else
			Return DefaultImage
		End If
	Else
		Return DefaultImage
	End If
End Sub

Private Sub fileicon_to_image(img As JavaObject) As Image
	Dim JO As JavaObject
	Return JO.InitializeStatic("javafx.embed.swing.SwingFXUtils").RunMethod("toFXImage", Array(img, Null))
End Sub

Private Sub change_directory(strNewDirectory As String)
	If File.IsDirectory(strNewDirectory, "") = True Then
		generate_directory_content_list(strNewDirectory)
		LoadContents
	End If
End Sub

Private Sub generate_directory_content_list(Dir As String)
	strThisDirectoryURI = Dir
	If File.IsDirectory(strThisDirectoryURI, "") = True Then
		listThisDirectoryDirs.Clear
		listThisDirectoryFiles.Clear
		listThisDirectoryContents = File.ListFiles(strThisDirectoryURI)
		If listThisDirectoryContents.IsInitialized = True Then
			For i = 0 To listThisDirectoryContents.Size - 1
				Dim strFile As String = File.GetName(listThisDirectoryContents.Get(i))
				If File.IsDirectory(strThisDirectoryURI, strFile) = True Then
					listThisDirectoryDirs.Add(strFile)
				Else
					listThisDirectoryFiles.Add(strFile)
				End If
			Next
		End If
		If SubExists(mModule, mEventName&"_ChangeDirectory") Then CallSub2(mModule, mEventName&"_ChangeDirectory",strThisDirectoryURI)
	End If
	If listThisDirectoryDirs.Size > 0 Then
		listThisDirectoryDirs.Sort(True)
	End If
	If listThisDirectoryFiles.Size > 0 Then
		listThisDirectoryFiles.Sort(True)
	End If
End Sub

#End Region
