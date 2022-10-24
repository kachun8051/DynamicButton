
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class cvdynamicbutton {
    public static RemoteObject myClass;
	public cvdynamicbutton() {
	}
    public static PCBA staticBA = new PCBA(null, cvdynamicbutton.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _defaultcolorconstant = RemoteObject.createImmutable(0);
public static RemoteObject _m_numofcol = RemoteObject.createImmutable(0);
public static RemoteObject _m_numofrow = RemoteObject.createImmutable(0);
public static RemoteObject _m_btnwidth = RemoteObject.createImmutable(0);
public static RemoteObject _m_btnheight = RemoteObject.createImmutable(0);
public static RemoteObject _m_panelwidth = RemoteObject.createImmutable(0);
public static RemoteObject _m_panelheight = RemoteObject.createImmutable(0);
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"DefaultColorConstant",_ref.getField(false, "_defaultcolorconstant"),"m_BtnHeight",_ref.getField(false, "_m_btnheight"),"m_BtnWidth",_ref.getField(false, "_m_btnwidth"),"m_NumOfCol",_ref.getField(false, "_m_numofcol"),"m_NumOfRow",_ref.getField(false, "_m_numofrow"),"m_PanelHeight",_ref.getField(false, "_m_panelheight"),"m_PanelWidth",_ref.getField(false, "_m_panelwidth"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname")};
}
}