package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class fileexplorer extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("b4j.example", "b4j.example.fileexplorer", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.fileexplorer.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4j.objects.FileChooserWrapper _f = null;
public anywheresoftware.b4j.objects.ListViewWrapper _mycomputerlistview = null;
public String _strthisdirectoryuri = "";
public anywheresoftware.b4a.objects.collections.List _listthisdirectorycontents = null;
public anywheresoftware.b4a.objects.collections.List _listthisdirectorydirs = null;
public anywheresoftware.b4a.objects.collections.List _listthisdirectoryfiles = null;
public int _intlastselectedindex = 0;
public String _strsingleclickselecteditemtype = "";
public String _strsingleclickselecteditemvalue = "";
public String _strsingleclickselecteditemuri = "";
public String _strdblclickselecteditemtype = "";
public String _strdblclickselecteditemvalue = "";
public String _strdblclickselecteditemuri = "";
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _defaultimage = null;
public anywheresoftware.b4j.object.JavaObject _jo = null;
public Object _mmodule = null;
public String _meventname = "";
public Object _listenerindexchange = null;
public Object _listenerdblclick = null;
public Object _listenermouseclick = null;
public Object _listenerchangedirectory = null;
public b4j.example.main _main = null;
public String  _initialize(b4j.example.fileexplorer __ref,anywheresoftware.b4a.BA _ba,Object _module,String _eventname,anywheresoftware.b4j.objects.ListViewWrapper _listviewnode,String _initialdirectory) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="fileexplorer";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba,_module,_eventname,_listviewnode,_initialdirectory});
String _strdefaultfolder = "";
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Public Sub Initialize(Module As Object, EventName";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="mModule = Module";
__ref._mmodule = _module;
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="JO.InitializeNewInstance(\"javafx.beans.propert";
__ref._jo.InitializeNewInstance("javafx.beans.property.SimpleObjectProperty",new Object[]{this,(Object)("value")});
RDebugUtils.currentLine=6684677;
 //BA.debugLineNum = 6684677;BA.debugLine="ListenerIndexChange = JO.CreateEvent(\"javafx.b";
__ref._listenerindexchange = __ref._jo.CreateEvent(ba,"javafx.beans.InvalidationListener","SelectedIndexChanged",(Object)(""));
RDebugUtils.currentLine=6684678;
 //BA.debugLineNum = 6684678;BA.debugLine="JO.RunMethod(\"addListener\",Array(ListenerIndex";
__ref._jo.RunMethod("addListener",new Object[]{__ref._listenerindexchange});
RDebugUtils.currentLine=6684680;
 //BA.debugLineNum = 6684680;BA.debugLine="ListenerDblClick = JO.CreateEvent(\"javafx.bean";
__ref._listenerdblclick = __ref._jo.CreateEvent(ba,"javafx.beans.InvalidationListener","DoubleClick",(Object)(""));
RDebugUtils.currentLine=6684681;
 //BA.debugLineNum = 6684681;BA.debugLine="JO.RunMethod(\"addListener\",Array(ListenerDblCl";
__ref._jo.RunMethod("addListener",new Object[]{__ref._listenerdblclick});
RDebugUtils.currentLine=6684682;
 //BA.debugLineNum = 6684682;BA.debugLine="ListenerMouseClick = JO.CreateEvent(\"javafx.be";
__ref._listenermouseclick = __ref._jo.CreateEvent(ba,"javafx.beans.InvalidationListener","MouseClick",(Object)(""));
RDebugUtils.currentLine=6684683;
 //BA.debugLineNum = 6684683;BA.debugLine="JO.RunMethod(\"addListener\",Array(ListenerMouse";
__ref._jo.RunMethod("addListener",new Object[]{__ref._listenermouseclick});
RDebugUtils.currentLine=6684684;
 //BA.debugLineNum = 6684684;BA.debugLine="ListenerChangeDirectory = JO.CreateEvent(\"java";
__ref._listenerchangedirectory = __ref._jo.CreateEvent(ba,"javafx.beans.InvalidationListener","ChangeDirectory",(Object)(""));
RDebugUtils.currentLine=6684685;
 //BA.debugLineNum = 6684685;BA.debugLine="JO.RunMethod(\"addListener\",Array(ListenerChang";
__ref._jo.RunMethod("addListener",new Object[]{__ref._listenerchangedirectory});
RDebugUtils.currentLine=6684686;
 //BA.debugLineNum = 6684686;BA.debugLine="listThisDirectoryContents.Initialize";
__ref._listthisdirectorycontents.Initialize();
RDebugUtils.currentLine=6684687;
 //BA.debugLineNum = 6684687;BA.debugLine="listThisDirectoryDirs.Initialize";
__ref._listthisdirectorydirs.Initialize();
RDebugUtils.currentLine=6684688;
 //BA.debugLineNum = 6684688;BA.debugLine="listThisDirectoryFiles.Initialize";
__ref._listthisdirectoryfiles.Initialize();
RDebugUtils.currentLine=6684689;
 //BA.debugLineNum = 6684689;BA.debugLine="intLastSelectedIndex = -1";
__ref._intlastselectedindex = (int) (-1);
RDebugUtils.currentLine=6684690;
 //BA.debugLineNum = 6684690;BA.debugLine="DefaultImage.Initialize(File.DirAssets, \"unknown_";
__ref._defaultimage.Initialize(__c.File.getDirAssets(),"unknown_filetype.png");
RDebugUtils.currentLine=6684691;
 //BA.debugLineNum = 6684691;BA.debugLine="Dim JO As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=6684692;
 //BA.debugLineNum = 6684692;BA.debugLine="Dim strDefaultFolder As String = JO.Initialize";
_strdefaultfolder = BA.ObjectToString(__ref._jo.InitializeStatic("javax.swing.filechooser.FileSystemView").RunMethodJO("getFileSystemView",(Object[])(__c.Null)).RunMethodJO("getDefaultDirectory",(Object[])(__c.Null)).RunMethod("getAbsolutePath",(Object[])(__c.Null)));
RDebugUtils.currentLine=6684693;
 //BA.debugLineNum = 6684693;BA.debugLine="MyComputerListView = listViewNode";
__ref._mycomputerlistview = _listviewnode;
RDebugUtils.currentLine=6684694;
 //BA.debugLineNum = 6684694;BA.debugLine="If MyComputerListView.IsInitialized Then";
if (__ref._mycomputerlistview.IsInitialized()) { 
RDebugUtils.currentLine=6684695;
 //BA.debugLineNum = 6684695;BA.debugLine="If InitialDirectory <> \"\" Then";
if ((_initialdirectory).equals("") == false) { 
RDebugUtils.currentLine=6684696;
 //BA.debugLineNum = 6684696;BA.debugLine="If File.IsDirectory(InitialDirectory, \"\") = Tru";
if (__c.File.IsDirectory(_initialdirectory,"")==__c.True) { 
RDebugUtils.currentLine=6684697;
 //BA.debugLineNum = 6684697;BA.debugLine="generate_directory_content_list(InitialDirecto";
__ref._generate_directory_content_list(null,_initialdirectory);
 }else {
RDebugUtils.currentLine=6684699;
 //BA.debugLineNum = 6684699;BA.debugLine="generate_directory_content_list(strDefaultFold";
__ref._generate_directory_content_list(null,_strdefaultfolder);
 };
 }else {
RDebugUtils.currentLine=6684702;
 //BA.debugLineNum = 6684702;BA.debugLine="generate_directory_content_list(strDefaultFolde";
__ref._generate_directory_content_list(null,_strdefaultfolder);
 };
 };
RDebugUtils.currentLine=6684705;
 //BA.debugLineNum = 6684705;BA.debugLine="Private strSingleClickSelectedItemType As String";
_strsingleclickselecteditemtype = "";
RDebugUtils.currentLine=6684706;
 //BA.debugLineNum = 6684706;BA.debugLine="Private strSingleClickSelectedItemValue As String";
_strsingleclickselecteditemvalue = "";
RDebugUtils.currentLine=6684707;
 //BA.debugLineNum = 6684707;BA.debugLine="Private strSingleClickSelectedItemURI As String";
_strsingleclickselecteditemuri = "";
RDebugUtils.currentLine=6684708;
 //BA.debugLineNum = 6684708;BA.debugLine="Private strDblClickSelectedItemType As String";
_strdblclickselecteditemtype = "";
RDebugUtils.currentLine=6684709;
 //BA.debugLineNum = 6684709;BA.debugLine="Private strDblClickSelectedItemValue As String";
_strdblclickselecteditemvalue = "";
RDebugUtils.currentLine=6684710;
 //BA.debugLineNum = 6684710;BA.debugLine="Private strDblClickSelectedItemURI As String";
_strdblclickselecteditemuri = "";
RDebugUtils.currentLine=6684711;
 //BA.debugLineNum = 6684711;BA.debugLine="End Sub";
return "";
}
public String  _loadcontents(b4j.example.fileexplorer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="fileexplorer";
if (Debug.shouldDelegate(ba, "loadcontents"))
	return (String) Debug.delegate(ba, "loadcontents", null);
anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper _a = null;
anywheresoftware.b4j.objects.ImageViewWrapper _im = null;
anywheresoftware.b4j.objects.LabelWrapper _lblthis = null;
int _i = 0;
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Public Sub LoadContents";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="MyComputerListView.Items.Clear";
__ref._mycomputerlistview.getItems().Clear();
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="Dim a As AnchorPane";
_a = new anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper();
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="a.Initialize(\"DeviceAnchorPane\")";
_a.Initialize(ba,"DeviceAnchorPane");
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="Dim im As ImageView";
_im = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=7012357;
 //BA.debugLineNum = 7012357;BA.debugLine="im.Initialize(\"DeviceIcon\")";
_im.Initialize(ba,"DeviceIcon");
RDebugUtils.currentLine=7012358;
 //BA.debugLineNum = 7012358;BA.debugLine="im.SetImage(fx.LoadImage(File.DirAssets, \"folder_";
_im.SetImage((javafx.scene.image.Image)(__ref._fx.LoadImage(__c.File.getDirAssets(),"folder_up.png").getObject()));
RDebugUtils.currentLine=7012359;
 //BA.debugLineNum = 7012359;BA.debugLine="a.AddNode(im, 0, 0, 16, 16)";
_a.AddNode((javafx.scene.Node)(_im.getObject()),0,0,16,16);
RDebugUtils.currentLine=7012360;
 //BA.debugLineNum = 7012360;BA.debugLine="Dim lblThis As Label";
_lblthis = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=7012361;
 //BA.debugLineNum = 7012361;BA.debugLine="lblThis.Initialize(\"DeviceList\")";
_lblthis.Initialize(ba,"DeviceList");
RDebugUtils.currentLine=7012362;
 //BA.debugLineNum = 7012362;BA.debugLine="lblThis.Text = \"..\"";
_lblthis.setText("..");
RDebugUtils.currentLine=7012363;
 //BA.debugLineNum = 7012363;BA.debugLine="a.AddNode(lblThis, 18, 0, -1, -1)";
_a.AddNode((javafx.scene.Node)(_lblthis.getObject()),18,0,-1,-1);
RDebugUtils.currentLine=7012364;
 //BA.debugLineNum = 7012364;BA.debugLine="MyComputerListView.Items.Add(a)";
__ref._mycomputerlistview.getItems().Add((Object)(_a.getObject()));
RDebugUtils.currentLine=7012365;
 //BA.debugLineNum = 7012365;BA.debugLine="If listThisDirectoryDirs.Size > 0 Then";
if (__ref._listthisdirectorydirs.getSize()>0) { 
RDebugUtils.currentLine=7012366;
 //BA.debugLineNum = 7012366;BA.debugLine="For i = 0 To listThisDirectoryDirs.Size -1";
{
final int step14 = 1;
final int limit14 = (int) (__ref._listthisdirectorydirs.getSize()-1);
for (_i = (int) (0) ; (step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14); _i = ((int)(0 + _i + step14)) ) {
RDebugUtils.currentLine=7012367;
 //BA.debugLineNum = 7012367;BA.debugLine="Dim a As AnchorPane";
_a = new anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper();
RDebugUtils.currentLine=7012368;
 //BA.debugLineNum = 7012368;BA.debugLine="a.Initialize(\"DeviceAnchorPane\")";
_a.Initialize(ba,"DeviceAnchorPane");
RDebugUtils.currentLine=7012369;
 //BA.debugLineNum = 7012369;BA.debugLine="Dim im As ImageView";
_im = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=7012370;
 //BA.debugLineNum = 7012370;BA.debugLine="im.Initialize(\"DeviceIcon\")";
_im.Initialize(ba,"DeviceIcon");
RDebugUtils.currentLine=7012371;
 //BA.debugLineNum = 7012371;BA.debugLine="im.SetImage(fx.LoadImage(File.DirAssets, \"folde";
_im.SetImage((javafx.scene.image.Image)(__ref._fx.LoadImage(__c.File.getDirAssets(),"folder.png").getObject()));
RDebugUtils.currentLine=7012372;
 //BA.debugLineNum = 7012372;BA.debugLine="a.AddNode(im, 0, 0, 16, 16)";
_a.AddNode((javafx.scene.Node)(_im.getObject()),0,0,16,16);
RDebugUtils.currentLine=7012373;
 //BA.debugLineNum = 7012373;BA.debugLine="Dim lblThis As Label";
_lblthis = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=7012374;
 //BA.debugLineNum = 7012374;BA.debugLine="lblThis.Initialize(\"DeviceList\")";
_lblthis.Initialize(ba,"DeviceList");
RDebugUtils.currentLine=7012375;
 //BA.debugLineNum = 7012375;BA.debugLine="lblThis.Text = listThisDirectoryDirs.Get(i)";
_lblthis.setText(BA.ObjectToString(__ref._listthisdirectorydirs.Get(_i)));
RDebugUtils.currentLine=7012376;
 //BA.debugLineNum = 7012376;BA.debugLine="a.AddNode(lblThis, 18, 0, -1, -1)";
_a.AddNode((javafx.scene.Node)(_lblthis.getObject()),18,0,-1,-1);
RDebugUtils.currentLine=7012377;
 //BA.debugLineNum = 7012377;BA.debugLine="MyComputerListView.Items.Add(a)";
__ref._mycomputerlistview.getItems().Add((Object)(_a.getObject()));
 }
};
 };
RDebugUtils.currentLine=7012380;
 //BA.debugLineNum = 7012380;BA.debugLine="If listThisDirectoryFiles.Size > 0 Then";
if (__ref._listthisdirectoryfiles.getSize()>0) { 
RDebugUtils.currentLine=7012381;
 //BA.debugLineNum = 7012381;BA.debugLine="For i = 0 To listThisDirectoryFiles.Size -1";
{
final int step29 = 1;
final int limit29 = (int) (__ref._listthisdirectoryfiles.getSize()-1);
for (_i = (int) (0) ; (step29 > 0 && _i <= limit29) || (step29 < 0 && _i >= limit29); _i = ((int)(0 + _i + step29)) ) {
RDebugUtils.currentLine=7012382;
 //BA.debugLineNum = 7012382;BA.debugLine="Dim a As AnchorPane";
_a = new anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper();
RDebugUtils.currentLine=7012383;
 //BA.debugLineNum = 7012383;BA.debugLine="a.Initialize(\"DeviceAnchorPane\")";
_a.Initialize(ba,"DeviceAnchorPane");
RDebugUtils.currentLine=7012384;
 //BA.debugLineNum = 7012384;BA.debugLine="Dim im As ImageView";
_im = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=7012385;
 //BA.debugLineNum = 7012385;BA.debugLine="im.Initialize(\"\")";
_im.Initialize(ba,"");
RDebugUtils.currentLine=7012386;
 //BA.debugLineNum = 7012386;BA.debugLine="im.SetImage(GetFileIcon(strThisDirectoryURI, li";
_im.SetImage((javafx.scene.image.Image)(__ref._getfileicon(null,__ref._strthisdirectoryuri,BA.ObjectToString(__ref._listthisdirectoryfiles.Get(_i))).getObject()));
RDebugUtils.currentLine=7012387;
 //BA.debugLineNum = 7012387;BA.debugLine="a.AddNode(im, 0, 0, 16, 16)";
_a.AddNode((javafx.scene.Node)(_im.getObject()),0,0,16,16);
RDebugUtils.currentLine=7012388;
 //BA.debugLineNum = 7012388;BA.debugLine="Dim lblThis As Label";
_lblthis = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=7012389;
 //BA.debugLineNum = 7012389;BA.debugLine="lblThis.Initialize(\"\")";
_lblthis.Initialize(ba,"");
RDebugUtils.currentLine=7012390;
 //BA.debugLineNum = 7012390;BA.debugLine="lblThis.Text = listThisDirectoryFiles.Get(i)";
_lblthis.setText(BA.ObjectToString(__ref._listthisdirectoryfiles.Get(_i)));
RDebugUtils.currentLine=7012391;
 //BA.debugLineNum = 7012391;BA.debugLine="a.AddNode(lblThis, 18, 0, -1, -1)";
_a.AddNode((javafx.scene.Node)(_lblthis.getObject()),18,0,-1,-1);
RDebugUtils.currentLine=7012392;
 //BA.debugLineNum = 7012392;BA.debugLine="MyComputerListView.Items.Add(a)";
__ref._mycomputerlistview.getItems().Add((Object)(_a.getObject()));
 }
};
 };
RDebugUtils.currentLine=7012395;
 //BA.debugLineNum = 7012395;BA.debugLine="End Sub";
return "";
}
public String  _currentdirectory(b4j.example.fileexplorer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="fileexplorer";
if (Debug.shouldDelegate(ba, "currentdirectory"))
	return (String) Debug.delegate(ba, "currentdirectory", null);
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Public Sub CurrentDirectory As String";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="Return strThisDirectoryURI";
if (true) return __ref._strthisdirectoryuri;
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="End Sub";
return "";
}
public String  _reloadcontents(b4j.example.fileexplorer __ref,String _dir) throws Exception{
__ref = this;
RDebugUtils.currentModule="fileexplorer";
if (Debug.shouldDelegate(ba, "reloadcontents"))
	return (String) Debug.delegate(ba, "reloadcontents", new Object[] {_dir});
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Public Sub ReloadContents(Dir As String)";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="If Dir <> \"\" Then";
if ((_dir).equals("") == false) { 
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="If File.IsDirectory(Dir, \"\") = True Then";
if (__c.File.IsDirectory(_dir,"")==__c.True) { 
RDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="generate_directory_content_list(Dir)";
__ref._generate_directory_content_list(null,_dir);
RDebugUtils.currentLine=7077892;
 //BA.debugLineNum = 7077892;BA.debugLine="LoadContents";
__ref._loadcontents(null);
 };
 }else {
RDebugUtils.currentLine=7077895;
 //BA.debugLineNum = 7077895;BA.debugLine="If File.IsDirectory(strThisDirectoryURI, \"\") = T";
if (__c.File.IsDirectory(__ref._strthisdirectoryuri,"")==__c.True) { 
RDebugUtils.currentLine=7077896;
 //BA.debugLineNum = 7077896;BA.debugLine="generate_directory_content_list(strThisDirector";
__ref._generate_directory_content_list(null,__ref._strthisdirectoryuri);
RDebugUtils.currentLine=7077897;
 //BA.debugLineNum = 7077897;BA.debugLine="LoadContents";
__ref._loadcontents(null);
 };
 };
RDebugUtils.currentLine=7077900;
 //BA.debugLineNum = 7077900;BA.debugLine="End Sub";
return "";
}
public String  _selecteditemuri(b4j.example.fileexplorer __ref,boolean _booldoubleclick) throws Exception{
__ref = this;
RDebugUtils.currentModule="fileexplorer";
if (Debug.shouldDelegate(ba, "selecteditemuri"))
	return (String) Debug.delegate(ba, "selecteditemuri", new Object[] {_booldoubleclick});
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Public Sub SelectedItemURI(boolDoubleClick As Bool";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="If boolDoubleClick = True Then";
if (_booldoubleclick==__c.True) { 
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="Return strDblClickSelectedItemURI";
if (true) return __ref._strdblclickselecteditemuri;
 }else {
RDebugUtils.currentLine=6946820;
 //BA.debugLineNum = 6946820;BA.debugLine="Return strSingleClickSelectedItemURI";
if (true) return __ref._strsingleclickselecteditemuri;
 };
RDebugUtils.currentLine=6946822;
 //BA.debugLineNum = 6946822;BA.debugLine="End Sub";
return "";
}
public String  _selecteditemtype(b4j.example.fileexplorer __ref,boolean _booldoubleclick) throws Exception{
__ref = this;
RDebugUtils.currentModule="fileexplorer";
if (Debug.shouldDelegate(ba, "selecteditemtype"))
	return (String) Debug.delegate(ba, "selecteditemtype", new Object[] {_booldoubleclick});
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Public Sub SelectedItemType(boolDoubleClick As Boo";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="If boolDoubleClick = True Then";
if (_booldoubleclick==__c.True) { 
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="Return strDblClickSelectedItemType";
if (true) return __ref._strdblclickselecteditemtype;
 }else {
RDebugUtils.currentLine=6815748;
 //BA.debugLineNum = 6815748;BA.debugLine="Return strSingleClickSelectedItemType";
if (true) return __ref._strsingleclickselecteditemtype;
 };
RDebugUtils.currentLine=6815750;
 //BA.debugLineNum = 6815750;BA.debugLine="End Sub";
return "";
}
public String  _selecteditemvalue(b4j.example.fileexplorer __ref,boolean _booldoubleclick) throws Exception{
__ref = this;
RDebugUtils.currentModule="fileexplorer";
if (Debug.shouldDelegate(ba, "selecteditemvalue"))
	return (String) Debug.delegate(ba, "selecteditemvalue", new Object[] {_booldoubleclick});
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Public Sub SelectedItemValue(boolDoubleClick As Bo";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="If boolDoubleClick = True Then";
if (_booldoubleclick==__c.True) { 
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="Return strDblClickSelectedItemValue";
if (true) return __ref._strdblclickselecteditemvalue;
 }else {
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="Return strSingleClickSelectedItemValue";
if (true) return __ref._strsingleclickselecteditemvalue;
 };
RDebugUtils.currentLine=6881286;
 //BA.debugLineNum = 6881286;BA.debugLine="End Sub";
return "";
}
public String  _renamefolder(b4j.example.fileexplorer __ref,String _strparent,String _strcurrentfoldername,String _strnewfolder) throws Exception{
__ref = this;
RDebugUtils.currentModule="fileexplorer";
if (Debug.shouldDelegate(ba, "renamefolder"))
	return (String) Debug.delegate(ba, "renamefolder", new Object[] {_strparent,_strcurrentfoldername,_strnewfolder});
anywheresoftware.b4j.object.JavaObject _jo1 = null;
anywheresoftware.b4j.object.JavaObject _jo2 = null;
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Public Sub RenameFolder(strParent As String, strCu";
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="If File.IsDirectory(strParent, strCurrentFolderNa";
if (__c.File.IsDirectory(_strparent,_strcurrentfoldername)==__c.True) { 
RDebugUtils.currentLine=7143427;
 //BA.debugLineNum = 7143427;BA.debugLine="If File.IsDirectory(strParent, strNewFolder) = F";
if (__c.File.IsDirectory(_strparent,_strnewfolder)==__c.False) { 
RDebugUtils.currentLine=7143428;
 //BA.debugLineNum = 7143428;BA.debugLine="Dim jo1, jo2 As JavaObject";
_jo1 = new anywheresoftware.b4j.object.JavaObject();
_jo2 = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=7143429;
 //BA.debugLineNum = 7143429;BA.debugLine="jo1.InitializeNewInstance(\"java.io.File\", Array";
_jo1.InitializeNewInstance("java.io.File",new Object[]{(Object)(__c.File.Combine(_strparent,_strcurrentfoldername))});
RDebugUtils.currentLine=7143430;
 //BA.debugLineNum = 7143430;BA.debugLine="jo2.InitializeNewInstance(\"java.io.File\", Array";
_jo2.InitializeNewInstance("java.io.File",new Object[]{(Object)(__c.File.Combine(_strparent,_strnewfolder))});
RDebugUtils.currentLine=7143431;
 //BA.debugLineNum = 7143431;BA.debugLine="Log(jo1.RunMethod(\"renameTo\", Array(jo2)))";
__c.Log(BA.ObjectToString(_jo1.RunMethod("renameTo",new Object[]{(Object)(_jo2.getObject())})));
 };
 };
RDebugUtils.currentLine=7143434;
 //BA.debugLineNum = 7143434;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _getfileicon(b4j.example.fileexplorer __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="fileexplorer";
if (Debug.shouldDelegate(ba, "getfileicon"))
	return (anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) Debug.delegate(ba, "getfileicon", new Object[] {_dir,_filename});
anywheresoftware.b4j.object.JavaObject _javafile = null;
anywheresoftware.b4j.object.JavaObject _icon = null;
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Public Sub GetFileIcon(Dir As String, FileName As";
RDebugUtils.currentLine=7340036;
 //BA.debugLineNum = 7340036;BA.debugLine="If File.IsDirectory(Dir, FileName) = False Then";
if (__c.File.IsDirectory(_dir,_filename)==__c.False) { 
RDebugUtils.currentLine=7340037;
 //BA.debugLineNum = 7340037;BA.debugLine="If File.Exists(Dir, FileName) = True Then";
if (__c.File.Exists(_dir,_filename)==__c.True) { 
RDebugUtils.currentLine=7340038;
 //BA.debugLineNum = 7340038;BA.debugLine="Dim JO As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=7340039;
 //BA.debugLineNum = 7340039;BA.debugLine="Dim JavaFile As JavaObject";
_javafile = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=7340040;
 //BA.debugLineNum = 7340040;BA.debugLine="JavaFile.InitializeNewInstance(\"java.io.File\",";
_javafile.InitializeNewInstance("java.io.File",new Object[]{(Object)(__c.File.Combine(_dir,_filename))});
RDebugUtils.currentLine=7340041;
 //BA.debugLineNum = 7340041;BA.debugLine="Dim icon As JavaObject = JO.InitializeStatic(\"s";
_icon = new anywheresoftware.b4j.object.JavaObject();
_icon.setObject((java.lang.Object)(__ref._jo.InitializeStatic("sun.awt.shell.ShellFolder").RunMethodJO("getShellFolder",new Object[]{(Object)(_javafile.getObject())}).RunMethod("getIcon",new Object[]{(Object)(__c.True)})));
RDebugUtils.currentLine=7340042;
 //BA.debugLineNum = 7340042;BA.debugLine="If icon.IsInitialized = True Then";
if (_icon.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=7340043;
 //BA.debugLineNum = 7340043;BA.debugLine="Return fileicon_to_image(icon)";
if (true) return __ref._fileicon_to_image(null,_icon);
 }else {
RDebugUtils.currentLine=7340045;
 //BA.debugLineNum = 7340045;BA.debugLine="Return DefaultImage";
if (true) return __ref._defaultimage;
 };
 }else {
RDebugUtils.currentLine=7340048;
 //BA.debugLineNum = 7340048;BA.debugLine="Return DefaultImage";
if (true) return __ref._defaultimage;
 };
 }else {
RDebugUtils.currentLine=7340051;
 //BA.debugLineNum = 7340051;BA.debugLine="Return DefaultImage";
if (true) return __ref._defaultimage;
 };
RDebugUtils.currentLine=7340053;
 //BA.debugLineNum = 7340053;BA.debugLine="End Sub";
return null;
}
public String  _mouseclicked(b4j.example.fileexplorer __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="fileexplorer";
if (Debug.shouldDelegate(ba, "mouseclicked"))
	return (String) Debug.delegate(ba, "mouseclicked", new Object[] {_eventdata});
anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper _ap = null;
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Public Sub MouseClicked (EventData As MouseEvent)";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="strSingleClickSelectedItemType = \"\"";
__ref._strsingleclickselecteditemtype = "";
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="strSingleClickSelectedItemValue = \"\"";
__ref._strsingleclickselecteditemvalue = "";
RDebugUtils.currentLine=7208963;
 //BA.debugLineNum = 7208963;BA.debugLine="strSingleClickSelectedItemURI  = \"\"";
__ref._strsingleclickselecteditemuri = "";
RDebugUtils.currentLine=7208964;
 //BA.debugLineNum = 7208964;BA.debugLine="strDblClickSelectedItemType = \"\"";
__ref._strdblclickselecteditemtype = "";
RDebugUtils.currentLine=7208965;
 //BA.debugLineNum = 7208965;BA.debugLine="strDblClickSelectedItemValue = \"\"";
__ref._strdblclickselecteditemvalue = "";
RDebugUtils.currentLine=7208966;
 //BA.debugLineNum = 7208966;BA.debugLine="strDblClickSelectedItemURI  = \"\"";
__ref._strdblclickselecteditemuri = "";
RDebugUtils.currentLine=7208967;
 //BA.debugLineNum = 7208967;BA.debugLine="If intLastSelectedIndex > -1 Then";
if (__ref._intlastselectedindex>-1) { 
RDebugUtils.currentLine=7208968;
 //BA.debugLineNum = 7208968;BA.debugLine="Dim ap As AnchorPane = MyComputerListView.Items.";
_ap = new anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper();
_ap.setObject((javafx.scene.layout.AnchorPane)(__ref._mycomputerlistview.getItems().Get(__ref._intlastselectedindex)));
RDebugUtils.currentLine=7208969;
 //BA.debugLineNum = 7208969;BA.debugLine="If ap.NumberOfNodes = 2 Then";
if (_ap.getNumberOfNodes()==2) { 
RDebugUtils.currentLine=7208970;
 //BA.debugLineNum = 7208970;BA.debugLine="If GetType(ap.GetNode(1)) = \"javafx.scene.contr";
if ((__c.GetType((Object)(_ap.GetNode((int) (1)).getObject()))).equals("javafx.scene.control.Label")) { 
RDebugUtils.currentLine=7208972;
 //BA.debugLineNum = 7208972;BA.debugLine="If intLastSelectedIndex = 0 Then";
if (__ref._intlastselectedindex==0) { 
RDebugUtils.currentLine=7208973;
 //BA.debugLineNum = 7208973;BA.debugLine="strSingleClickSelectedItemType = \"parent\"";
__ref._strsingleclickselecteditemtype = "parent";
RDebugUtils.currentLine=7208974;
 //BA.debugLineNum = 7208974;BA.debugLine="strSingleClickSelectedItemValue = \"\"";
__ref._strsingleclickselecteditemvalue = "";
RDebugUtils.currentLine=7208975;
 //BA.debugLineNum = 7208975;BA.debugLine="strSingleClickSelectedItemURI  = \"\"";
__ref._strsingleclickselecteditemuri = "";
RDebugUtils.currentLine=7208976;
 //BA.debugLineNum = 7208976;BA.debugLine="If SubExists(mModule, mEventName&\"_MouseClick";
if (__c.SubExists(ba,__ref._mmodule,__ref._meventname+"_MouseClick")) { 
__c.CallSubNew2(ba,__ref._mmodule,__ref._meventname+"_MouseClick",(Object)(__c.File.GetFileParent(__ref._strthisdirectoryuri)));};
RDebugUtils.currentLine=7208977;
 //BA.debugLineNum = 7208977;BA.debugLine="If EventData.ClickCount > 1 Then";
if (_eventdata.getClickCount()>1) { 
RDebugUtils.currentLine=7208978;
 //BA.debugLineNum = 7208978;BA.debugLine="strDblClickSelectedItemType = \"parent\"";
__ref._strdblclickselecteditemtype = "parent";
RDebugUtils.currentLine=7208979;
 //BA.debugLineNum = 7208979;BA.debugLine="strDblClickSelectedItemValue = \"\"";
__ref._strdblclickselecteditemvalue = "";
RDebugUtils.currentLine=7208980;
 //BA.debugLineNum = 7208980;BA.debugLine="strDblClickSelectedItemURI  = \"\"";
__ref._strdblclickselecteditemuri = "";
RDebugUtils.currentLine=7208981;
 //BA.debugLineNum = 7208981;BA.debugLine="change_directory(File.GetFileParent(strThisD";
__ref._change_directory(null,__c.File.GetFileParent(__ref._strthisdirectoryuri));
 };
 }else 
{RDebugUtils.currentLine=7208983;
 //BA.debugLineNum = 7208983;BA.debugLine="Else If intLastSelectedIndex > ((listThisDirec";
if (__ref._intlastselectedindex>((__ref._listthisdirectorydirs.getSize()-1)+1)) { 
RDebugUtils.currentLine=7208985;
 //BA.debugLineNum = 7208985;BA.debugLine="strSingleClickSelectedItemType = \"file\"";
__ref._strsingleclickselecteditemtype = "file";
RDebugUtils.currentLine=7208986;
 //BA.debugLineNum = 7208986;BA.debugLine="strSingleClickSelectedItemValue = listThisDir";
__ref._strsingleclickselecteditemvalue = BA.ObjectToString(__ref._listthisdirectoryfiles.Get((int) ((__ref._intlastselectedindex-1)-__ref._listthisdirectorydirs.getSize())));
RDebugUtils.currentLine=7208987;
 //BA.debugLineNum = 7208987;BA.debugLine="strSingleClickSelectedItemURI  = File.Combine";
__ref._strsingleclickselecteditemuri = __c.File.Combine(__ref._strthisdirectoryuri,BA.ObjectToString(__ref._listthisdirectoryfiles.Get((int) ((__ref._intlastselectedindex-1)-__ref._listthisdirectorydirs.getSize()))));
RDebugUtils.currentLine=7208988;
 //BA.debugLineNum = 7208988;BA.debugLine="If SubExists(mModule, mEventName&\"_MouseClick";
if (__c.SubExists(ba,__ref._mmodule,__ref._meventname+"_MouseClick")) { 
__c.CallSubNew2(ba,__ref._mmodule,__ref._meventname+"_MouseClick",(Object)(__c.File.GetFileParent(__ref._strthisdirectoryuri)));};
RDebugUtils.currentLine=7208989;
 //BA.debugLineNum = 7208989;BA.debugLine="If EventData.ClickCount > 1 Then";
if (_eventdata.getClickCount()>1) { 
RDebugUtils.currentLine=7208990;
 //BA.debugLineNum = 7208990;BA.debugLine="strDblClickSelectedItemType = \"file\"";
__ref._strdblclickselecteditemtype = "file";
RDebugUtils.currentLine=7208991;
 //BA.debugLineNum = 7208991;BA.debugLine="strDblClickSelectedItemValue = listThisDirec";
__ref._strdblclickselecteditemvalue = BA.ObjectToString(__ref._listthisdirectoryfiles.Get((int) ((__ref._intlastselectedindex-1)-__ref._listthisdirectorydirs.getSize())));
RDebugUtils.currentLine=7208992;
 //BA.debugLineNum = 7208992;BA.debugLine="strDblClickSelectedItemURI  = File.Combine(s";
__ref._strdblclickselecteditemuri = __c.File.Combine(__ref._strthisdirectoryuri,BA.ObjectToString(__ref._listthisdirectoryfiles.Get((int) ((__ref._intlastselectedindex-1)-__ref._listthisdirectorydirs.getSize()))));
RDebugUtils.currentLine=7208993;
 //BA.debugLineNum = 7208993;BA.debugLine="If SubExists(mModule, mEventName&\"_DoubleCli";
if (__c.SubExists(ba,__ref._mmodule,__ref._meventname+"_DoubleClick")) { 
__c.CallSubNew2(ba,__ref._mmodule,__ref._meventname+"_DoubleClick",(Object)(__ref._strdblclickselecteditemuri));};
 };
 }else {
RDebugUtils.currentLine=7208997;
 //BA.debugLineNum = 7208997;BA.debugLine="strSingleClickSelectedItemType = \"directory\"";
__ref._strsingleclickselecteditemtype = "directory";
RDebugUtils.currentLine=7208998;
 //BA.debugLineNum = 7208998;BA.debugLine="strSingleClickSelectedItemValue = listThisDir";
__ref._strsingleclickselecteditemvalue = BA.ObjectToString(__ref._listthisdirectorydirs.Get((int) (__ref._intlastselectedindex-1)));
RDebugUtils.currentLine=7208999;
 //BA.debugLineNum = 7208999;BA.debugLine="strSingleClickSelectedItemURI  = File.Combine";
__ref._strsingleclickselecteditemuri = __c.File.Combine(__ref._strthisdirectoryuri,BA.ObjectToString(__ref._listthisdirectorydirs.Get((int) (__ref._intlastselectedindex-1))));
RDebugUtils.currentLine=7209000;
 //BA.debugLineNum = 7209000;BA.debugLine="If SubExists(mModule, mEventName&\"_MouseClick";
if (__c.SubExists(ba,__ref._mmodule,__ref._meventname+"_MouseClick")) { 
__c.CallSubNew2(ba,__ref._mmodule,__ref._meventname+"_MouseClick",(Object)(__c.File.GetFileParent(__ref._strthisdirectoryuri)));};
RDebugUtils.currentLine=7209001;
 //BA.debugLineNum = 7209001;BA.debugLine="If EventData.ClickCount > 1 Then";
if (_eventdata.getClickCount()>1) { 
RDebugUtils.currentLine=7209002;
 //BA.debugLineNum = 7209002;BA.debugLine="strDblClickSelectedItemType = \"directory\"";
__ref._strdblclickselecteditemtype = "directory";
RDebugUtils.currentLine=7209003;
 //BA.debugLineNum = 7209003;BA.debugLine="strDblClickSelectedItemValue = listThisDirec";
__ref._strdblclickselecteditemvalue = BA.ObjectToString(__ref._listthisdirectorydirs.Get((int) (__ref._intlastselectedindex-1)));
RDebugUtils.currentLine=7209004;
 //BA.debugLineNum = 7209004;BA.debugLine="strDblClickSelectedItemURI  = File.Combine(s";
__ref._strdblclickselecteditemuri = __c.File.Combine(__ref._strthisdirectoryuri,BA.ObjectToString(__ref._listthisdirectorydirs.Get((int) (__ref._intlastselectedindex-1))));
RDebugUtils.currentLine=7209006;
 //BA.debugLineNum = 7209006;BA.debugLine="change_directory(File.Combine(strThisDirecto";
__ref._change_directory(null,__c.File.Combine(__ref._strthisdirectoryuri,BA.ObjectToString(__ref._listthisdirectorydirs.Get((int) (__ref._intlastselectedindex-1)))));
 };
 }};
 };
 };
RDebugUtils.currentLine=7209013;
 //BA.debugLineNum = 7209013;BA.debugLine="If SubExists(mModule, mEventName&\"_SelectedIndex";
if (__c.SubExists(ba,__ref._mmodule,__ref._meventname+"_SelectedIndexChanged")) { 
__c.CallSubNew2(ba,__ref._mmodule,__ref._meventname+"_SelectedIndexChanged",(Object)(__ref._intlastselectedindex));};
 };
RDebugUtils.currentLine=7209016;
 //BA.debugLineNum = 7209016;BA.debugLine="End Sub";
return "";
}
public String  _selectedindex(b4j.example.fileexplorer __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="fileexplorer";
if (Debug.shouldDelegate(ba, "selectedindex"))
	return (String) Debug.delegate(ba, "selectedindex", new Object[] {_index});
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Public Sub SelectedIndex(Index As Int)";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="If Index > -1 Then";
if (_index>-1) { 
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="intLastSelectedIndex = Index";
__ref._intlastselectedindex = _index;
 }else {
RDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="intLastSelectedIndex = 0";
__ref._intlastselectedindex = (int) (0);
 };
RDebugUtils.currentLine=7274502;
 //BA.debugLineNum = 7274502;BA.debugLine="End Sub";
return "";
}
public String  _change_directory(b4j.example.fileexplorer __ref,String _strnewdirectory) throws Exception{
__ref = this;
RDebugUtils.currentModule="fileexplorer";
if (Debug.shouldDelegate(ba, "change_directory"))
	return (String) Debug.delegate(ba, "change_directory", new Object[] {_strnewdirectory});
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Private Sub change_directory(strNewDirectory As St";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="If File.IsDirectory(strNewDirectory, \"\") = True T";
if (__c.File.IsDirectory(_strnewdirectory,"")==__c.True) { 
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="generate_directory_content_list(strNewDirectory)";
__ref._generate_directory_content_list(null,_strnewdirectory);
RDebugUtils.currentLine=7471107;
 //BA.debugLineNum = 7471107;BA.debugLine="LoadContents";
__ref._loadcontents(null);
 };
RDebugUtils.currentLine=7471109;
 //BA.debugLineNum = 7471109;BA.debugLine="End Sub";
return "";
}
public String  _generate_directory_content_list(b4j.example.fileexplorer __ref,String _dir) throws Exception{
__ref = this;
RDebugUtils.currentModule="fileexplorer";
if (Debug.shouldDelegate(ba, "generate_directory_content_list"))
	return (String) Debug.delegate(ba, "generate_directory_content_list", new Object[] {_dir});
int _i = 0;
String _strfile = "";
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Private Sub generate_directory_content_list(Dir As";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="strThisDirectoryURI = Dir";
__ref._strthisdirectoryuri = _dir;
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="If File.IsDirectory(strThisDirectoryURI, \"\") = Tr";
if (__c.File.IsDirectory(__ref._strthisdirectoryuri,"")==__c.True) { 
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="listThisDirectoryDirs.Clear";
__ref._listthisdirectorydirs.Clear();
RDebugUtils.currentLine=7536644;
 //BA.debugLineNum = 7536644;BA.debugLine="listThisDirectoryFiles.Clear";
__ref._listthisdirectoryfiles.Clear();
RDebugUtils.currentLine=7536645;
 //BA.debugLineNum = 7536645;BA.debugLine="listThisDirectoryContents = File.ListFiles(strTh";
__ref._listthisdirectorycontents = __c.File.ListFiles(__ref._strthisdirectoryuri);
RDebugUtils.currentLine=7536646;
 //BA.debugLineNum = 7536646;BA.debugLine="If listThisDirectoryContents.IsInitialized = Tru";
if (__ref._listthisdirectorycontents.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=7536647;
 //BA.debugLineNum = 7536647;BA.debugLine="For i = 0 To listThisDirectoryContents.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._listthisdirectorycontents.getSize()-1);
for (_i = (int) (0) ; (step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7); _i = ((int)(0 + _i + step7)) ) {
RDebugUtils.currentLine=7536648;
 //BA.debugLineNum = 7536648;BA.debugLine="Dim strFile As String = File.GetName(listThisD";
_strfile = __c.File.GetName(BA.ObjectToString(__ref._listthisdirectorycontents.Get(_i)));
RDebugUtils.currentLine=7536649;
 //BA.debugLineNum = 7536649;BA.debugLine="If File.IsDirectory(strThisDirectoryURI, strFi";
if (__c.File.IsDirectory(__ref._strthisdirectoryuri,_strfile)==__c.True) { 
RDebugUtils.currentLine=7536650;
 //BA.debugLineNum = 7536650;BA.debugLine="listThisDirectoryDirs.Add(strFile)";
__ref._listthisdirectorydirs.Add((Object)(_strfile));
 }else {
RDebugUtils.currentLine=7536652;
 //BA.debugLineNum = 7536652;BA.debugLine="listThisDirectoryFiles.Add(strFile)";
__ref._listthisdirectoryfiles.Add((Object)(_strfile));
 };
 }
};
 };
RDebugUtils.currentLine=7536656;
 //BA.debugLineNum = 7536656;BA.debugLine="If SubExists(mModule, mEventName&\"_ChangeDirecto";
if (__c.SubExists(ba,__ref._mmodule,__ref._meventname+"_ChangeDirectory")) { 
__c.CallSubNew2(ba,__ref._mmodule,__ref._meventname+"_ChangeDirectory",(Object)(__ref._strthisdirectoryuri));};
 };
RDebugUtils.currentLine=7536658;
 //BA.debugLineNum = 7536658;BA.debugLine="If listThisDirectoryDirs.Size > 0 Then";
if (__ref._listthisdirectorydirs.getSize()>0) { 
RDebugUtils.currentLine=7536659;
 //BA.debugLineNum = 7536659;BA.debugLine="listThisDirectoryDirs.Sort(True)";
__ref._listthisdirectorydirs.Sort(__c.True);
 };
RDebugUtils.currentLine=7536661;
 //BA.debugLineNum = 7536661;BA.debugLine="If listThisDirectoryFiles.Size > 0 Then";
if (__ref._listthisdirectoryfiles.getSize()>0) { 
RDebugUtils.currentLine=7536662;
 //BA.debugLineNum = 7536662;BA.debugLine="listThisDirectoryFiles.Sort(True)";
__ref._listthisdirectoryfiles.Sort(__c.True);
 };
RDebugUtils.currentLine=7536664;
 //BA.debugLineNum = 7536664;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.fileexplorer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="fileexplorer";
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="Private f As FileChooser";
_f = new anywheresoftware.b4j.objects.FileChooserWrapper();
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="Private MyComputerListView As ListView";
_mycomputerlistview = new anywheresoftware.b4j.objects.ListViewWrapper();
RDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="Private strThisDirectoryURI As String";
_strthisdirectoryuri = "";
RDebugUtils.currentLine=6619141;
 //BA.debugLineNum = 6619141;BA.debugLine="Private listThisDirectoryContents As List";
_listthisdirectorycontents = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6619142;
 //BA.debugLineNum = 6619142;BA.debugLine="Private listThisDirectoryDirs As List";
_listthisdirectorydirs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6619143;
 //BA.debugLineNum = 6619143;BA.debugLine="Private listThisDirectoryFiles As List";
_listthisdirectoryfiles = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6619144;
 //BA.debugLineNum = 6619144;BA.debugLine="Private intLastSelectedIndex As Int";
_intlastselectedindex = 0;
RDebugUtils.currentLine=6619146;
 //BA.debugLineNum = 6619146;BA.debugLine="Private strSingleClickSelectedItemType As String";
_strsingleclickselecteditemtype = "";
RDebugUtils.currentLine=6619147;
 //BA.debugLineNum = 6619147;BA.debugLine="Private strSingleClickSelectedItemValue As String";
_strsingleclickselecteditemvalue = "";
RDebugUtils.currentLine=6619148;
 //BA.debugLineNum = 6619148;BA.debugLine="Private strSingleClickSelectedItemURI As String";
_strsingleclickselecteditemuri = "";
RDebugUtils.currentLine=6619150;
 //BA.debugLineNum = 6619150;BA.debugLine="Private strDblClickSelectedItemType As String";
_strdblclickselecteditemtype = "";
RDebugUtils.currentLine=6619151;
 //BA.debugLineNum = 6619151;BA.debugLine="Private strDblClickSelectedItemValue As String";
_strdblclickselecteditemvalue = "";
RDebugUtils.currentLine=6619152;
 //BA.debugLineNum = 6619152;BA.debugLine="Private strDblClickSelectedItemURI As String";
_strdblclickselecteditemuri = "";
RDebugUtils.currentLine=6619154;
 //BA.debugLineNum = 6619154;BA.debugLine="Private DefaultImage As Image";
_defaultimage = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
RDebugUtils.currentLine=6619155;
 //BA.debugLineNum = 6619155;BA.debugLine="Private JO As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=6619156;
 //BA.debugLineNum = 6619156;BA.debugLine="Private mModule As Object";
_mmodule = new Object();
RDebugUtils.currentLine=6619157;
 //BA.debugLineNum = 6619157;BA.debugLine="Private mEventName As String";
_meventname = "";
RDebugUtils.currentLine=6619158;
 //BA.debugLineNum = 6619158;BA.debugLine="Private ListenerIndexChange As Object";
_listenerindexchange = new Object();
RDebugUtils.currentLine=6619159;
 //BA.debugLineNum = 6619159;BA.debugLine="Private ListenerDblClick As Object";
_listenerdblclick = new Object();
RDebugUtils.currentLine=6619160;
 //BA.debugLineNum = 6619160;BA.debugLine="Private ListenerMouseClick As Object";
_listenermouseclick = new Object();
RDebugUtils.currentLine=6619161;
 //BA.debugLineNum = 6619161;BA.debugLine="Private ListenerChangeDirectory As Object";
_listenerchangedirectory = new Object();
RDebugUtils.currentLine=6619163;
 //BA.debugLineNum = 6619163;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _fileicon_to_image(b4j.example.fileexplorer __ref,anywheresoftware.b4j.object.JavaObject _img) throws Exception{
__ref = this;
RDebugUtils.currentModule="fileexplorer";
if (Debug.shouldDelegate(ba, "fileicon_to_image"))
	return (anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) Debug.delegate(ba, "fileicon_to_image", new Object[] {_img});
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Private Sub fileicon_to_image(img As JavaObject) A";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="Dim JO As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="Return JO.InitializeStatic(\"javafx.embed.swing.Sw";
if (true) return (anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(__ref._jo.InitializeStatic("javafx.embed.swing.SwingFXUtils").RunMethod("toFXImage",new Object[]{(Object)(_img.getObject()),__c.Null})));
RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="End Sub";
return null;
}
}