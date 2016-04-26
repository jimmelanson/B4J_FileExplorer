package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,22);
if (RapidSub.canDelegate("appstart")) return main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _strinitialdirectory = RemoteObject.createImmutable("");
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 22;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="MainForm = Form1";
Debug.ShouldStop(4194304);
main._mainform = _form1;
 BA.debugLineNum = 24;BA.debugLine="MainForm.SetFormStyle(\"UNIFIED\")";
Debug.ShouldStop(8388608);
main._mainform.runVoidMethod ("SetFormStyle",(Object)(RemoteObject.createImmutable("UNIFIED")));
 BA.debugLineNum = 25;BA.debugLine="MainForm.RootPane.LoadLayout(\"mainform\") 'Load th";
Debug.ShouldStop(16777216);
main._mainform.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("mainform")));
 BA.debugLineNum = 26;BA.debugLine="MainForm.Icon = fx.LoadImage(File.DirAssets, \"fol";
Debug.ShouldStop(33554432);
main._mainform.runMethod(false,"setIcon",(main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("folder_magnify.png"))).getObject()));
 BA.debugLineNum = 27;BA.debugLine="splitMain.LoadLayout(\"mycomputer\")";
Debug.ShouldStop(67108864);
main._splitmain.runVoidMethodAndSync ("LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("mycomputer")));
 BA.debugLineNum = 28;BA.debugLine="splitMain.LoadLayout(\"selecteditems\")";
Debug.ShouldStop(134217728);
main._splitmain.runVoidMethodAndSync ("LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("selecteditems")));
 BA.debugLineNum = 30;BA.debugLine="splitMain.SetSizeLimits(0, 0, 0)";
Debug.ShouldStop(536870912);
main._splitmain.runVoidMethod ("SetSizeLimits",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 31;BA.debugLine="splitMain.SetSizeLimits(1, 0, 0)";
Debug.ShouldStop(1073741824);
main._splitmain.runVoidMethod ("SetSizeLimits",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 32;BA.debugLine="MainForm.Show";
Debug.ShouldStop(-2147483648);
main._mainform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 33;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(1);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 34;BA.debugLine="Dim strInitialDirectory As String =  jo.Initia";
Debug.ShouldStop(2);
_strinitialdirectory = BA.ObjectToString(_jo.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("javax.swing.filechooser.FileSystemView"))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getFileSystemView")),(Object)((main.__c.getField(false,"Null")))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getDefaultDirectory")),(Object)((main.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getAbsolutePath")),(Object)((main.__c.getField(false,"Null")))));Debug.locals.put("strInitialDirectory", _strinitialdirectory);Debug.locals.put("strInitialDirectory", _strinitialdirectory);
 BA.debugLineNum = 35;BA.debugLine="comboFolder.Items.Add(strInitialDirectory)";
Debug.ShouldStop(4);
main._combofolder.runMethod(false,"getItems").runVoidMethod ("Add",(Object)((_strinitialdirectory)));
 BA.debugLineNum = 36;BA.debugLine="comboFolder.SelectedIndex = 0";
Debug.ShouldStop(8);
main._combofolder.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 37;BA.debugLine="explorer.Initialize(Me, \"file_explorer\", lvDevice";
Debug.ShouldStop(16);
main._explorer.runClassMethod (b4j.example.fileexplorer.class, "_initialize",main.ba,(Object)(main.getObject()),(Object)(BA.ObjectToString("file_explorer")),(Object)(main._lvdevice),(Object)(_strinitialdirectory));
 BA.debugLineNum = 38;BA.debugLine="explorer.LoadContents";
Debug.ShouldStop(32);
main._explorer.runClassMethod (b4j.example.fileexplorer.class, "_loadcontents");
 BA.debugLineNum = 39;BA.debugLine="intSelectedIndex = -1";
Debug.ShouldStop(64);
main._intselectedindex = BA.numberCast(int.class, -(double) (0 + 1));
 BA.debugLineNum = 40;BA.debugLine="mapSelectedURI.Initialize";
Debug.ShouldStop(128);
main._mapselecteduri.runVoidMethod ("Initialize");
 BA.debugLineNum = 41;BA.debugLine="dialogue8.Initialize";
Debug.ShouldStop(256);
main._dialogue8.runVoidMethod ("_initialize",main.ba);
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmenuaddfolder_action() throws Exception{
try {
		Debug.PushSubsStack("cmenuAddFolder_Action (main) ","main",0,main.ba,main.mostCurrent,67);
if (RapidSub.canDelegate("cmenuaddfolder_action")) return main.remoteMe.runUserSub(false, "main","cmenuaddfolder_action");
RemoteObject _strnewfoldername = RemoteObject.createImmutable("");
 BA.debugLineNum = 67;BA.debugLine="Sub cmenuAddFolder_Action";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="Dim strNewFolderName As String = dialogue8.TextIn";
Debug.ShouldStop(8);
_strnewfoldername = main._dialogue8.runMethod(true,"_textinputdialog",(Object)(BA.ObjectToString("New Folder")),(Object)(BA.ObjectToString("Create New Folder")),(Object)(BA.ObjectToString("Enter folder name")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strNewFolderName", _strnewfoldername);Debug.locals.put("strNewFolderName", _strnewfoldername);
 BA.debugLineNum = 69;BA.debugLine="If strNewFolderName <> \"\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("!",_strnewfoldername,BA.ObjectToString(""))) { 
 BA.debugLineNum = 70;BA.debugLine="If strNewFolderName.EqualsIgnoreCase(\"Null\") = F";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_strnewfoldername.runMethod(true,"equalsIgnoreCase",(Object)(RemoteObject.createImmutable("Null"))),main.__c.getField(true,"False"))) { 
 BA.debugLineNum = 71;BA.debugLine="If File.IsDirectory(explorer.CurrentDirectory,";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",main.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(main._explorer.runClassMethod (b4j.example.fileexplorer.class, "_currentdirectory")),(Object)(RemoteObject.createImmutable(""))),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 72;BA.debugLine="File.MakeDir(explorer.CurrentDirectory, strNew";
Debug.ShouldStop(128);
main.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(main._explorer.runClassMethod (b4j.example.fileexplorer.class, "_currentdirectory")),(Object)(_strnewfoldername));
 BA.debugLineNum = 73;BA.debugLine="explorer.ReloadContents(\"\")";
Debug.ShouldStop(256);
main._explorer.runClassMethod (b4j.example.fileexplorer.class, "_reloadcontents",(Object)(RemoteObject.createImmutable("")));
 };
 };
 };
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmenuaddtoselectedlist_action() throws Exception{
try {
		Debug.PushSubsStack("cmenuAddToSelectedList_Action (main) ","main",0,main.ba,main.mostCurrent,63);
if (RapidSub.canDelegate("cmenuaddtoselectedlist_action")) return main.remoteMe.runUserSub(false, "main","cmenuaddtoselectedlist_action");
 BA.debugLineNum = 63;BA.debugLine="Sub cmenuAddToSelectedList_Action";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="file_explorer_DoubleClick(explorer.SelectedItemUR";
Debug.ShouldStop(-2147483648);
_file_explorer_doubleclick(main._explorer.runClassMethod (b4j.example.fileexplorer.class, "_selecteditemuri",(Object)(main.__c.getField(true,"False"))));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmenurenamefolder_action() throws Exception{
try {
		Debug.PushSubsStack("cmenuRenameFolder_Action (main) ","main",0,main.ba,main.mostCurrent,79);
if (RapidSub.canDelegate("cmenurenamefolder_action")) return main.remoteMe.runUserSub(false, "main","cmenurenamefolder_action");
RemoteObject _strnewfoldername = RemoteObject.createImmutable("");
 BA.debugLineNum = 79;BA.debugLine="Sub cmenuRenameFolder_Action";
Debug.ShouldStop(16384);
 BA.debugLineNum = 80;BA.debugLine="Log(explorer.SelectedItemType(False))";
Debug.ShouldStop(32768);
main.__c.runVoidMethod ("Log",(Object)(main._explorer.runClassMethod (b4j.example.fileexplorer.class, "_selecteditemtype",(Object)(main.__c.getField(true,"False")))));
 BA.debugLineNum = 81;BA.debugLine="If explorer.SelectedItemType(False) = \"directory\"";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",main._explorer.runClassMethod (b4j.example.fileexplorer.class, "_selecteditemtype",(Object)(main.__c.getField(true,"False"))),BA.ObjectToString("directory"))) { 
 BA.debugLineNum = 82;BA.debugLine="Dim strNewFolderName As String = dialogue8.TextI";
Debug.ShouldStop(131072);
_strnewfoldername = main._dialogue8.runMethod(true,"_textinputdialog",(Object)(BA.ObjectToString("Edit Folder")),(Object)(BA.ObjectToString("Rename Folder")),(Object)(BA.ObjectToString("Enter new folder name")),(Object)(main._explorer.runClassMethod (b4j.example.fileexplorer.class, "_selecteditemvalue",(Object)(main.__c.getField(true,"False")))));Debug.locals.put("strNewFolderName", _strnewfoldername);Debug.locals.put("strNewFolderName", _strnewfoldername);
 BA.debugLineNum = 83;BA.debugLine="If strNewFolderName <> \"\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("!",_strnewfoldername,BA.ObjectToString(""))) { 
 BA.debugLineNum = 84;BA.debugLine="If strNewFolderName.EqualsIgnoreCase(\"Null\") =";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_strnewfoldername.runMethod(true,"equalsIgnoreCase",(Object)(RemoteObject.createImmutable("Null"))),main.__c.getField(true,"False"))) { 
 BA.debugLineNum = 85;BA.debugLine="If File.IsDirectory(explorer.CurrentDirectory,";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",main.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(main._explorer.runClassMethod (b4j.example.fileexplorer.class, "_currentdirectory")),(Object)(RemoteObject.createImmutable(""))),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 86;BA.debugLine="explorer.RenameFolder(explorer.CurrentDirecto";
Debug.ShouldStop(2097152);
main._explorer.runClassMethod (b4j.example.fileexplorer.class, "_renamefolder",(Object)(main._explorer.runClassMethod (b4j.example.fileexplorer.class, "_currentdirectory")),(Object)(main._explorer.runClassMethod (b4j.example.fileexplorer.class, "_selecteditemvalue",(Object)(main.__c.getField(true,"False")))),(Object)(_strnewfoldername));
 BA.debugLineNum = 87;BA.debugLine="explorer.ReloadContents(\"\")";
Debug.ShouldStop(4194304);
main._explorer.runClassMethod (b4j.example.fileexplorer.class, "_reloadcontents",(Object)(RemoteObject.createImmutable("")));
 };
 };
 };
 }else {
 BA.debugLineNum = 92;BA.debugLine="dialogue8.WarningDialog(\"Edit Folder\", \"Selectio";
Debug.ShouldStop(134217728);
main._dialogue8.runVoidMethod ("_warningdialog",(Object)(BA.ObjectToString("Edit Folder")),(Object)(BA.ObjectToString("Selection Error")),(Object)(RemoteObject.createImmutable("The selected item is not a folder.")));
 };
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmenuselectedremove_action() throws Exception{
try {
		Debug.PushSubsStack("cmenuSelectedRemove_Action (main) ","main",0,main.ba,main.mostCurrent,126);
if (RapidSub.canDelegate("cmenuselectedremove_action")) return main.remoteMe.runUserSub(false, "main","cmenuselectedremove_action");
 BA.debugLineNum = 126;BA.debugLine="Sub cmenuSelectedRemove_Action";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 127;BA.debugLine="If intSelectedIndex > -1 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",main._intselectedindex,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 128;BA.debugLine="mapSelectedURI.Remove(intSelectedIndex)";
Debug.ShouldStop(-2147483648);
main._mapselecteduri.runVoidMethod ("Remove",(Object)((main._intselectedindex)));
 BA.debugLineNum = 129;BA.debugLine="lvSelected.Items.RemoveAt(intSelectedIndex)";
Debug.ShouldStop(1);
main._lvselected.runMethod(false,"getItems").runVoidMethod ("RemoveAt",(Object)(main._intselectedindex));
 };
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmenuselectedshowuri_action() throws Exception{
try {
		Debug.PushSubsStack("cmenuSelectedShowURI_Action (main) ","main",0,main.ba,main.mostCurrent,120);
if (RapidSub.canDelegate("cmenuselectedshowuri_action")) return main.remoteMe.runUserSub(false, "main","cmenuselectedshowuri_action");
 BA.debugLineNum = 120;BA.debugLine="Sub cmenuSelectedShowURI_Action";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 121;BA.debugLine="If intSelectedIndex > -1 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",main._intselectedindex,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 122;BA.debugLine="lblSelected.Text = mapSelectedURI.Get(intSele";
Debug.ShouldStop(33554432);
main._lblselected.runMethod(true,"setText",BA.ObjectToString(main._mapselecteduri.runMethod(false,"Get",(Object)((main._intselectedindex)))));
 };
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _combofolder_selectedindexchanged(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("comboFolder_SelectedIndexChanged (main) ","main",0,main.ba,main.mostCurrent,44);
if (RapidSub.canDelegate("combofolder_selectedindexchanged")) return main.remoteMe.runUserSub(false, "main","combofolder_selectedindexchanged", _index, _value);
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 44;BA.debugLine="Sub comboFolder_SelectedIndexChanged(Index As Int,";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="If Index > -1 And Value <> \"\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",_index,BA.numberCast(double.class, -(double) (0 + 1))) && RemoteObject.solveBoolean("!",_value,RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 46;BA.debugLine="If File.IsDirectory(comboFolder.Items.Get(Index)";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",main.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(BA.ObjectToString(main._combofolder.runMethod(false,"getItems").runMethod(false,"Get",(Object)(_index)))),(Object)(RemoteObject.createImmutable(""))),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 47;BA.debugLine="explorer.ReloadContents(comboFolder.Items.Get(I";
Debug.ShouldStop(16384);
main._explorer.runClassMethod (b4j.example.fileexplorer.class, "_reloadcontents",(Object)(BA.ObjectToString(main._combofolder.runMethod(false,"getItems").runMethod(false,"Get",(Object)(_index)))));
 BA.debugLineNum = 48;BA.debugLine="lblCurrentDirectoryName.Text = \"Exploring \" & F";
Debug.ShouldStop(32768);
main._lblcurrentdirectoryname.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Exploring "),main.__c.getField(false,"File").runMethod(true,"GetName",(Object)(BA.ObjectToString(main._combofolder.runMethod(false,"getItems").runMethod(false,"Get",(Object)(_index)))))));
 };
 };
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _file_explorer_changedirectory(RemoteObject _uri) throws Exception{
try {
		Debug.PushSubsStack("file_explorer_ChangeDirectory (main) ","main",0,main.ba,main.mostCurrent,184);
if (RapidSub.canDelegate("file_explorer_changedirectory")) return main.remoteMe.runUserSub(false, "main","file_explorer_changedirectory", _uri);
RemoteObject _booluriexists = RemoteObject.createImmutable(false);
int _i = 0;
Debug.locals.put("Uri", _uri);
 BA.debugLineNum = 184;BA.debugLine="Sub file_explorer_ChangeDirectory(Uri As String)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 186;BA.debugLine="Dim boolUriExists As Boolean = False";
Debug.ShouldStop(33554432);
_booluriexists = main.__c.getField(true,"False");Debug.locals.put("boolUriExists", _booluriexists);Debug.locals.put("boolUriExists", _booluriexists);
 BA.debugLineNum = 187;BA.debugLine="For i = 0 To comboFolder.Items.Size - 1";
Debug.ShouldStop(67108864);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {main._combofolder.runMethod(false,"getItems").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2); _i = ((int)(0 + _i + step2)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 188;BA.debugLine="If comboFolder.Items.Get(i) = Uri Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",main._combofolder.runMethod(false,"getItems").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))),(_uri))) { 
 BA.debugLineNum = 189;BA.debugLine="boolUriExists = True";
Debug.ShouldStop(268435456);
_booluriexists = main.__c.getField(true,"True");Debug.locals.put("boolUriExists", _booluriexists);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 192;BA.debugLine="If boolUriExists = False Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_booluriexists,main.__c.getField(true,"False"))) { 
 BA.debugLineNum = 193;BA.debugLine="comboFolder.Items.InsertAt(0, Uri)";
Debug.ShouldStop(1);
main._combofolder.runMethod(false,"getItems").runVoidMethod ("InsertAt",(Object)(BA.numberCast(int.class, 0)),(Object)((_uri)));
 BA.debugLineNum = 194;BA.debugLine="comboFolder.SelectedIndex = 0";
Debug.ShouldStop(2);
main._combofolder.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 };
 BA.debugLineNum = 196;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _file_explorer_doubleclick(RemoteObject _uri) throws Exception{
try {
		Debug.PushSubsStack("file_explorer_DoubleClick (main) ","main",0,main.ba,main.mostCurrent,149);
if (RapidSub.canDelegate("file_explorer_doubleclick")) return main.remoteMe.runUserSub(false, "main","file_explorer_doubleclick", _uri);
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper");
RemoteObject _im = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
RemoteObject _lblthis = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
Debug.locals.put("Uri", _uri);
 BA.debugLineNum = 149;BA.debugLine="Sub file_explorer_DoubleClick(Uri As String)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 150;BA.debugLine="Log(\"dc uri: \" & Uri)";
Debug.ShouldStop(2097152);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("dc uri: "),_uri)));
 BA.debugLineNum = 151;BA.debugLine="If File.IsDirectory(Uri, \"\") = True Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",main.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(_uri),(Object)(RemoteObject.createImmutable(""))),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 152;BA.debugLine="Dim a As AnchorPane";
Debug.ShouldStop(8388608);
_a = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 153;BA.debugLine="a.Initialize(\"DeviceAnchorPane\")";
Debug.ShouldStop(16777216);
_a.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("DeviceAnchorPane")));
 BA.debugLineNum = 154;BA.debugLine="Dim im As ImageView";
Debug.ShouldStop(33554432);
_im = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");Debug.locals.put("im", _im);
 BA.debugLineNum = 155;BA.debugLine="im.Initialize(\"DeviceIcon\")";
Debug.ShouldStop(67108864);
_im.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("DeviceIcon")));
 BA.debugLineNum = 156;BA.debugLine="im.SetImage(fx.LoadImage(File.DirAssets, \"folder";
Debug.ShouldStop(134217728);
_im.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("folder.png"))).getObject())));
 BA.debugLineNum = 157;BA.debugLine="a.AddNode(im, 0, 0, 16, 16)";
Debug.ShouldStop(268435456);
_a.runVoidMethod ("AddNode",(Object)((_im.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 16)),(Object)(BA.numberCast(double.class, 16)));
 BA.debugLineNum = 158;BA.debugLine="Dim lblThis As Label";
Debug.ShouldStop(536870912);
_lblthis = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lblThis", _lblthis);
 BA.debugLineNum = 159;BA.debugLine="lblThis.Initialize(\"DeviceList\")";
Debug.ShouldStop(1073741824);
_lblthis.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("DeviceList")));
 BA.debugLineNum = 160;BA.debugLine="lblThis.Text = File.GetName(Uri)";
Debug.ShouldStop(-2147483648);
_lblthis.runMethod(true,"setText",main.__c.getField(false,"File").runMethod(true,"GetName",(Object)(_uri)));
 BA.debugLineNum = 161;BA.debugLine="a.AddNode(lblThis, 18, 0, -1, -1)";
Debug.ShouldStop(1);
_a.runVoidMethod ("AddNode",(Object)((_lblthis.getObject())),(Object)(BA.numberCast(double.class, 18)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, -(double) (0 + 1))),(Object)(BA.numberCast(double.class, -(double) (0 + 1))));
 BA.debugLineNum = 162;BA.debugLine="lvSelected.Items.Add(a)";
Debug.ShouldStop(2);
main._lvselected.runMethod(false,"getItems").runVoidMethod ("Add",(Object)((_a.getObject())));
 BA.debugLineNum = 165;BA.debugLine="mapSelectedURI.Put(lvSelected.Items.IndexOf(a),";
Debug.ShouldStop(16);
main._mapselecteduri.runVoidMethod ("Put",(Object)((main._lvselected.runMethod(false,"getItems").runMethod(true,"IndexOf",(Object)((_a.getObject()))))),(Object)((_uri)));
 }else {
 BA.debugLineNum = 167;BA.debugLine="Dim a As AnchorPane";
Debug.ShouldStop(64);
_a = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 168;BA.debugLine="a.Initialize(\"DeviceAnchorPane\")";
Debug.ShouldStop(128);
_a.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("DeviceAnchorPane")));
 BA.debugLineNum = 169;BA.debugLine="Dim im As ImageView";
Debug.ShouldStop(256);
_im = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");Debug.locals.put("im", _im);
 BA.debugLineNum = 170;BA.debugLine="im.Initialize(\"\")";
Debug.ShouldStop(512);
_im.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 171;BA.debugLine="im.SetImage(explorer.GetFileIcon(File.GetFilePar";
Debug.ShouldStop(1024);
_im.runVoidMethod ("SetImage",(Object)((main._explorer.runClassMethod (b4j.example.fileexplorer.class, "_getfileicon",(Object)(main.__c.getField(false,"File").runMethod(true,"GetFileParent",(Object)(_uri))),(Object)(main.__c.getField(false,"File").runMethod(true,"GetName",(Object)(_uri)))).getObject())));
 BA.debugLineNum = 172;BA.debugLine="a.AddNode(im, 0, 0, 16, 16)";
Debug.ShouldStop(2048);
_a.runVoidMethod ("AddNode",(Object)((_im.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 16)),(Object)(BA.numberCast(double.class, 16)));
 BA.debugLineNum = 173;BA.debugLine="Dim lblThis As Label";
Debug.ShouldStop(4096);
_lblthis = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lblThis", _lblthis);
 BA.debugLineNum = 174;BA.debugLine="lblThis.Initialize(\"\")";
Debug.ShouldStop(8192);
_lblthis.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 175;BA.debugLine="lblThis.Text = File.GetName(Uri)";
Debug.ShouldStop(16384);
_lblthis.runMethod(true,"setText",main.__c.getField(false,"File").runMethod(true,"GetName",(Object)(_uri)));
 BA.debugLineNum = 176;BA.debugLine="a.AddNode(lblThis, 18, 0, -1, -1)";
Debug.ShouldStop(32768);
_a.runVoidMethod ("AddNode",(Object)((_lblthis.getObject())),(Object)(BA.numberCast(double.class, 18)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, -(double) (0 + 1))),(Object)(BA.numberCast(double.class, -(double) (0 + 1))));
 BA.debugLineNum = 177;BA.debugLine="lvSelected.Items.Add(a)";
Debug.ShouldStop(65536);
main._lvselected.runMethod(false,"getItems").runVoidMethod ("Add",(Object)((_a.getObject())));
 BA.debugLineNum = 180;BA.debugLine="mapSelectedURI.Put(lvSelected.Items.IndexOf(a),";
Debug.ShouldStop(524288);
main._mapselecteduri.runVoidMethod ("Put",(Object)((main._lvselected.runMethod(false,"getItems").runMethod(true,"IndexOf",(Object)((_a.getObject()))))),(Object)((_uri)));
 };
 BA.debugLineNum = 182;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _file_explorer_mouseclick(RemoteObject _uri) throws Exception{
try {
		Debug.PushSubsStack("file_explorer_MouseClick (main) ","main",0,main.ba,main.mostCurrent,141);
if (RapidSub.canDelegate("file_explorer_mouseclick")) return main.remoteMe.runUserSub(false, "main","file_explorer_mouseclick", _uri);
Debug.locals.put("Uri", _uri);
 BA.debugLineNum = 141;BA.debugLine="Sub file_explorer_MouseClick(Uri As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 142;BA.debugLine="If explorer.SelectedItemValue(False) <> \"\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("!",main._explorer.runClassMethod (b4j.example.fileexplorer.class, "_selecteditemvalue",(Object)(main.__c.getField(true,"False"))),BA.ObjectToString(""))) { 
 BA.debugLineNum = 143;BA.debugLine="lblSelected.Text = \"1Single-Click Selected: \" &";
Debug.ShouldStop(16384);
main._lblselected.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("1Single-Click Selected: "),main._explorer.runClassMethod (b4j.example.fileexplorer.class, "_selecteditemvalue",(Object)(main.__c.getField(true,"False")))));
 }else {
 BA.debugLineNum = 145;BA.debugLine="lblSelected.Text = \"No items selected. Did you c";
Debug.ShouldStop(65536);
main._lblselected.runMethod(true,"setText",BA.ObjectToString("No items selected. Did you change directories?"));
 };
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _file_explorer_selectedindexchanged(RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("file_explorer_SelectedIndexChanged (main) ","main",0,main.ba,main.mostCurrent,198);
if (RapidSub.canDelegate("file_explorer_selectedindexchanged")) return main.remoteMe.runUserSub(false, "main","file_explorer_selectedindexchanged", _index);
Debug.locals.put("Index", _index);
 BA.debugLineNum = 198;BA.debugLine="Sub file_explorer_SelectedIndexChanged(Index As In";
Debug.ShouldStop(32);
 BA.debugLineNum = 199;BA.debugLine="If explorer.SelectedItemValue(True) <> \"\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("!",main._explorer.runClassMethod (b4j.example.fileexplorer.class, "_selecteditemvalue",(Object)(main.__c.getField(true,"True"))),BA.ObjectToString(""))) { 
 BA.debugLineNum = 200;BA.debugLine="lblSelected.Text = \"Double-Click Selected: \" & I";
Debug.ShouldStop(128);
main._lblselected.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Double-Click Selected: "),_index,RemoteObject.createImmutable(" is named "),main._explorer.runClassMethod (b4j.example.fileexplorer.class, "_selecteditemvalue",(Object)(main.__c.getField(true,"True")))));
 }else 
{ BA.debugLineNum = 201;BA.debugLine="Else if explorer.SelectedItemValue(False) <> \"\" T";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("!",main._explorer.runClassMethod (b4j.example.fileexplorer.class, "_selecteditemvalue",(Object)(main.__c.getField(true,"False"))),BA.ObjectToString(""))) { 
 BA.debugLineNum = 202;BA.debugLine="lblSelected.Text = \"2Single-Click Selected: \" &";
Debug.ShouldStop(512);
main._lblselected.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("2Single-Click Selected: "),_index,RemoteObject.createImmutable(" is named "),main._explorer.runClassMethod (b4j.example.fileexplorer.class, "_selecteditemvalue",(Object)(main.__c.getField(true,"False")))));
 }else {
 BA.debugLineNum = 204;BA.debugLine="lblSelected.Text = \"No items selected. Did you c";
Debug.ShouldStop(2048);
main._lblselected.runMethod(true,"setText",BA.ObjectToString("No items selected. Did you change directories?"));
 }};
 BA.debugLineNum = 206;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lvdevice_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lvDevice_MouseClicked (main) ","main",0,main.ba,main.mostCurrent,54);
if (RapidSub.canDelegate("lvdevice_mouseclicked")) return main.remoteMe.runUserSub(false, "main","lvdevice_mouseclicked", _eventdata);
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 54;BA.debugLine="Sub lvDevice_MouseClicked (EventData As MouseEvent";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="explorer.MouseClicked(EventData)";
Debug.ShouldStop(4194304);
main._explorer.runClassMethod (b4j.example.fileexplorer.class, "_mouseclicked",(Object)(_eventdata));
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lvdevice_selectedindexchanged(RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("lvDevice_SelectedIndexChanged (main) ","main",0,main.ba,main.mostCurrent,59);
if (RapidSub.canDelegate("lvdevice_selectedindexchanged")) return main.remoteMe.runUserSub(false, "main","lvdevice_selectedindexchanged", _index);
Debug.locals.put("Index", _index);
 BA.debugLineNum = 59;BA.debugLine="Sub lvDevice_SelectedIndexChanged(Index As Int)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="explorer.SelectedIndex(Index)";
Debug.ShouldStop(134217728);
main._explorer.runClassMethod (b4j.example.fileexplorer.class, "_selectedindex",(Object)(_index));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lvselected_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lvSelected_MouseClicked (main) ","main",0,main.ba,main.mostCurrent,111);
if (RapidSub.canDelegate("lvselected_mouseclicked")) return main.remoteMe.runUserSub(false, "main","lvselected_mouseclicked", _eventdata);
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 111;BA.debugLine="Sub lvSelected_MouseClicked (EventData As MouseEve";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="If intSelectedIndex > -1 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",main._intselectedindex,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 113;BA.debugLine="If EventData.ClickCount = 2 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_eventdata.runMethod(true,"getClickCount"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 114;BA.debugLine="lvSelected.Items.RemoveAt(intSelectedIndex)";
Debug.ShouldStop(131072);
main._lvselected.runMethod(false,"getItems").runVoidMethod ("RemoveAt",(Object)(main._intselectedindex));
 };
 };
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lvselected_selectedindexchanged(RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("lvSelected_SelectedIndexChanged (main) ","main",0,main.ba,main.mostCurrent,103);
if (RapidSub.canDelegate("lvselected_selectedindexchanged")) return main.remoteMe.runUserSub(false, "main","lvselected_selectedindexchanged", _index);
Debug.locals.put("Index", _index);
 BA.debugLineNum = 103;BA.debugLine="Sub lvSelected_SelectedIndexChanged(Index As Int)";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="If Index > -1 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",_index,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 105;BA.debugLine="intSelectedIndex = Index";
Debug.ShouldStop(256);
main._intselectedindex = _index;
 }else {
 BA.debugLineNum = 107;BA.debugLine="intSelectedIndex = -1";
Debug.ShouldStop(1024);
main._intselectedindex = BA.numberCast(int.class, -(double) (0 + 1));
 };
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
fileexplorer.myClass = BA.getDeviceClass ("b4j.example.fileexplorer");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 9;BA.debugLine="Private MainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 10;BA.debugLine="Private explorer As FileExplorer";
main._explorer = RemoteObject.createNew ("b4j.example.fileexplorer");
 //BA.debugLineNum = 11;BA.debugLine="Private lvSelected As ListView";
main._lvselected = RemoteObject.createNew ("anywheresoftware.b4j.objects.ListViewWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Private lvDevice As ListView";
main._lvdevice = RemoteObject.createNew ("anywheresoftware.b4j.objects.ListViewWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Private lblSelected As Label";
main._lblselected = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private intSelectedIndex As Int";
main._intselectedindex = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 15;BA.debugLine="Private mapSelectedURI As Map";
main._mapselecteduri = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 16;BA.debugLine="Private dialogue8 As Dialogs8";
main._dialogue8 = RemoteObject.createNew ("b4j.example.dialogs8");
 //BA.debugLineNum = 17;BA.debugLine="Private splitMain As SplitPane";
main._splitmain = RemoteObject.createNew ("anywheresoftware.b4j.objects.SplitPaneWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private comboFolder As ComboBox";
main._combofolder = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private lblCurrentDirectoryName As Label";
main._lblcurrentdirectoryname = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}