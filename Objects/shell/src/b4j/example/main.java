
package b4j.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new main();
		remoteMe = RemoteObject.declareNull("b4j.example.main");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "b4j.example.main");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, main.class);
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
    public static RemoteObject getObject() {
		return myClass;
	 }
	public PCBA create(Object[] args) throws ClassNotFoundException{
		ba = (RemoteObject) args[1];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _mainform = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _explorer = RemoteObject.declareNull("b4j.example.fileexplorer");
public static RemoteObject _lvselected = RemoteObject.declareNull("anywheresoftware.b4j.objects.ListViewWrapper");
public static RemoteObject _lvdevice = RemoteObject.declareNull("anywheresoftware.b4j.objects.ListViewWrapper");
public static RemoteObject _lblselected = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _intselectedindex = RemoteObject.createImmutable(0);
public static RemoteObject _mapselecteduri = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _dialogue8 = RemoteObject.declareNull("b4j.example.dialogs8");
public static RemoteObject _splitmain = RemoteObject.declareNull("anywheresoftware.b4j.objects.SplitPaneWrapper");
public static RemoteObject _combofolder = RemoteObject.declareNull("anywheresoftware.b4j.objects.ComboBoxWrapper");
public static RemoteObject _lblcurrentdirectoryname = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
  public Object[] GetGlobals() {
		return new Object[] {"comboFolder",main._combofolder,"dialogue8",main._dialogue8,"explorer",main._explorer,"fx",main._fx,"intSelectedIndex",main._intselectedindex,"lblCurrentDirectoryName",main._lblcurrentdirectoryname,"lblSelected",main._lblselected,"lvDevice",main._lvdevice,"lvSelected",main._lvselected,"MainForm",main._mainform,"mapSelectedURI",main._mapselecteduri,"splitMain",main._splitmain};
}
}