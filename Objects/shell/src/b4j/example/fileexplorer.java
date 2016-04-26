
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class fileexplorer {
    public static RemoteObject myClass;
	public fileexplorer() {
	}
    public static PCBA staticBA = new PCBA(null, fileexplorer.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _f = RemoteObject.declareNull("anywheresoftware.b4j.objects.FileChooserWrapper");
public static RemoteObject _mycomputerlistview = RemoteObject.declareNull("anywheresoftware.b4j.objects.ListViewWrapper");
public static RemoteObject _strthisdirectoryuri = RemoteObject.createImmutable("");
public static RemoteObject _listthisdirectorycontents = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _listthisdirectorydirs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _listthisdirectoryfiles = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _intlastselectedindex = RemoteObject.createImmutable(0);
public static RemoteObject _strsingleclickselecteditemtype = RemoteObject.createImmutable("");
public static RemoteObject _strsingleclickselecteditemvalue = RemoteObject.createImmutable("");
public static RemoteObject _strsingleclickselecteditemuri = RemoteObject.createImmutable("");
public static RemoteObject _strdblclickselecteditemtype = RemoteObject.createImmutable("");
public static RemoteObject _strdblclickselecteditemvalue = RemoteObject.createImmutable("");
public static RemoteObject _strdblclickselecteditemuri = RemoteObject.createImmutable("");
public static RemoteObject _defaultimage = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
public static RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _mmodule = RemoteObject.declareNull("Object");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _listenerindexchange = RemoteObject.declareNull("Object");
public static RemoteObject _listenerdblclick = RemoteObject.declareNull("Object");
public static RemoteObject _listenermouseclick = RemoteObject.declareNull("Object");
public static RemoteObject _listenerchangedirectory = RemoteObject.declareNull("Object");
public static b4j.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"DefaultImage",_ref.getField(false, "_defaultimage"),"f",_ref.getField(false, "_f"),"fx",_ref.getField(false, "_fx"),"intLastSelectedIndex",_ref.getField(false, "_intlastselectedindex"),"JO",_ref.getField(false, "_jo"),"ListenerChangeDirectory",_ref.getField(false, "_listenerchangedirectory"),"ListenerDblClick",_ref.getField(false, "_listenerdblclick"),"ListenerIndexChange",_ref.getField(false, "_listenerindexchange"),"ListenerMouseClick",_ref.getField(false, "_listenermouseclick"),"listThisDirectoryContents",_ref.getField(false, "_listthisdirectorycontents"),"listThisDirectoryDirs",_ref.getField(false, "_listthisdirectorydirs"),"listThisDirectoryFiles",_ref.getField(false, "_listthisdirectoryfiles"),"mEventName",_ref.getField(false, "_meventname"),"mModule",_ref.getField(false, "_mmodule"),"MyComputerListView",_ref.getField(false, "_mycomputerlistview"),"strDblClickSelectedItemType",_ref.getField(false, "_strdblclickselecteditemtype"),"strDblClickSelectedItemURI",_ref.getField(false, "_strdblclickselecteditemuri"),"strDblClickSelectedItemValue",_ref.getField(false, "_strdblclickselecteditemvalue"),"strSingleClickSelectedItemType",_ref.getField(false, "_strsingleclickselecteditemtype"),"strSingleClickSelectedItemURI",_ref.getField(false, "_strsingleclickselecteditemuri"),"strSingleClickSelectedItemValue",_ref.getField(false, "_strsingleclickselecteditemvalue"),"strThisDirectoryURI",_ref.getField(false, "_strthisdirectoryuri")};
}
}