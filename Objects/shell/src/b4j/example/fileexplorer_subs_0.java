package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class fileexplorer_subs_0 {


public static RemoteObject  _change_directory(RemoteObject __ref,RemoteObject _strnewdirectory) throws Exception{
try {
		Debug.PushSubsStack("change_directory (fileexplorer) ","fileexplorer",1,__ref.getField(false, "ba"),__ref,319);
if (RapidSub.canDelegate("change_directory")) return __ref.runUserSub(false, "fileexplorer","change_directory", __ref, _strnewdirectory);
Debug.locals.put("strNewDirectory", _strnewdirectory);
 BA.debugLineNum = 319;BA.debugLine="Private Sub change_directory(strNewDirectory As St";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 320;BA.debugLine="If File.IsDirectory(strNewDirectory, \"\") = True T";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",fileexplorer.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(_strnewdirectory),(Object)(RemoteObject.createImmutable(""))),fileexplorer.__c.getField(true,"True"))) { 
 BA.debugLineNum = 321;BA.debugLine="generate_directory_content_list(strNewDirectory)";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.fileexplorer.class, "_generate_directory_content_list",(Object)(_strnewdirectory));
 BA.debugLineNum = 322;BA.debugLine="LoadContents";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.fileexplorer.class, "_loadcontents");
 };
 BA.debugLineNum = 324;BA.debugLine="End Sub";
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 31;BA.debugLine="Private fx As JFX";
fileexplorer._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",fileexplorer._fx);
 //BA.debugLineNum = 32;BA.debugLine="Private f As FileChooser";
fileexplorer._f = RemoteObject.createNew ("anywheresoftware.b4j.objects.FileChooserWrapper");__ref.setField("_f",fileexplorer._f);
 //BA.debugLineNum = 33;BA.debugLine="Private MyComputerListView As ListView";
fileexplorer._mycomputerlistview = RemoteObject.createNew ("anywheresoftware.b4j.objects.ListViewWrapper");__ref.setField("_mycomputerlistview",fileexplorer._mycomputerlistview);
 //BA.debugLineNum = 34;BA.debugLine="Private strThisDirectoryURI As String";
fileexplorer._strthisdirectoryuri = RemoteObject.createImmutable("");__ref.setField("_strthisdirectoryuri",fileexplorer._strthisdirectoryuri);
 //BA.debugLineNum = 35;BA.debugLine="Private listThisDirectoryContents As List";
fileexplorer._listthisdirectorycontents = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_listthisdirectorycontents",fileexplorer._listthisdirectorycontents);
 //BA.debugLineNum = 36;BA.debugLine="Private listThisDirectoryDirs As List";
fileexplorer._listthisdirectorydirs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_listthisdirectorydirs",fileexplorer._listthisdirectorydirs);
 //BA.debugLineNum = 37;BA.debugLine="Private listThisDirectoryFiles As List";
fileexplorer._listthisdirectoryfiles = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_listthisdirectoryfiles",fileexplorer._listthisdirectoryfiles);
 //BA.debugLineNum = 38;BA.debugLine="Private intLastSelectedIndex As Int";
fileexplorer._intlastselectedindex = RemoteObject.createImmutable(0);__ref.setField("_intlastselectedindex",fileexplorer._intlastselectedindex);
 //BA.debugLineNum = 40;BA.debugLine="Private strSingleClickSelectedItemType As String";
fileexplorer._strsingleclickselecteditemtype = RemoteObject.createImmutable("");__ref.setField("_strsingleclickselecteditemtype",fileexplorer._strsingleclickselecteditemtype);
 //BA.debugLineNum = 41;BA.debugLine="Private strSingleClickSelectedItemValue As String";
fileexplorer._strsingleclickselecteditemvalue = RemoteObject.createImmutable("");__ref.setField("_strsingleclickselecteditemvalue",fileexplorer._strsingleclickselecteditemvalue);
 //BA.debugLineNum = 42;BA.debugLine="Private strSingleClickSelectedItemURI As String";
fileexplorer._strsingleclickselecteditemuri = RemoteObject.createImmutable("");__ref.setField("_strsingleclickselecteditemuri",fileexplorer._strsingleclickselecteditemuri);
 //BA.debugLineNum = 44;BA.debugLine="Private strDblClickSelectedItemType As String";
fileexplorer._strdblclickselecteditemtype = RemoteObject.createImmutable("");__ref.setField("_strdblclickselecteditemtype",fileexplorer._strdblclickselecteditemtype);
 //BA.debugLineNum = 45;BA.debugLine="Private strDblClickSelectedItemValue As String";
fileexplorer._strdblclickselecteditemvalue = RemoteObject.createImmutable("");__ref.setField("_strdblclickselecteditemvalue",fileexplorer._strdblclickselecteditemvalue);
 //BA.debugLineNum = 46;BA.debugLine="Private strDblClickSelectedItemURI As String";
fileexplorer._strdblclickselecteditemuri = RemoteObject.createImmutable("");__ref.setField("_strdblclickselecteditemuri",fileexplorer._strdblclickselecteditemuri);
 //BA.debugLineNum = 48;BA.debugLine="Private DefaultImage As Image";
fileexplorer._defaultimage = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");__ref.setField("_defaultimage",fileexplorer._defaultimage);
 //BA.debugLineNum = 49;BA.debugLine="Private JO As JavaObject";
fileexplorer._jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_jo",fileexplorer._jo);
 //BA.debugLineNum = 50;BA.debugLine="Private mModule As Object";
fileexplorer._mmodule = RemoteObject.createNew ("Object");__ref.setField("_mmodule",fileexplorer._mmodule);
 //BA.debugLineNum = 51;BA.debugLine="Private mEventName As String";
fileexplorer._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",fileexplorer._meventname);
 //BA.debugLineNum = 52;BA.debugLine="Private ListenerIndexChange As Object";
fileexplorer._listenerindexchange = RemoteObject.createNew ("Object");__ref.setField("_listenerindexchange",fileexplorer._listenerindexchange);
 //BA.debugLineNum = 53;BA.debugLine="Private ListenerDblClick As Object";
fileexplorer._listenerdblclick = RemoteObject.createNew ("Object");__ref.setField("_listenerdblclick",fileexplorer._listenerdblclick);
 //BA.debugLineNum = 54;BA.debugLine="Private ListenerMouseClick As Object";
fileexplorer._listenermouseclick = RemoteObject.createNew ("Object");__ref.setField("_listenermouseclick",fileexplorer._listenermouseclick);
 //BA.debugLineNum = 55;BA.debugLine="Private ListenerChangeDirectory As Object";
fileexplorer._listenerchangedirectory = RemoteObject.createNew ("Object");__ref.setField("_listenerchangedirectory",fileexplorer._listenerchangedirectory);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _currentdirectory(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CurrentDirectory (fileexplorer) ","fileexplorer",1,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("currentdirectory")) return __ref.runUserSub(false, "fileexplorer","currentdirectory", __ref);
 BA.debugLineNum = 104;BA.debugLine="Public Sub CurrentDirectory As String";
Debug.ShouldStop(128);
 BA.debugLineNum = 105;BA.debugLine="Return strThisDirectoryURI";
Debug.ShouldStop(256);
if (true) return __ref.getField(true,"_strthisdirectoryuri");
 BA.debugLineNum = 106;BA.debugLine="End Sub";
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
public static RemoteObject  _fileicon_to_image(RemoteObject __ref,RemoteObject _img) throws Exception{
try {
		Debug.PushSubsStack("fileicon_to_image (fileexplorer) ","fileexplorer",1,__ref.getField(false, "ba"),__ref,314);
if (RapidSub.canDelegate("fileicon_to_image")) return __ref.runUserSub(false, "fileexplorer","fileicon_to_image", __ref, _img);
Debug.locals.put("img", _img);
 BA.debugLineNum = 314;BA.debugLine="Private Sub fileicon_to_image(img As JavaObject) A";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 315;BA.debugLine="Dim JO As JavaObject";
Debug.ShouldStop(67108864);
fileexplorer._jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_jo",fileexplorer._jo);
 BA.debugLineNum = 316;BA.debugLine="Return JO.InitializeStatic(\"javafx.embed.swing.Sw";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper"), __ref.getField(false,"_jo").runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("javafx.embed.swing.SwingFXUtils"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("toFXImage")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_img.getObject()),fileexplorer.__c.getField(false,"Null")}))));
 BA.debugLineNum = 317;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _generate_directory_content_list(RemoteObject __ref,RemoteObject _dir) throws Exception{
try {
		Debug.PushSubsStack("generate_directory_content_list (fileexplorer) ","fileexplorer",1,__ref.getField(false, "ba"),__ref,326);
if (RapidSub.canDelegate("generate_directory_content_list")) return __ref.runUserSub(false, "fileexplorer","generate_directory_content_list", __ref, _dir);
int _i = 0;
RemoteObject _strfile = RemoteObject.createImmutable("");
Debug.locals.put("Dir", _dir);
 BA.debugLineNum = 326;BA.debugLine="Private Sub generate_directory_content_list(Dir As";
Debug.ShouldStop(32);
 BA.debugLineNum = 327;BA.debugLine="strThisDirectoryURI = Dir";
Debug.ShouldStop(64);
__ref.setField ("_strthisdirectoryuri",_dir);
 BA.debugLineNum = 328;BA.debugLine="If File.IsDirectory(strThisDirectoryURI, \"\") = Tr";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",fileexplorer.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(__ref.getField(true,"_strthisdirectoryuri")),(Object)(RemoteObject.createImmutable(""))),fileexplorer.__c.getField(true,"True"))) { 
 BA.debugLineNum = 329;BA.debugLine="listThisDirectoryDirs.Clear";
Debug.ShouldStop(256);
__ref.getField(false,"_listthisdirectorydirs").runVoidMethod ("Clear");
 BA.debugLineNum = 330;BA.debugLine="listThisDirectoryFiles.Clear";
Debug.ShouldStop(512);
__ref.getField(false,"_listthisdirectoryfiles").runVoidMethod ("Clear");
 BA.debugLineNum = 331;BA.debugLine="listThisDirectoryContents = File.ListFiles(strTh";
Debug.ShouldStop(1024);
__ref.setField ("_listthisdirectorycontents",fileexplorer.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(__ref.getField(true,"_strthisdirectoryuri"))));
 BA.debugLineNum = 332;BA.debugLine="If listThisDirectoryContents.IsInitialized = Tru";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_listthisdirectorycontents").runMethod(true,"IsInitialized"),fileexplorer.__c.getField(true,"True"))) { 
 BA.debugLineNum = 333;BA.debugLine="For i = 0 To listThisDirectoryContents.Size - 1";
Debug.ShouldStop(4096);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_listthisdirectorycontents").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7); _i = ((int)(0 + _i + step7)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 334;BA.debugLine="Dim strFile As String = File.GetName(listThisD";
Debug.ShouldStop(8192);
_strfile = fileexplorer.__c.getField(false,"File").runMethod(true,"GetName",(Object)(BA.ObjectToString(__ref.getField(false,"_listthisdirectorycontents").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));Debug.locals.put("strFile", _strfile);Debug.locals.put("strFile", _strfile);
 BA.debugLineNum = 335;BA.debugLine="If File.IsDirectory(strThisDirectoryURI, strFi";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",fileexplorer.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(__ref.getField(true,"_strthisdirectoryuri")),(Object)(_strfile)),fileexplorer.__c.getField(true,"True"))) { 
 BA.debugLineNum = 336;BA.debugLine="listThisDirectoryDirs.Add(strFile)";
Debug.ShouldStop(32768);
__ref.getField(false,"_listthisdirectorydirs").runVoidMethod ("Add",(Object)((_strfile)));
 }else {
 BA.debugLineNum = 338;BA.debugLine="listThisDirectoryFiles.Add(strFile)";
Debug.ShouldStop(131072);
__ref.getField(false,"_listthisdirectoryfiles").runVoidMethod ("Add",(Object)((_strfile)));
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 342;BA.debugLine="If SubExists(mModule, mEventName&\"_ChangeDirecto";
Debug.ShouldStop(2097152);
if (fileexplorer.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mmodule")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_ChangeDirectory")))).<Boolean>get().booleanValue()) { 
fileexplorer.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mmodule")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_ChangeDirectory"))),(Object)((__ref.getField(true,"_strthisdirectoryuri"))));};
 };
 BA.debugLineNum = 344;BA.debugLine="If listThisDirectoryDirs.Size > 0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_listthisdirectorydirs").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 345;BA.debugLine="listThisDirectoryDirs.Sort(True)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_listthisdirectorydirs").runVoidMethod ("Sort",(Object)(fileexplorer.__c.getField(true,"True")));
 };
 BA.debugLineNum = 347;BA.debugLine="If listThisDirectoryFiles.Size > 0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_listthisdirectoryfiles").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 348;BA.debugLine="listThisDirectoryFiles.Sort(True)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_listthisdirectoryfiles").runVoidMethod ("Sort",(Object)(fileexplorer.__c.getField(true,"True")));
 };
 BA.debugLineNum = 350;BA.debugLine="End Sub";
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
public static RemoteObject  _getfileicon(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("GetFileIcon (fileexplorer) ","fileexplorer",1,__ref.getField(false, "ba"),__ref,291);
if (RapidSub.canDelegate("getfileicon")) return __ref.runUserSub(false, "fileexplorer","getfileicon", __ref, _dir, _filename);
RemoteObject _javafile = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _icon = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 291;BA.debugLine="Public Sub GetFileIcon(Dir As String, FileName As";
Debug.ShouldStop(4);
 BA.debugLineNum = 295;BA.debugLine="If File.IsDirectory(Dir, FileName) = False Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",fileexplorer.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(_dir),(Object)(_filename)),fileexplorer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 296;BA.debugLine="If File.Exists(Dir, FileName) = True Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",fileexplorer.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_dir),(Object)(_filename)),fileexplorer.__c.getField(true,"True"))) { 
 BA.debugLineNum = 297;BA.debugLine="Dim JO As JavaObject";
Debug.ShouldStop(256);
fileexplorer._jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_jo",fileexplorer._jo);
 BA.debugLineNum = 298;BA.debugLine="Dim JavaFile As JavaObject";
Debug.ShouldStop(512);
_javafile = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("JavaFile", _javafile);
 BA.debugLineNum = 299;BA.debugLine="JavaFile.InitializeNewInstance(\"java.io.File\",";
Debug.ShouldStop(1024);
_javafile.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.io.File")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(fileexplorer.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_dir),(Object)(_filename)))})));
 BA.debugLineNum = 300;BA.debugLine="Dim icon As JavaObject = JO.InitializeStatic(\"s";
Debug.ShouldStop(2048);
_icon = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_icon.setObject(__ref.getField(false,"_jo").runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("sun.awt.shell.ShellFolder"))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getShellFolder")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_javafile.getObject())}))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getIcon")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(fileexplorer.__c.getField(true,"True"))}))));Debug.locals.put("icon", _icon);
 BA.debugLineNum = 301;BA.debugLine="If icon.IsInitialized = True Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_icon.runMethod(true,"IsInitialized"),fileexplorer.__c.getField(true,"True"))) { 
 BA.debugLineNum = 302;BA.debugLine="Return fileicon_to_image(icon)";
Debug.ShouldStop(8192);
if (true) return __ref.runClassMethod (b4j.example.fileexplorer.class, "_fileicon_to_image",(Object)(_icon));
 }else {
 BA.debugLineNum = 304;BA.debugLine="Return DefaultImage";
Debug.ShouldStop(32768);
if (true) return __ref.getField(false,"_defaultimage");
 };
 }else {
 BA.debugLineNum = 307;BA.debugLine="Return DefaultImage";
Debug.ShouldStop(262144);
if (true) return __ref.getField(false,"_defaultimage");
 };
 }else {
 BA.debugLineNum = 310;BA.debugLine="Return DefaultImage";
Debug.ShouldStop(2097152);
if (true) return __ref.getField(false,"_defaultimage");
 };
 BA.debugLineNum = 312;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _module,RemoteObject _eventname,RemoteObject _listviewnode,RemoteObject _initialdirectory) throws Exception{
try {
		Debug.PushSubsStack("Initialize (fileexplorer) ","fileexplorer",1,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "fileexplorer","initialize", __ref, _ba, _module, _eventname, _listviewnode, _initialdirectory);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _strdefaultfolder = RemoteObject.createImmutable("");
Debug.locals.put("ba", _ba);
Debug.locals.put("Module", _module);
Debug.locals.put("EventName", _eventname);
Debug.locals.put("listViewNode", _listviewnode);
Debug.locals.put("InitialDirectory", _initialdirectory);
 BA.debugLineNum = 60;BA.debugLine="Public Sub Initialize(Module As Object, EventName";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="mModule = Module";
Debug.ShouldStop(268435456);
__ref.setField ("_mmodule",_module);
 BA.debugLineNum = 62;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(536870912);
__ref.setField ("_meventname",_eventname);
 BA.debugLineNum = 63;BA.debugLine="JO.InitializeNewInstance(\"javafx.beans.propert";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jo").runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("javafx.beans.property.SimpleObjectProperty")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {__ref,(RemoteObject.createImmutable("value"))})));
 BA.debugLineNum = 65;BA.debugLine="ListenerIndexChange = JO.CreateEvent(\"javafx.b";
Debug.ShouldStop(1);
__ref.setField ("_listenerindexchange",__ref.getField(false,"_jo").runMethod(false,"CreateEvent",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("javafx.beans.InvalidationListener")),(Object)(BA.ObjectToString("SelectedIndexChanged")),(Object)((RemoteObject.createImmutable("")))));
 BA.debugLineNum = 66;BA.debugLine="JO.RunMethod(\"addListener\",Array(ListenerIndex";
Debug.ShouldStop(2);
__ref.getField(false,"_jo").runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addListener")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref.getField(false,"_listenerindexchange")})));
 BA.debugLineNum = 68;BA.debugLine="ListenerDblClick = JO.CreateEvent(\"javafx.bean";
Debug.ShouldStop(8);
__ref.setField ("_listenerdblclick",__ref.getField(false,"_jo").runMethod(false,"CreateEvent",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("javafx.beans.InvalidationListener")),(Object)(BA.ObjectToString("DoubleClick")),(Object)((RemoteObject.createImmutable("")))));
 BA.debugLineNum = 69;BA.debugLine="JO.RunMethod(\"addListener\",Array(ListenerDblCl";
Debug.ShouldStop(16);
__ref.getField(false,"_jo").runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addListener")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref.getField(false,"_listenerdblclick")})));
 BA.debugLineNum = 70;BA.debugLine="ListenerMouseClick = JO.CreateEvent(\"javafx.be";
Debug.ShouldStop(32);
__ref.setField ("_listenermouseclick",__ref.getField(false,"_jo").runMethod(false,"CreateEvent",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("javafx.beans.InvalidationListener")),(Object)(BA.ObjectToString("MouseClick")),(Object)((RemoteObject.createImmutable("")))));
 BA.debugLineNum = 71;BA.debugLine="JO.RunMethod(\"addListener\",Array(ListenerMouse";
Debug.ShouldStop(64);
__ref.getField(false,"_jo").runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addListener")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref.getField(false,"_listenermouseclick")})));
 BA.debugLineNum = 72;BA.debugLine="ListenerChangeDirectory = JO.CreateEvent(\"java";
Debug.ShouldStop(128);
__ref.setField ("_listenerchangedirectory",__ref.getField(false,"_jo").runMethod(false,"CreateEvent",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("javafx.beans.InvalidationListener")),(Object)(BA.ObjectToString("ChangeDirectory")),(Object)((RemoteObject.createImmutable("")))));
 BA.debugLineNum = 73;BA.debugLine="JO.RunMethod(\"addListener\",Array(ListenerChang";
Debug.ShouldStop(256);
__ref.getField(false,"_jo").runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addListener")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref.getField(false,"_listenerchangedirectory")})));
 BA.debugLineNum = 74;BA.debugLine="listThisDirectoryContents.Initialize";
Debug.ShouldStop(512);
__ref.getField(false,"_listthisdirectorycontents").runVoidMethod ("Initialize");
 BA.debugLineNum = 75;BA.debugLine="listThisDirectoryDirs.Initialize";
Debug.ShouldStop(1024);
__ref.getField(false,"_listthisdirectorydirs").runVoidMethod ("Initialize");
 BA.debugLineNum = 76;BA.debugLine="listThisDirectoryFiles.Initialize";
Debug.ShouldStop(2048);
__ref.getField(false,"_listthisdirectoryfiles").runVoidMethod ("Initialize");
 BA.debugLineNum = 77;BA.debugLine="intLastSelectedIndex = -1";
Debug.ShouldStop(4096);
__ref.setField ("_intlastselectedindex",BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 78;BA.debugLine="DefaultImage.Initialize(File.DirAssets, \"unknown_";
Debug.ShouldStop(8192);
__ref.getField(false,"_defaultimage").runVoidMethod ("Initialize",(Object)(fileexplorer.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("unknown_filetype.png")));
 BA.debugLineNum = 79;BA.debugLine="Dim JO As JavaObject";
Debug.ShouldStop(16384);
fileexplorer._jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_jo",fileexplorer._jo);
 BA.debugLineNum = 80;BA.debugLine="Dim strDefaultFolder As String = JO.Initialize";
Debug.ShouldStop(32768);
_strdefaultfolder = BA.ObjectToString(__ref.getField(false,"_jo").runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("javax.swing.filechooser.FileSystemView"))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getFileSystemView")),(Object)((fileexplorer.__c.getField(false,"Null")))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getDefaultDirectory")),(Object)((fileexplorer.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getAbsolutePath")),(Object)((fileexplorer.__c.getField(false,"Null")))));Debug.locals.put("strDefaultFolder", _strdefaultfolder);Debug.locals.put("strDefaultFolder", _strdefaultfolder);
 BA.debugLineNum = 81;BA.debugLine="MyComputerListView = listViewNode";
Debug.ShouldStop(65536);
__ref.setField ("_mycomputerlistview",_listviewnode);
 BA.debugLineNum = 82;BA.debugLine="If MyComputerListView.IsInitialized Then";
Debug.ShouldStop(131072);
if (__ref.getField(false,"_mycomputerlistview").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 83;BA.debugLine="If InitialDirectory <> \"\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("!",_initialdirectory,BA.ObjectToString(""))) { 
 BA.debugLineNum = 84;BA.debugLine="If File.IsDirectory(InitialDirectory, \"\") = Tru";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",fileexplorer.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(_initialdirectory),(Object)(RemoteObject.createImmutable(""))),fileexplorer.__c.getField(true,"True"))) { 
 BA.debugLineNum = 85;BA.debugLine="generate_directory_content_list(InitialDirecto";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.fileexplorer.class, "_generate_directory_content_list",(Object)(_initialdirectory));
 }else {
 BA.debugLineNum = 87;BA.debugLine="generate_directory_content_list(strDefaultFold";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.fileexplorer.class, "_generate_directory_content_list",(Object)(_strdefaultfolder));
 };
 }else {
 BA.debugLineNum = 90;BA.debugLine="generate_directory_content_list(strDefaultFolde";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.fileexplorer.class, "_generate_directory_content_list",(Object)(_strdefaultfolder));
 };
 };
 BA.debugLineNum = 93;BA.debugLine="Private strSingleClickSelectedItemType As String";
Debug.ShouldStop(268435456);
fileexplorer._strsingleclickselecteditemtype = RemoteObject.createImmutable("");__ref.setField("_strsingleclickselecteditemtype",fileexplorer._strsingleclickselecteditemtype);
 BA.debugLineNum = 94;BA.debugLine="Private strSingleClickSelectedItemValue As String";
Debug.ShouldStop(536870912);
fileexplorer._strsingleclickselecteditemvalue = RemoteObject.createImmutable("");__ref.setField("_strsingleclickselecteditemvalue",fileexplorer._strsingleclickselecteditemvalue);
 BA.debugLineNum = 95;BA.debugLine="Private strSingleClickSelectedItemURI As String";
Debug.ShouldStop(1073741824);
fileexplorer._strsingleclickselecteditemuri = RemoteObject.createImmutable("");__ref.setField("_strsingleclickselecteditemuri",fileexplorer._strsingleclickselecteditemuri);
 BA.debugLineNum = 96;BA.debugLine="Private strDblClickSelectedItemType As String";
Debug.ShouldStop(-2147483648);
fileexplorer._strdblclickselecteditemtype = RemoteObject.createImmutable("");__ref.setField("_strdblclickselecteditemtype",fileexplorer._strdblclickselecteditemtype);
 BA.debugLineNum = 97;BA.debugLine="Private strDblClickSelectedItemValue As String";
Debug.ShouldStop(1);
fileexplorer._strdblclickselecteditemvalue = RemoteObject.createImmutable("");__ref.setField("_strdblclickselecteditemvalue",fileexplorer._strdblclickselecteditemvalue);
 BA.debugLineNum = 98;BA.debugLine="Private strDblClickSelectedItemURI As String";
Debug.ShouldStop(2);
fileexplorer._strdblclickselecteditemuri = RemoteObject.createImmutable("");__ref.setField("_strdblclickselecteditemuri",fileexplorer._strdblclickselecteditemuri);
 BA.debugLineNum = 99;BA.debugLine="End Sub";
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
public static RemoteObject  _loadcontents(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LoadContents (fileexplorer) ","fileexplorer",1,__ref.getField(false, "ba"),__ref,139);
if (RapidSub.canDelegate("loadcontents")) return __ref.runUserSub(false, "fileexplorer","loadcontents", __ref);
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper");
RemoteObject _im = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
RemoteObject _lblthis = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
int _i = 0;
 BA.debugLineNum = 139;BA.debugLine="Public Sub LoadContents";
Debug.ShouldStop(1024);
 BA.debugLineNum = 140;BA.debugLine="MyComputerListView.Items.Clear";
Debug.ShouldStop(2048);
__ref.getField(false,"_mycomputerlistview").runMethod(false,"getItems").runVoidMethod ("Clear");
 BA.debugLineNum = 141;BA.debugLine="Dim a As AnchorPane";
Debug.ShouldStop(4096);
_a = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 142;BA.debugLine="a.Initialize(\"DeviceAnchorPane\")";
Debug.ShouldStop(8192);
_a.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DeviceAnchorPane")));
 BA.debugLineNum = 143;BA.debugLine="Dim im As ImageView";
Debug.ShouldStop(16384);
_im = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");Debug.locals.put("im", _im);
 BA.debugLineNum = 144;BA.debugLine="im.Initialize(\"DeviceIcon\")";
Debug.ShouldStop(32768);
_im.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DeviceIcon")));
 BA.debugLineNum = 145;BA.debugLine="im.SetImage(fx.LoadImage(File.DirAssets, \"folder_";
Debug.ShouldStop(65536);
_im.runVoidMethod ("SetImage",(Object)((__ref.getField(false,"_fx").runMethod(false,"LoadImage",(Object)(fileexplorer.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("folder_up.png"))).getObject())));
 BA.debugLineNum = 146;BA.debugLine="a.AddNode(im, 0, 0, 16, 16)";
Debug.ShouldStop(131072);
_a.runVoidMethod ("AddNode",(Object)((_im.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 16)),(Object)(BA.numberCast(double.class, 16)));
 BA.debugLineNum = 147;BA.debugLine="Dim lblThis As Label";
Debug.ShouldStop(262144);
_lblthis = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lblThis", _lblthis);
 BA.debugLineNum = 148;BA.debugLine="lblThis.Initialize(\"DeviceList\")";
Debug.ShouldStop(524288);
_lblthis.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DeviceList")));
 BA.debugLineNum = 149;BA.debugLine="lblThis.Text = \"..\"";
Debug.ShouldStop(1048576);
_lblthis.runMethod(true,"setText",BA.ObjectToString(".."));
 BA.debugLineNum = 150;BA.debugLine="a.AddNode(lblThis, 18, 0, -1, -1)";
Debug.ShouldStop(2097152);
_a.runVoidMethod ("AddNode",(Object)((_lblthis.getObject())),(Object)(BA.numberCast(double.class, 18)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, -(double) (0 + 1))),(Object)(BA.numberCast(double.class, -(double) (0 + 1))));
 BA.debugLineNum = 151;BA.debugLine="MyComputerListView.Items.Add(a)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_mycomputerlistview").runMethod(false,"getItems").runVoidMethod ("Add",(Object)((_a.getObject())));
 BA.debugLineNum = 152;BA.debugLine="If listThisDirectoryDirs.Size > 0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_listthisdirectorydirs").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 153;BA.debugLine="For i = 0 To listThisDirectoryDirs.Size -1";
Debug.ShouldStop(16777216);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_listthisdirectorydirs").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14); _i = ((int)(0 + _i + step14)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 154;BA.debugLine="Dim a As AnchorPane";
Debug.ShouldStop(33554432);
_a = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 155;BA.debugLine="a.Initialize(\"DeviceAnchorPane\")";
Debug.ShouldStop(67108864);
_a.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DeviceAnchorPane")));
 BA.debugLineNum = 156;BA.debugLine="Dim im As ImageView";
Debug.ShouldStop(134217728);
_im = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");Debug.locals.put("im", _im);
 BA.debugLineNum = 157;BA.debugLine="im.Initialize(\"DeviceIcon\")";
Debug.ShouldStop(268435456);
_im.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DeviceIcon")));
 BA.debugLineNum = 158;BA.debugLine="im.SetImage(fx.LoadImage(File.DirAssets, \"folde";
Debug.ShouldStop(536870912);
_im.runVoidMethod ("SetImage",(Object)((__ref.getField(false,"_fx").runMethod(false,"LoadImage",(Object)(fileexplorer.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("folder.png"))).getObject())));
 BA.debugLineNum = 159;BA.debugLine="a.AddNode(im, 0, 0, 16, 16)";
Debug.ShouldStop(1073741824);
_a.runVoidMethod ("AddNode",(Object)((_im.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 16)),(Object)(BA.numberCast(double.class, 16)));
 BA.debugLineNum = 160;BA.debugLine="Dim lblThis As Label";
Debug.ShouldStop(-2147483648);
_lblthis = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lblThis", _lblthis);
 BA.debugLineNum = 161;BA.debugLine="lblThis.Initialize(\"DeviceList\")";
Debug.ShouldStop(1);
_lblthis.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DeviceList")));
 BA.debugLineNum = 162;BA.debugLine="lblThis.Text = listThisDirectoryDirs.Get(i)";
Debug.ShouldStop(2);
_lblthis.runMethod(true,"setText",BA.ObjectToString(__ref.getField(false,"_listthisdirectorydirs").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 163;BA.debugLine="a.AddNode(lblThis, 18, 0, -1, -1)";
Debug.ShouldStop(4);
_a.runVoidMethod ("AddNode",(Object)((_lblthis.getObject())),(Object)(BA.numberCast(double.class, 18)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, -(double) (0 + 1))),(Object)(BA.numberCast(double.class, -(double) (0 + 1))));
 BA.debugLineNum = 164;BA.debugLine="MyComputerListView.Items.Add(a)";
Debug.ShouldStop(8);
__ref.getField(false,"_mycomputerlistview").runMethod(false,"getItems").runVoidMethod ("Add",(Object)((_a.getObject())));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 167;BA.debugLine="If listThisDirectoryFiles.Size > 0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_listthisdirectoryfiles").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 168;BA.debugLine="For i = 0 To listThisDirectoryFiles.Size -1";
Debug.ShouldStop(128);
{
final int step29 = 1;
final int limit29 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_listthisdirectoryfiles").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step29 > 0 && _i <= limit29) || (step29 < 0 && _i >= limit29); _i = ((int)(0 + _i + step29)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 169;BA.debugLine="Dim a As AnchorPane";
Debug.ShouldStop(256);
_a = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 170;BA.debugLine="a.Initialize(\"DeviceAnchorPane\")";
Debug.ShouldStop(512);
_a.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DeviceAnchorPane")));
 BA.debugLineNum = 171;BA.debugLine="Dim im As ImageView";
Debug.ShouldStop(1024);
_im = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");Debug.locals.put("im", _im);
 BA.debugLineNum = 172;BA.debugLine="im.Initialize(\"\")";
Debug.ShouldStop(2048);
_im.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 173;BA.debugLine="im.SetImage(GetFileIcon(strThisDirectoryURI, li";
Debug.ShouldStop(4096);
_im.runVoidMethod ("SetImage",(Object)((__ref.runClassMethod (b4j.example.fileexplorer.class, "_getfileicon",(Object)(__ref.getField(true,"_strthisdirectoryuri")),(Object)(BA.ObjectToString(__ref.getField(false,"_listthisdirectoryfiles").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))))).getObject())));
 BA.debugLineNum = 174;BA.debugLine="a.AddNode(im, 0, 0, 16, 16)";
Debug.ShouldStop(8192);
_a.runVoidMethod ("AddNode",(Object)((_im.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 16)),(Object)(BA.numberCast(double.class, 16)));
 BA.debugLineNum = 175;BA.debugLine="Dim lblThis As Label";
Debug.ShouldStop(16384);
_lblthis = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lblThis", _lblthis);
 BA.debugLineNum = 176;BA.debugLine="lblThis.Initialize(\"\")";
Debug.ShouldStop(32768);
_lblthis.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 177;BA.debugLine="lblThis.Text = listThisDirectoryFiles.Get(i)";
Debug.ShouldStop(65536);
_lblthis.runMethod(true,"setText",BA.ObjectToString(__ref.getField(false,"_listthisdirectoryfiles").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 178;BA.debugLine="a.AddNode(lblThis, 18, 0, -1, -1)";
Debug.ShouldStop(131072);
_a.runVoidMethod ("AddNode",(Object)((_lblthis.getObject())),(Object)(BA.numberCast(double.class, 18)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, -(double) (0 + 1))),(Object)(BA.numberCast(double.class, -(double) (0 + 1))));
 BA.debugLineNum = 179;BA.debugLine="MyComputerListView.Items.Add(a)";
Debug.ShouldStop(262144);
__ref.getField(false,"_mycomputerlistview").runMethod(false,"getItems").runVoidMethod ("Add",(Object)((_a.getObject())));
 }
}Debug.locals.put("i", _i);
;
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
public static RemoteObject  _mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("MouseClicked (fileexplorer) ","fileexplorer",1,__ref.getField(false, "ba"),__ref,217);
if (RapidSub.canDelegate("mouseclicked")) return __ref.runUserSub(false, "fileexplorer","mouseclicked", __ref, _eventdata);
RemoteObject _ap = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 217;BA.debugLine="Public Sub MouseClicked (EventData As MouseEvent)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 218;BA.debugLine="strSingleClickSelectedItemType = \"\"";
Debug.ShouldStop(33554432);
__ref.setField ("_strsingleclickselecteditemtype",BA.ObjectToString(""));
 BA.debugLineNum = 219;BA.debugLine="strSingleClickSelectedItemValue = \"\"";
Debug.ShouldStop(67108864);
__ref.setField ("_strsingleclickselecteditemvalue",BA.ObjectToString(""));
 BA.debugLineNum = 220;BA.debugLine="strSingleClickSelectedItemURI  = \"\"";
Debug.ShouldStop(134217728);
__ref.setField ("_strsingleclickselecteditemuri",BA.ObjectToString(""));
 BA.debugLineNum = 221;BA.debugLine="strDblClickSelectedItemType = \"\"";
Debug.ShouldStop(268435456);
__ref.setField ("_strdblclickselecteditemtype",BA.ObjectToString(""));
 BA.debugLineNum = 222;BA.debugLine="strDblClickSelectedItemValue = \"\"";
Debug.ShouldStop(536870912);
__ref.setField ("_strdblclickselecteditemvalue",BA.ObjectToString(""));
 BA.debugLineNum = 223;BA.debugLine="strDblClickSelectedItemURI  = \"\"";
Debug.ShouldStop(1073741824);
__ref.setField ("_strdblclickselecteditemuri",BA.ObjectToString(""));
 BA.debugLineNum = 224;BA.debugLine="If intLastSelectedIndex > -1 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_intlastselectedindex"),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 225;BA.debugLine="Dim ap As AnchorPane = MyComputerListView.Items.";
Debug.ShouldStop(1);
_ap = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper");
_ap.setObject(__ref.getField(false,"_mycomputerlistview").runMethod(false,"getItems").runMethod(false,"Get",(Object)(__ref.getField(true,"_intlastselectedindex"))));Debug.locals.put("ap", _ap);
 BA.debugLineNum = 226;BA.debugLine="If ap.NumberOfNodes = 2 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_ap.runMethod(true,"getNumberOfNodes"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 227;BA.debugLine="If GetType(ap.GetNode(1)) = \"javafx.scene.contr";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",fileexplorer.__c.runMethod(true,"GetType",(Object)((_ap.runMethod(false,"GetNode",(Object)(BA.numberCast(int.class, 1))).getObject()))),BA.ObjectToString("javafx.scene.control.Label"))) { 
 BA.debugLineNum = 229;BA.debugLine="If intLastSelectedIndex = 0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_intlastselectedindex"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 230;BA.debugLine="strSingleClickSelectedItemType = \"parent\"";
Debug.ShouldStop(32);
__ref.setField ("_strsingleclickselecteditemtype",BA.ObjectToString("parent"));
 BA.debugLineNum = 231;BA.debugLine="strSingleClickSelectedItemValue = \"\"";
Debug.ShouldStop(64);
__ref.setField ("_strsingleclickselecteditemvalue",BA.ObjectToString(""));
 BA.debugLineNum = 232;BA.debugLine="strSingleClickSelectedItemURI  = \"\"";
Debug.ShouldStop(128);
__ref.setField ("_strsingleclickselecteditemuri",BA.ObjectToString(""));
 BA.debugLineNum = 233;BA.debugLine="If SubExists(mModule, mEventName&\"_MouseClick";
Debug.ShouldStop(256);
if (fileexplorer.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mmodule")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_MouseClick")))).<Boolean>get().booleanValue()) { 
fileexplorer.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mmodule")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_MouseClick"))),(Object)((fileexplorer.__c.getField(false,"File").runMethod(true,"GetFileParent",(Object)(__ref.getField(true,"_strthisdirectoryuri"))))));};
 BA.debugLineNum = 234;BA.debugLine="If EventData.ClickCount > 1 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",_eventdata.runMethod(true,"getClickCount"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 235;BA.debugLine="strDblClickSelectedItemType = \"parent\"";
Debug.ShouldStop(1024);
__ref.setField ("_strdblclickselecteditemtype",BA.ObjectToString("parent"));
 BA.debugLineNum = 236;BA.debugLine="strDblClickSelectedItemValue = \"\"";
Debug.ShouldStop(2048);
__ref.setField ("_strdblclickselecteditemvalue",BA.ObjectToString(""));
 BA.debugLineNum = 237;BA.debugLine="strDblClickSelectedItemURI  = \"\"";
Debug.ShouldStop(4096);
__ref.setField ("_strdblclickselecteditemuri",BA.ObjectToString(""));
 BA.debugLineNum = 238;BA.debugLine="change_directory(File.GetFileParent(strThisD";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.fileexplorer.class, "_change_directory",(Object)(fileexplorer.__c.getField(false,"File").runMethod(true,"GetFileParent",(Object)(__ref.getField(true,"_strthisdirectoryuri")))));
 };
 }else 
{ BA.debugLineNum = 240;BA.debugLine="Else If intLastSelectedIndex > ((listThisDirec";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_intlastselectedindex"),BA.numberCast(double.class, (RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_listthisdirectorydirs").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.createImmutable(1)}, "+",1, 1))))) { 
 BA.debugLineNum = 242;BA.debugLine="strSingleClickSelectedItemType = \"file\"";
Debug.ShouldStop(131072);
__ref.setField ("_strsingleclickselecteditemtype",BA.ObjectToString("file"));
 BA.debugLineNum = 243;BA.debugLine="strSingleClickSelectedItemValue = listThisDir";
Debug.ShouldStop(262144);
__ref.setField ("_strsingleclickselecteditemvalue",BA.ObjectToString(__ref.getField(false,"_listthisdirectoryfiles").runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_intlastselectedindex"),RemoteObject.createImmutable(1)}, "-",1, 1)),__ref.getField(false,"_listthisdirectorydirs").runMethod(true,"getSize")}, "-",1, 1)))));
 BA.debugLineNum = 244;BA.debugLine="strSingleClickSelectedItemURI  = File.Combine";
Debug.ShouldStop(524288);
__ref.setField ("_strsingleclickselecteditemuri",fileexplorer.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_strthisdirectoryuri")),(Object)(BA.ObjectToString(__ref.getField(false,"_listthisdirectoryfiles").runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_intlastselectedindex"),RemoteObject.createImmutable(1)}, "-",1, 1)),__ref.getField(false,"_listthisdirectorydirs").runMethod(true,"getSize")}, "-",1, 1)))))));
 BA.debugLineNum = 245;BA.debugLine="If SubExists(mModule, mEventName&\"_MouseClick";
Debug.ShouldStop(1048576);
if (fileexplorer.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mmodule")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_MouseClick")))).<Boolean>get().booleanValue()) { 
fileexplorer.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mmodule")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_MouseClick"))),(Object)((fileexplorer.__c.getField(false,"File").runMethod(true,"GetFileParent",(Object)(__ref.getField(true,"_strthisdirectoryuri"))))));};
 BA.debugLineNum = 246;BA.debugLine="If EventData.ClickCount > 1 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",_eventdata.runMethod(true,"getClickCount"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 247;BA.debugLine="strDblClickSelectedItemType = \"file\"";
Debug.ShouldStop(4194304);
__ref.setField ("_strdblclickselecteditemtype",BA.ObjectToString("file"));
 BA.debugLineNum = 248;BA.debugLine="strDblClickSelectedItemValue = listThisDirec";
Debug.ShouldStop(8388608);
__ref.setField ("_strdblclickselecteditemvalue",BA.ObjectToString(__ref.getField(false,"_listthisdirectoryfiles").runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_intlastselectedindex"),RemoteObject.createImmutable(1)}, "-",1, 1)),__ref.getField(false,"_listthisdirectorydirs").runMethod(true,"getSize")}, "-",1, 1)))));
 BA.debugLineNum = 249;BA.debugLine="strDblClickSelectedItemURI  = File.Combine(s";
Debug.ShouldStop(16777216);
__ref.setField ("_strdblclickselecteditemuri",fileexplorer.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_strthisdirectoryuri")),(Object)(BA.ObjectToString(__ref.getField(false,"_listthisdirectoryfiles").runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_intlastselectedindex"),RemoteObject.createImmutable(1)}, "-",1, 1)),__ref.getField(false,"_listthisdirectorydirs").runMethod(true,"getSize")}, "-",1, 1)))))));
 BA.debugLineNum = 250;BA.debugLine="If SubExists(mModule, mEventName&\"_DoubleCli";
Debug.ShouldStop(33554432);
if (fileexplorer.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mmodule")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_DoubleClick")))).<Boolean>get().booleanValue()) { 
fileexplorer.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mmodule")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_DoubleClick"))),(Object)((__ref.getField(true,"_strdblclickselecteditemuri"))));};
 };
 }else {
 BA.debugLineNum = 254;BA.debugLine="strSingleClickSelectedItemType = \"directory\"";
Debug.ShouldStop(536870912);
__ref.setField ("_strsingleclickselecteditemtype",BA.ObjectToString("directory"));
 BA.debugLineNum = 255;BA.debugLine="strSingleClickSelectedItemValue = listThisDir";
Debug.ShouldStop(1073741824);
__ref.setField ("_strsingleclickselecteditemvalue",BA.ObjectToString(__ref.getField(false,"_listthisdirectorydirs").runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_intlastselectedindex"),RemoteObject.createImmutable(1)}, "-",1, 1)))));
 BA.debugLineNum = 256;BA.debugLine="strSingleClickSelectedItemURI  = File.Combine";
Debug.ShouldStop(-2147483648);
__ref.setField ("_strsingleclickselecteditemuri",fileexplorer.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_strthisdirectoryuri")),(Object)(BA.ObjectToString(__ref.getField(false,"_listthisdirectorydirs").runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_intlastselectedindex"),RemoteObject.createImmutable(1)}, "-",1, 1)))))));
 BA.debugLineNum = 257;BA.debugLine="If SubExists(mModule, mEventName&\"_MouseClick";
Debug.ShouldStop(1);
if (fileexplorer.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mmodule")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_MouseClick")))).<Boolean>get().booleanValue()) { 
fileexplorer.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mmodule")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_MouseClick"))),(Object)((fileexplorer.__c.getField(false,"File").runMethod(true,"GetFileParent",(Object)(__ref.getField(true,"_strthisdirectoryuri"))))));};
 BA.debugLineNum = 258;BA.debugLine="If EventData.ClickCount > 1 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_eventdata.runMethod(true,"getClickCount"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 259;BA.debugLine="strDblClickSelectedItemType = \"directory\"";
Debug.ShouldStop(4);
__ref.setField ("_strdblclickselecteditemtype",BA.ObjectToString("directory"));
 BA.debugLineNum = 260;BA.debugLine="strDblClickSelectedItemValue = listThisDirec";
Debug.ShouldStop(8);
__ref.setField ("_strdblclickselecteditemvalue",BA.ObjectToString(__ref.getField(false,"_listthisdirectorydirs").runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_intlastselectedindex"),RemoteObject.createImmutable(1)}, "-",1, 1)))));
 BA.debugLineNum = 261;BA.debugLine="strDblClickSelectedItemURI  = File.Combine(s";
Debug.ShouldStop(16);
__ref.setField ("_strdblclickselecteditemuri",fileexplorer.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_strthisdirectoryuri")),(Object)(BA.ObjectToString(__ref.getField(false,"_listthisdirectorydirs").runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_intlastselectedindex"),RemoteObject.createImmutable(1)}, "-",1, 1)))))));
 BA.debugLineNum = 263;BA.debugLine="change_directory(File.Combine(strThisDirecto";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.fileexplorer.class, "_change_directory",(Object)(fileexplorer.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_strthisdirectoryuri")),(Object)(BA.ObjectToString(__ref.getField(false,"_listthisdirectorydirs").runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_intlastselectedindex"),RemoteObject.createImmutable(1)}, "-",1, 1))))))));
 };
 }};
 };
 };
 BA.debugLineNum = 270;BA.debugLine="If SubExists(mModule, mEventName&\"_SelectedIndex";
Debug.ShouldStop(8192);
if (fileexplorer.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mmodule")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_SelectedIndexChanged")))).<Boolean>get().booleanValue()) { 
fileexplorer.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mmodule")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_SelectedIndexChanged"))),(Object)((__ref.getField(true,"_intlastselectedindex"))));};
 };
 BA.debugLineNum = 273;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _reloadcontents(RemoteObject __ref,RemoteObject _dir) throws Exception{
try {
		Debug.PushSubsStack("ReloadContents (fileexplorer) ","fileexplorer",1,__ref.getField(false, "ba"),__ref,185);
if (RapidSub.canDelegate("reloadcontents")) return __ref.runUserSub(false, "fileexplorer","reloadcontents", __ref, _dir);
Debug.locals.put("Dir", _dir);
 BA.debugLineNum = 185;BA.debugLine="Public Sub ReloadContents(Dir As String)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 186;BA.debugLine="If Dir <> \"\" Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("!",_dir,BA.ObjectToString(""))) { 
 BA.debugLineNum = 187;BA.debugLine="If File.IsDirectory(Dir, \"\") = True Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",fileexplorer.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(_dir),(Object)(RemoteObject.createImmutable(""))),fileexplorer.__c.getField(true,"True"))) { 
 BA.debugLineNum = 188;BA.debugLine="generate_directory_content_list(Dir)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.fileexplorer.class, "_generate_directory_content_list",(Object)(_dir));
 BA.debugLineNum = 189;BA.debugLine="LoadContents";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.fileexplorer.class, "_loadcontents");
 };
 }else {
 BA.debugLineNum = 192;BA.debugLine="If File.IsDirectory(strThisDirectoryURI, \"\") = T";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",fileexplorer.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(__ref.getField(true,"_strthisdirectoryuri")),(Object)(RemoteObject.createImmutable(""))),fileexplorer.__c.getField(true,"True"))) { 
 BA.debugLineNum = 193;BA.debugLine="generate_directory_content_list(strThisDirector";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.fileexplorer.class, "_generate_directory_content_list",(Object)(__ref.getField(true,"_strthisdirectoryuri")));
 BA.debugLineNum = 194;BA.debugLine="LoadContents";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.fileexplorer.class, "_loadcontents");
 };
 };
 BA.debugLineNum = 197;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _renamefolder(RemoteObject __ref,RemoteObject _strparent,RemoteObject _strcurrentfoldername,RemoteObject _strnewfolder) throws Exception{
try {
		Debug.PushSubsStack("RenameFolder (fileexplorer) ","fileexplorer",1,__ref.getField(false, "ba"),__ref,200);
if (RapidSub.canDelegate("renamefolder")) return __ref.runUserSub(false, "fileexplorer","renamefolder", __ref, _strparent, _strcurrentfoldername, _strnewfolder);
RemoteObject _jo1 = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jo2 = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("strParent", _strparent);
Debug.locals.put("strCurrentFolderName", _strcurrentfoldername);
Debug.locals.put("strNewFolder", _strnewfolder);
 BA.debugLineNum = 200;BA.debugLine="Public Sub RenameFolder(strParent As String, strCu";
Debug.ShouldStop(128);
 BA.debugLineNum = 202;BA.debugLine="If File.IsDirectory(strParent, strCurrentFolderNa";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",fileexplorer.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(_strparent),(Object)(_strcurrentfoldername)),fileexplorer.__c.getField(true,"True"))) { 
 BA.debugLineNum = 203;BA.debugLine="If File.IsDirectory(strParent, strNewFolder) = F";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",fileexplorer.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(_strparent),(Object)(_strnewfolder)),fileexplorer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 204;BA.debugLine="Dim jo1, jo2 As JavaObject";
Debug.ShouldStop(2048);
_jo1 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo1", _jo1);
_jo2 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo2", _jo2);
 BA.debugLineNum = 205;BA.debugLine="jo1.InitializeNewInstance(\"java.io.File\", Array";
Debug.ShouldStop(4096);
_jo1.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.io.File")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(fileexplorer.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_strparent),(Object)(_strcurrentfoldername)))})));
 BA.debugLineNum = 206;BA.debugLine="jo2.InitializeNewInstance(\"java.io.File\", Array";
Debug.ShouldStop(8192);
_jo2.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.io.File")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(fileexplorer.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_strparent),(Object)(_strnewfolder)))})));
 BA.debugLineNum = 207;BA.debugLine="Log(jo1.RunMethod(\"renameTo\", Array(jo2)))";
Debug.ShouldStop(16384);
fileexplorer.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_jo1.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("renameTo")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_jo2.getObject())}))))));
 };
 };
 BA.debugLineNum = 210;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _selectedindex(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("SelectedIndex (fileexplorer) ","fileexplorer",1,__ref.getField(false, "ba"),__ref,279);
if (RapidSub.canDelegate("selectedindex")) return __ref.runUserSub(false, "fileexplorer","selectedindex", __ref, _index);
Debug.locals.put("Index", _index);
 BA.debugLineNum = 279;BA.debugLine="Public Sub SelectedIndex(Index As Int)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 280;BA.debugLine="If Index > -1 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",_index,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 281;BA.debugLine="intLastSelectedIndex = Index";
Debug.ShouldStop(16777216);
__ref.setField ("_intlastselectedindex",_index);
 }else {
 BA.debugLineNum = 283;BA.debugLine="intLastSelectedIndex = 0";
Debug.ShouldStop(67108864);
__ref.setField ("_intlastselectedindex",BA.numberCast(int.class, 0));
 };
 BA.debugLineNum = 285;BA.debugLine="End Sub";
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
public static RemoteObject  _selecteditemtype(RemoteObject __ref,RemoteObject _booldoubleclick) throws Exception{
try {
		Debug.PushSubsStack("SelectedItemType (fileexplorer) ","fileexplorer",1,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("selecteditemtype")) return __ref.runUserSub(false, "fileexplorer","selecteditemtype", __ref, _booldoubleclick);
Debug.locals.put("boolDoubleClick", _booldoubleclick);
 BA.debugLineNum = 110;BA.debugLine="Public Sub SelectedItemType(boolDoubleClick As Boo";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="If boolDoubleClick = True Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_booldoubleclick,fileexplorer.__c.getField(true,"True"))) { 
 BA.debugLineNum = 112;BA.debugLine="Return strDblClickSelectedItemType";
Debug.ShouldStop(32768);
if (true) return __ref.getField(true,"_strdblclickselecteditemtype");
 }else {
 BA.debugLineNum = 114;BA.debugLine="Return strSingleClickSelectedItemType";
Debug.ShouldStop(131072);
if (true) return __ref.getField(true,"_strsingleclickselecteditemtype");
 };
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _selecteditemuri(RemoteObject __ref,RemoteObject _booldoubleclick) throws Exception{
try {
		Debug.PushSubsStack("SelectedItemURI (fileexplorer) ","fileexplorer",1,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("selecteditemuri")) return __ref.runUserSub(false, "fileexplorer","selecteditemuri", __ref, _booldoubleclick);
Debug.locals.put("boolDoubleClick", _booldoubleclick);
 BA.debugLineNum = 130;BA.debugLine="Public Sub SelectedItemURI(boolDoubleClick As Bool";
Debug.ShouldStop(2);
 BA.debugLineNum = 131;BA.debugLine="If boolDoubleClick = True Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_booldoubleclick,fileexplorer.__c.getField(true,"True"))) { 
 BA.debugLineNum = 132;BA.debugLine="Return strDblClickSelectedItemURI";
Debug.ShouldStop(8);
if (true) return __ref.getField(true,"_strdblclickselecteditemuri");
 }else {
 BA.debugLineNum = 134;BA.debugLine="Return strSingleClickSelectedItemURI";
Debug.ShouldStop(32);
if (true) return __ref.getField(true,"_strsingleclickselecteditemuri");
 };
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _selecteditemvalue(RemoteObject __ref,RemoteObject _booldoubleclick) throws Exception{
try {
		Debug.PushSubsStack("SelectedItemValue (fileexplorer) ","fileexplorer",1,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("selecteditemvalue")) return __ref.runUserSub(false, "fileexplorer","selecteditemvalue", __ref, _booldoubleclick);
Debug.locals.put("boolDoubleClick", _booldoubleclick);
 BA.debugLineNum = 120;BA.debugLine="Public Sub SelectedItemValue(boolDoubleClick As Bo";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 121;BA.debugLine="If boolDoubleClick = True Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_booldoubleclick,fileexplorer.__c.getField(true,"True"))) { 
 BA.debugLineNum = 122;BA.debugLine="Return strDblClickSelectedItemValue";
Debug.ShouldStop(33554432);
if (true) return __ref.getField(true,"_strdblclickselecteditemvalue");
 }else {
 BA.debugLineNum = 124;BA.debugLine="Return strSingleClickSelectedItemValue";
Debug.ShouldStop(134217728);
if (true) return __ref.getField(true,"_strsingleclickselecteditemvalue");
 };
 BA.debugLineNum = 126;BA.debugLine="End Sub";
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
}