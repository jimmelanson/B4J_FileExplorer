package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.ShellBA.delegateBA = new anywheresoftware.b4j.objects.FxBA("b4j.example", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            BA.Log("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 800, 600);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static b4j.example.fileexplorer _explorer = null;
public static anywheresoftware.b4j.objects.ListViewWrapper _lvselected = null;
public static anywheresoftware.b4j.objects.ListViewWrapper _lvdevice = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lblselected = null;
public static int _intselectedindex = 0;
public static anywheresoftware.b4a.objects.collections.Map _mapselecteduri = null;
public static b4j.example.dialogs8 _dialogue8 = null;
public static anywheresoftware.b4j.objects.SplitPaneWrapper _splitmain = null;
public static anywheresoftware.b4j.objects.ComboBoxWrapper _combofolder = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lblcurrentdirectoryname = null;
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart"))
	return (String) Debug.delegate(ba, "appstart", new Object[] {_form1,_args});
anywheresoftware.b4j.object.JavaObject _jo = null;
String _strinitialdirectory = "";
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
RDebugUtils.currentLine=65537;
 //BA.debugLineNum = 65537;BA.debugLine="MainForm = Form1";
_mainform = _form1;
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="MainForm.SetFormStyle(\"UNIFIED\")";
_mainform.SetFormStyle("UNIFIED");
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="MainForm.RootPane.LoadLayout(\"mainform\") 'Load th";
_mainform.getRootPane().LoadLayout(ba,"mainform");
RDebugUtils.currentLine=65540;
 //BA.debugLineNum = 65540;BA.debugLine="MainForm.Icon = fx.LoadImage(File.DirAssets, \"fol";
_mainform.setIcon((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"folder_magnify.png").getObject()));
RDebugUtils.currentLine=65541;
 //BA.debugLineNum = 65541;BA.debugLine="splitMain.LoadLayout(\"mycomputer\")";
_splitmain.LoadLayout(ba,"mycomputer");
RDebugUtils.currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="splitMain.LoadLayout(\"selecteditems\")";
_splitmain.LoadLayout(ba,"selecteditems");
RDebugUtils.currentLine=65544;
 //BA.debugLineNum = 65544;BA.debugLine="splitMain.SetSizeLimits(0, 0, 0)";
_splitmain.SetSizeLimits((int) (0),0,0);
RDebugUtils.currentLine=65545;
 //BA.debugLineNum = 65545;BA.debugLine="splitMain.SetSizeLimits(1, 0, 0)";
_splitmain.SetSizeLimits((int) (1),0,0);
RDebugUtils.currentLine=65546;
 //BA.debugLineNum = 65546;BA.debugLine="MainForm.Show";
_mainform.Show();
RDebugUtils.currentLine=65547;
 //BA.debugLineNum = 65547;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=65548;
 //BA.debugLineNum = 65548;BA.debugLine="Dim strInitialDirectory As String =  jo.Initia";
_strinitialdirectory = BA.ObjectToString(_jo.InitializeStatic("javax.swing.filechooser.FileSystemView").RunMethodJO("getFileSystemView",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethodJO("getDefaultDirectory",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethod("getAbsolutePath",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=65549;
 //BA.debugLineNum = 65549;BA.debugLine="comboFolder.Items.Add(strInitialDirectory)";
_combofolder.getItems().Add((Object)(_strinitialdirectory));
RDebugUtils.currentLine=65550;
 //BA.debugLineNum = 65550;BA.debugLine="comboFolder.SelectedIndex = 0";
_combofolder.setSelectedIndex((int) (0));
RDebugUtils.currentLine=65551;
 //BA.debugLineNum = 65551;BA.debugLine="explorer.Initialize(Me, \"file_explorer\", lvDevice";
_explorer._initialize(null,ba,main.getObject(),"file_explorer",_lvdevice,_strinitialdirectory);
RDebugUtils.currentLine=65552;
 //BA.debugLineNum = 65552;BA.debugLine="explorer.LoadContents";
_explorer._loadcontents(null);
RDebugUtils.currentLine=65553;
 //BA.debugLineNum = 65553;BA.debugLine="intSelectedIndex = -1";
_intselectedindex = (int) (-1);
RDebugUtils.currentLine=65554;
 //BA.debugLineNum = 65554;BA.debugLine="mapSelectedURI.Initialize";
_mapselecteduri.Initialize();
RDebugUtils.currentLine=65555;
 //BA.debugLineNum = 65555;BA.debugLine="dialogue8.Initialize";
_dialogue8._initialize(ba);
RDebugUtils.currentLine=65556;
 //BA.debugLineNum = 65556;BA.debugLine="End Sub";
return "";
}
public static String  _cmenuaddfolder_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "cmenuaddfolder_action"))
	return (String) Debug.delegate(ba, "cmenuaddfolder_action", null);
String _strnewfoldername = "";
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Sub cmenuAddFolder_Action";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="Dim strNewFolderName As String = dialogue8.TextIn";
_strnewfoldername = _dialogue8._textinputdialog("New Folder","Create New Folder","Enter folder name","");
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="If strNewFolderName <> \"\" Then";
if ((_strnewfoldername).equals("") == false) { 
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="If strNewFolderName.EqualsIgnoreCase(\"Null\") = F";
if (_strnewfoldername.equalsIgnoreCase("Null")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="If File.IsDirectory(explorer.CurrentDirectory,";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory(_explorer._currentdirectory(null),"")==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=5963781;
 //BA.debugLineNum = 5963781;BA.debugLine="File.MakeDir(explorer.CurrentDirectory, strNew";
anywheresoftware.b4a.keywords.Common.File.MakeDir(_explorer._currentdirectory(null),_strnewfoldername);
RDebugUtils.currentLine=5963782;
 //BA.debugLineNum = 5963782;BA.debugLine="explorer.ReloadContents(\"\")";
_explorer._reloadcontents(null,"");
 };
 };
 };
RDebugUtils.currentLine=5963786;
 //BA.debugLineNum = 5963786;BA.debugLine="End Sub";
return "";
}
public static String  _cmenuaddtoselectedlist_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "cmenuaddtoselectedlist_action"))
	return (String) Debug.delegate(ba, "cmenuaddtoselectedlist_action", null);
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Sub cmenuAddToSelectedList_Action";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="file_explorer_DoubleClick(explorer.SelectedItemUR";
_file_explorer_doubleclick(_explorer._selecteditemuri(null,anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="End Sub";
return "";
}
public static String  _file_explorer_doubleclick(String _uri) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "file_explorer_doubleclick"))
	return (String) Debug.delegate(ba, "file_explorer_doubleclick", new Object[] {_uri});
anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper _a = null;
anywheresoftware.b4j.objects.ImageViewWrapper _im = null;
anywheresoftware.b4j.objects.LabelWrapper _lblthis = null;
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Sub file_explorer_DoubleClick(Uri As String)";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="Log(\"dc uri: \" & Uri)";
anywheresoftware.b4a.keywords.Common.Log("dc uri: "+_uri);
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="If File.IsDirectory(Uri, \"\") = True Then";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory(_uri,"")==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="Dim a As AnchorPane";
_a = new anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper();
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="a.Initialize(\"DeviceAnchorPane\")";
_a.Initialize(ba,"DeviceAnchorPane");
RDebugUtils.currentLine=6422533;
 //BA.debugLineNum = 6422533;BA.debugLine="Dim im As ImageView";
_im = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=6422534;
 //BA.debugLineNum = 6422534;BA.debugLine="im.Initialize(\"DeviceIcon\")";
_im.Initialize(ba,"DeviceIcon");
RDebugUtils.currentLine=6422535;
 //BA.debugLineNum = 6422535;BA.debugLine="im.SetImage(fx.LoadImage(File.DirAssets, \"folder";
_im.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"folder.png").getObject()));
RDebugUtils.currentLine=6422536;
 //BA.debugLineNum = 6422536;BA.debugLine="a.AddNode(im, 0, 0, 16, 16)";
_a.AddNode((javafx.scene.Node)(_im.getObject()),0,0,16,16);
RDebugUtils.currentLine=6422537;
 //BA.debugLineNum = 6422537;BA.debugLine="Dim lblThis As Label";
_lblthis = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=6422538;
 //BA.debugLineNum = 6422538;BA.debugLine="lblThis.Initialize(\"DeviceList\")";
_lblthis.Initialize(ba,"DeviceList");
RDebugUtils.currentLine=6422539;
 //BA.debugLineNum = 6422539;BA.debugLine="lblThis.Text = File.GetName(Uri)";
_lblthis.setText(anywheresoftware.b4a.keywords.Common.File.GetName(_uri));
RDebugUtils.currentLine=6422540;
 //BA.debugLineNum = 6422540;BA.debugLine="a.AddNode(lblThis, 18, 0, -1, -1)";
_a.AddNode((javafx.scene.Node)(_lblthis.getObject()),18,0,-1,-1);
RDebugUtils.currentLine=6422541;
 //BA.debugLineNum = 6422541;BA.debugLine="lvSelected.Items.Add(a)";
_lvselected.getItems().Add((Object)(_a.getObject()));
RDebugUtils.currentLine=6422544;
 //BA.debugLineNum = 6422544;BA.debugLine="mapSelectedURI.Put(lvSelected.Items.IndexOf(a),";
_mapselecteduri.Put((Object)(_lvselected.getItems().IndexOf((Object)(_a.getObject()))),(Object)(_uri));
 }else {
RDebugUtils.currentLine=6422546;
 //BA.debugLineNum = 6422546;BA.debugLine="Dim a As AnchorPane";
_a = new anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper();
RDebugUtils.currentLine=6422547;
 //BA.debugLineNum = 6422547;BA.debugLine="a.Initialize(\"DeviceAnchorPane\")";
_a.Initialize(ba,"DeviceAnchorPane");
RDebugUtils.currentLine=6422548;
 //BA.debugLineNum = 6422548;BA.debugLine="Dim im As ImageView";
_im = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=6422549;
 //BA.debugLineNum = 6422549;BA.debugLine="im.Initialize(\"\")";
_im.Initialize(ba,"");
RDebugUtils.currentLine=6422550;
 //BA.debugLineNum = 6422550;BA.debugLine="im.SetImage(explorer.GetFileIcon(File.GetFilePar";
_im.SetImage((javafx.scene.image.Image)(_explorer._getfileicon(null,anywheresoftware.b4a.keywords.Common.File.GetFileParent(_uri),anywheresoftware.b4a.keywords.Common.File.GetName(_uri)).getObject()));
RDebugUtils.currentLine=6422551;
 //BA.debugLineNum = 6422551;BA.debugLine="a.AddNode(im, 0, 0, 16, 16)";
_a.AddNode((javafx.scene.Node)(_im.getObject()),0,0,16,16);
RDebugUtils.currentLine=6422552;
 //BA.debugLineNum = 6422552;BA.debugLine="Dim lblThis As Label";
_lblthis = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=6422553;
 //BA.debugLineNum = 6422553;BA.debugLine="lblThis.Initialize(\"\")";
_lblthis.Initialize(ba,"");
RDebugUtils.currentLine=6422554;
 //BA.debugLineNum = 6422554;BA.debugLine="lblThis.Text = File.GetName(Uri)";
_lblthis.setText(anywheresoftware.b4a.keywords.Common.File.GetName(_uri));
RDebugUtils.currentLine=6422555;
 //BA.debugLineNum = 6422555;BA.debugLine="a.AddNode(lblThis, 18, 0, -1, -1)";
_a.AddNode((javafx.scene.Node)(_lblthis.getObject()),18,0,-1,-1);
RDebugUtils.currentLine=6422556;
 //BA.debugLineNum = 6422556;BA.debugLine="lvSelected.Items.Add(a)";
_lvselected.getItems().Add((Object)(_a.getObject()));
RDebugUtils.currentLine=6422559;
 //BA.debugLineNum = 6422559;BA.debugLine="mapSelectedURI.Put(lvSelected.Items.IndexOf(a),";
_mapselecteduri.Put((Object)(_lvselected.getItems().IndexOf((Object)(_a.getObject()))),(Object)(_uri));
 };
RDebugUtils.currentLine=6422561;
 //BA.debugLineNum = 6422561;BA.debugLine="End Sub";
return "";
}
public static String  _cmenurenamefolder_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "cmenurenamefolder_action"))
	return (String) Debug.delegate(ba, "cmenurenamefolder_action", null);
String _strnewfoldername = "";
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Sub cmenuRenameFolder_Action";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="Log(explorer.SelectedItemType(False))";
anywheresoftware.b4a.keywords.Common.Log(_explorer._selecteditemtype(null,anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="If explorer.SelectedItemType(False) = \"directory\"";
if ((_explorer._selecteditemtype(null,anywheresoftware.b4a.keywords.Common.False)).equals("directory")) { 
RDebugUtils.currentLine=6029315;
 //BA.debugLineNum = 6029315;BA.debugLine="Dim strNewFolderName As String = dialogue8.TextI";
_strnewfoldername = _dialogue8._textinputdialog("Edit Folder","Rename Folder","Enter new folder name",_explorer._selecteditemvalue(null,anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=6029316;
 //BA.debugLineNum = 6029316;BA.debugLine="If strNewFolderName <> \"\" Then";
if ((_strnewfoldername).equals("") == false) { 
RDebugUtils.currentLine=6029317;
 //BA.debugLineNum = 6029317;BA.debugLine="If strNewFolderName.EqualsIgnoreCase(\"Null\") =";
if (_strnewfoldername.equalsIgnoreCase("Null")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=6029318;
 //BA.debugLineNum = 6029318;BA.debugLine="If File.IsDirectory(explorer.CurrentDirectory,";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory(_explorer._currentdirectory(null),"")==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=6029319;
 //BA.debugLineNum = 6029319;BA.debugLine="explorer.RenameFolder(explorer.CurrentDirecto";
_explorer._renamefolder(null,_explorer._currentdirectory(null),_explorer._selecteditemvalue(null,anywheresoftware.b4a.keywords.Common.False),_strnewfoldername);
RDebugUtils.currentLine=6029320;
 //BA.debugLineNum = 6029320;BA.debugLine="explorer.ReloadContents(\"\")";
_explorer._reloadcontents(null,"");
 };
 };
 };
 }else {
RDebugUtils.currentLine=6029325;
 //BA.debugLineNum = 6029325;BA.debugLine="dialogue8.WarningDialog(\"Edit Folder\", \"Selectio";
_dialogue8._warningdialog("Edit Folder","Selection Error","The selected item is not a folder.");
 };
RDebugUtils.currentLine=6029327;
 //BA.debugLineNum = 6029327;BA.debugLine="End Sub";
return "";
}
public static String  _cmenuselectedremove_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "cmenuselectedremove_action"))
	return (String) Debug.delegate(ba, "cmenuselectedremove_action", null);
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Sub cmenuSelectedRemove_Action";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="If intSelectedIndex > -1 Then";
if (_intselectedindex>-1) { 
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="mapSelectedURI.Remove(intSelectedIndex)";
_mapselecteduri.Remove((Object)(_intselectedindex));
RDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="lvSelected.Items.RemoveAt(intSelectedIndex)";
_lvselected.getItems().RemoveAt(_intselectedindex);
 };
RDebugUtils.currentLine=6291461;
 //BA.debugLineNum = 6291461;BA.debugLine="End Sub";
return "";
}
public static String  _cmenuselectedshowuri_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "cmenuselectedshowuri_action"))
	return (String) Debug.delegate(ba, "cmenuselectedshowuri_action", null);
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Sub cmenuSelectedShowURI_Action";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="If intSelectedIndex > -1 Then";
if (_intselectedindex>-1) { 
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="lblSelected.Text = mapSelectedURI.Get(intSele";
_lblselected.setText(BA.ObjectToString(_mapselecteduri.Get((Object)(_intselectedindex))));
 };
RDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="End Sub";
return "";
}
public static String  _combofolder_selectedindexchanged(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "combofolder_selectedindexchanged"))
	return (String) Debug.delegate(ba, "combofolder_selectedindexchanged", new Object[] {_index,_value});
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Sub comboFolder_SelectedIndexChanged(Index As Int,";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="If Index > -1 And Value <> \"\" Then";
if (_index>-1 && (_value).equals((Object)("")) == false) { 
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="If File.IsDirectory(comboFolder.Items.Get(Index)";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory(BA.ObjectToString(_combofolder.getItems().Get(_index)),"")==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="explorer.ReloadContents(comboFolder.Items.Get(I";
_explorer._reloadcontents(null,BA.ObjectToString(_combofolder.getItems().Get(_index)));
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="lblCurrentDirectoryName.Text = \"Exploring \" & F";
_lblcurrentdirectoryname.setText("Exploring "+anywheresoftware.b4a.keywords.Common.File.GetName(BA.ObjectToString(_combofolder.getItems().Get(_index))));
 };
 };
RDebugUtils.currentLine=5701639;
 //BA.debugLineNum = 5701639;BA.debugLine="End Sub";
return "";
}
public static String  _file_explorer_changedirectory(String _uri) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "file_explorer_changedirectory"))
	return (String) Debug.delegate(ba, "file_explorer_changedirectory", new Object[] {_uri});
boolean _booluriexists = false;
int _i = 0;
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Sub file_explorer_ChangeDirectory(Uri As String)";
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="Dim boolUriExists As Boolean = False";
_booluriexists = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="For i = 0 To comboFolder.Items.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (_combofolder.getItems().getSize()-1);
for (_i = (int) (0) ; (step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2); _i = ((int)(0 + _i + step2)) ) {
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="If comboFolder.Items.Get(i) = Uri Then";
if ((_combofolder.getItems().Get(_i)).equals((Object)(_uri))) { 
RDebugUtils.currentLine=6488069;
 //BA.debugLineNum = 6488069;BA.debugLine="boolUriExists = True";
_booluriexists = anywheresoftware.b4a.keywords.Common.True;
 };
 }
};
RDebugUtils.currentLine=6488072;
 //BA.debugLineNum = 6488072;BA.debugLine="If boolUriExists = False Then";
if (_booluriexists==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=6488073;
 //BA.debugLineNum = 6488073;BA.debugLine="comboFolder.Items.InsertAt(0, Uri)";
_combofolder.getItems().InsertAt((int) (0),(Object)(_uri));
RDebugUtils.currentLine=6488074;
 //BA.debugLineNum = 6488074;BA.debugLine="comboFolder.SelectedIndex = 0";
_combofolder.setSelectedIndex((int) (0));
 };
RDebugUtils.currentLine=6488076;
 //BA.debugLineNum = 6488076;BA.debugLine="End Sub";
return "";
}
public static String  _file_explorer_mouseclick(String _uri) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "file_explorer_mouseclick"))
	return (String) Debug.delegate(ba, "file_explorer_mouseclick", new Object[] {_uri});
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Sub file_explorer_MouseClick(Uri As String)";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="If explorer.SelectedItemValue(False) <> \"\" Then";
if ((_explorer._selecteditemvalue(null,anywheresoftware.b4a.keywords.Common.False)).equals("") == false) { 
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="lblSelected.Text = \"1Single-Click Selected: \" &";
_lblselected.setText("1Single-Click Selected: "+_explorer._selecteditemvalue(null,anywheresoftware.b4a.keywords.Common.False));
 }else {
RDebugUtils.currentLine=6356996;
 //BA.debugLineNum = 6356996;BA.debugLine="lblSelected.Text = \"No items selected. Did you c";
_lblselected.setText("No items selected. Did you change directories?");
 };
RDebugUtils.currentLine=6356998;
 //BA.debugLineNum = 6356998;BA.debugLine="End Sub";
return "";
}
public static String  _file_explorer_selectedindexchanged(int _index) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "file_explorer_selectedindexchanged"))
	return (String) Debug.delegate(ba, "file_explorer_selectedindexchanged", new Object[] {_index});
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Sub file_explorer_SelectedIndexChanged(Index As In";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="If explorer.SelectedItemValue(True) <> \"\" Then";
if ((_explorer._selecteditemvalue(null,anywheresoftware.b4a.keywords.Common.True)).equals("") == false) { 
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="lblSelected.Text = \"Double-Click Selected: \" & I";
_lblselected.setText("Double-Click Selected: "+BA.NumberToString(_index)+" is named "+_explorer._selecteditemvalue(null,anywheresoftware.b4a.keywords.Common.True));
 }else 
{RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="Else if explorer.SelectedItemValue(False) <> \"\" T";
if ((_explorer._selecteditemvalue(null,anywheresoftware.b4a.keywords.Common.False)).equals("") == false) { 
RDebugUtils.currentLine=6553604;
 //BA.debugLineNum = 6553604;BA.debugLine="lblSelected.Text = \"2Single-Click Selected: \" &";
_lblselected.setText("2Single-Click Selected: "+BA.NumberToString(_index)+" is named "+_explorer._selecteditemvalue(null,anywheresoftware.b4a.keywords.Common.False));
 }else {
RDebugUtils.currentLine=6553606;
 //BA.debugLineNum = 6553606;BA.debugLine="lblSelected.Text = \"No items selected. Did you c";
_lblselected.setText("No items selected. Did you change directories?");
 }};
RDebugUtils.currentLine=6553608;
 //BA.debugLineNum = 6553608;BA.debugLine="End Sub";
return "";
}
public static String  _lvdevice_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "lvdevice_mouseclicked"))
	return (String) Debug.delegate(ba, "lvdevice_mouseclicked", new Object[] {_eventdata});
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Sub lvDevice_MouseClicked (EventData As MouseEvent";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="explorer.MouseClicked(EventData)";
_explorer._mouseclicked(null,_eventdata);
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="End Sub";
return "";
}
public static String  _lvdevice_selectedindexchanged(int _index) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "lvdevice_selectedindexchanged"))
	return (String) Debug.delegate(ba, "lvdevice_selectedindexchanged", new Object[] {_index});
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Sub lvDevice_SelectedIndexChanged(Index As Int)";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="explorer.SelectedIndex(Index)";
_explorer._selectedindex(null,_index);
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="End Sub";
return "";
}
public static String  _lvselected_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "lvselected_mouseclicked"))
	return (String) Debug.delegate(ba, "lvselected_mouseclicked", new Object[] {_eventdata});
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Sub lvSelected_MouseClicked (EventData As MouseEve";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="If intSelectedIndex > -1 Then";
if (_intselectedindex>-1) { 
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="If EventData.ClickCount = 2 Then";
if (_eventdata.getClickCount()==2) { 
RDebugUtils.currentLine=6160387;
 //BA.debugLineNum = 6160387;BA.debugLine="lvSelected.Items.RemoveAt(intSelectedIndex)";
_lvselected.getItems().RemoveAt(_intselectedindex);
 };
 };
RDebugUtils.currentLine=6160390;
 //BA.debugLineNum = 6160390;BA.debugLine="End Sub";
return "";
}
public static String  _lvselected_selectedindexchanged(int _index) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "lvselected_selectedindexchanged"))
	return (String) Debug.delegate(ba, "lvselected_selectedindexchanged", new Object[] {_index});
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Sub lvSelected_SelectedIndexChanged(Index As Int)";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="If Index > -1 Then";
if (_index>-1) { 
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="intSelectedIndex = Index";
_intselectedindex = _index;
 }else {
RDebugUtils.currentLine=6094852;
 //BA.debugLineNum = 6094852;BA.debugLine="intSelectedIndex = -1";
_intselectedindex = (int) (-1);
 };
RDebugUtils.currentLine=6094854;
 //BA.debugLineNum = 6094854;BA.debugLine="End Sub";
return "";
}
}