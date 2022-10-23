package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cvdynamicbutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.cvdynamicbutton");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.cvdynamicbutton.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _pos{
public boolean IsInitialized;
public int x;
public int y;
public void Initialize() {
IsInitialized = true;
x = 0;
y = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public int _defaultcolorconstant = 0;
public int _m_numofcol = 0;
public int _m_numofrow = 0;
public int _m_btnwidth = 0;
public int _m_btnheight = 0;
public int _m_activitywidth = 0;
public int _m_activityheight = 0;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public String  _initialize(b4a.example.cvdynamicbutton __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cvdynamicbutton";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="End Sub";
return "";
}
public String  _setactivityheightwidth(b4a.example.cvdynamicbutton __ref,int _h,int _w) throws Exception{
__ref = this;
RDebugUtils.currentModule="cvdynamicbutton";
if (Debug.shouldDelegate(ba, "setactivityheightwidth", false))
	 {return ((String) Debug.delegate(ba, "setactivityheightwidth", new Object[] {_h,_w}));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub setActivityHeightWidth(h As Int, w As I";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="m_ActivityHeight = h";
__ref._m_activityheight /*int*/  = _h;
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="m_ActivityWidth = w";
__ref._m_activitywidth /*int*/  = _w;
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="m_BtnWidth = m_ActivityWidth / m_NumOfCol";
__ref._m_btnwidth /*int*/  = (int) (__ref._m_activitywidth /*int*/ /(double)__ref._m_numofcol /*int*/ );
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="m_BtnHeight = m_ActivityHeight / 5";
__ref._m_btnheight /*int*/  = (int) (__ref._m_activityheight /*int*/ /(double)5);
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="Log(\"Activity's Height: \" & m_ActivityHeight)";
__c.LogImpl("71507333","Activity's Height: "+BA.NumberToString(__ref._m_activityheight /*int*/ ),0);
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="Log(\"Activity's Width: \" & m_ActivityWidth)";
__c.LogImpl("71507334","Activity's Width: "+BA.NumberToString(__ref._m_activitywidth /*int*/ ),0);
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="Log(\"Button's Height: \" & m_BtnHeight)";
__c.LogImpl("71507335","Button's Height: "+BA.NumberToString(__ref._m_btnheight /*int*/ ),0);
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="Log(\"Button's Width: \" & m_BtnWidth)";
__c.LogImpl("71507336","Button's Width: "+BA.NumberToString(__ref._m_btnwidth /*int*/ ),0);
RDebugUtils.currentLine=1507337;
 //BA.debugLineNum = 1507337;BA.debugLine="End Sub";
return "";
}
public String  _setnumofrow(b4a.example.cvdynamicbutton __ref,int _val) throws Exception{
__ref = this;
RDebugUtils.currentModule="cvdynamicbutton";
if (Debug.shouldDelegate(ba, "setnumofrow", false))
	 {return ((String) Debug.delegate(ba, "setnumofrow", new Object[] {_val}));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub setNumOfRow(val As Int)";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="m_NumOfRow = val";
__ref._m_numofrow /*int*/  = _val;
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return "";
}
public int  _getbtnheight(b4a.example.cvdynamicbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cvdynamicbutton";
if (Debug.shouldDelegate(ba, "getbtnheight", false))
	 {return ((Integer) Debug.delegate(ba, "getbtnheight", null));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub getBtnHeight() As Int";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Return m_BtnHeight";
if (true) return __ref._m_btnheight /*int*/ ;
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="End Sub";
return 0;
}
public int  _getnumofrow(b4a.example.cvdynamicbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cvdynamicbutton";
if (Debug.shouldDelegate(ba, "getnumofrow", false))
	 {return ((Integer) Debug.delegate(ba, "getnumofrow", null));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub getNumOfRow() As Int";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Return m_NumOfRow";
if (true) return __ref._m_numofrow /*int*/ ;
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="End Sub";
return 0;
}
public String  _createbuttons(b4a.example.cvdynamicbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cvdynamicbutton";
if (Debug.shouldDelegate(ba, "createbuttons", false))
	 {return ((String) Debug.delegate(ba, "createbuttons", null));}
int _c = 0;
int _r = 0;
anywheresoftware.b4a.objects.ButtonWrapper _buttonx = null;
b4a.example.cvdynamicbutton._pos _posx = null;
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub CreateButtons()";
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="For c = 0 To m_NumOfCol-1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._m_numofcol /*int*/ -1);
_c = (int) (0) ;
for (;_c <= limit1 ;_c = _c + step1 ) {
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="For r = 0 To m_NumOfRow-1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._m_numofrow /*int*/ -1);
_r = (int) (0) ;
for (;_r <= limit2 ;_r = _r + step2 ) {
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="Dim ButtonX As Button";
_buttonx = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="Dim PosX As Pos";
_posx = new b4a.example.cvdynamicbutton._pos();
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="PosX.x = c";
_posx.x /*int*/  = _c;
RDebugUtils.currentLine=1572871;
 //BA.debugLineNum = 1572871;BA.debugLine="PosX.y = r";
_posx.y /*int*/  = _r;
RDebugUtils.currentLine=1572872;
 //BA.debugLineNum = 1572872;BA.debugLine="ButtonX.Initialize(\"ButtonX\")";
_buttonx.Initialize(ba,"ButtonX");
RDebugUtils.currentLine=1572873;
 //BA.debugLineNum = 1572873;BA.debugLine="ButtonX.Tag = PosX";
_buttonx.setTag((Object)(_posx));
RDebugUtils.currentLine=1572874;
 //BA.debugLineNum = 1572874;BA.debugLine="ButtonX.Text = $\"(${r}, ${c})\"$";
_buttonx.setText(BA.ObjectToCharSequence(("("+__c.SmartStringFormatter("",(Object)(_r))+", "+__c.SmartStringFormatter("",(Object)(_c))+")")));
RDebugUtils.currentLine=1572877;
 //BA.debugLineNum = 1572877;BA.debugLine="CallSubDelayed2(mCallBack, \"AddButtonHandler\",";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,"AddButtonHandler",(Object)(__c.createMap(new Object[] {(Object)("button"),(Object)(_buttonx.getObject()),(Object)("x"),(Object)(_c*__ref._m_btnwidth /*int*/ ),(Object)("y"),(Object)(_r*__ref._m_btnheight /*int*/ ),(Object)("w"),(Object)(__ref._m_btnwidth /*int*/ ),(Object)("h"),(Object)(__ref._m_btnheight /*int*/ ),(Object)("r"),(Object)(_r),(Object)("c"),(Object)(_c)})));
 }
};
 }
};
RDebugUtils.currentLine=1572883;
 //BA.debugLineNum = 1572883;BA.debugLine="End Sub";
return "";
}
public String  _buttonx_click(b4a.example.cvdynamicbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cvdynamicbutton";
if (Debug.shouldDelegate(ba, "buttonx_click", false))
	 {return ((String) Debug.delegate(ba, "buttonx_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
b4a.example.cvdynamicbutton._pos _pos_1 = null;
String _coordinate = "";
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub ButtonX_Click";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Dim Button1 As Button";
_button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Button1 = Sender";
_button1 = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="Dim Pos_1 As Pos = Button1.Tag";
_pos_1 = (b4a.example.cvdynamicbutton._pos)(_button1.getTag());
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="Dim Coordinate As String = $\"(${Pos_1.x}, ${Pos_1";
_coordinate = ("("+__c.SmartStringFormatter("",(Object)(_pos_1.x /*int*/ ))+", "+__c.SmartStringFormatter("",(Object)(_pos_1.y /*int*/ ))+")");
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="ToastMessageShow(\"Button: \" & Coordinate & \" is C";
__c.ToastMessageShow(BA.ObjectToCharSequence("Button: "+_coordinate+" is Clicked"),__c.False);
RDebugUtils.currentLine=1638407;
 //BA.debugLineNum = 1638407;BA.debugLine="CallSub2(mCallBack, mEventName, Coordinate)";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ ,(Object)(_coordinate));
RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.cvdynamicbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cvdynamicbutton";
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="Private mBase As Panel";
_mbase = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Public Const DefaultColorConstant As Int = -98483";
_defaultcolorconstant = (int) (-984833);
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="Private Const m_NumOfCol As Int = 3";
_m_numofcol = (int) (3);
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="Private m_NumOfRow As Int = 5";
_m_numofrow = (int) (5);
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="Private m_BtnWidth As Int";
_m_btnwidth = 0;
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="Private m_BtnHeight As Int";
_m_btnheight = 0;
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="Private m_ActivityWidth As Int";
_m_activitywidth = 0;
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="Private m_ActivityHeight As Int";
_m_activityheight = 0;
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="Type Pos(x As Int,y As Int)";
;
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.cvdynamicbutton __ref,anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="cvdynamicbutton";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/  = _base;
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase(b4a.example.cvdynamicbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cvdynamicbutton";
if (Debug.shouldDelegate(ba, "getbase", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub GetBase As Panel";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="End Sub";
return null;
}
public int  _getnumofcol(b4a.example.cvdynamicbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cvdynamicbutton";
if (Debug.shouldDelegate(ba, "getnumofcol", false))
	 {return ((Integer) Debug.delegate(ba, "getnumofcol", null));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub getNumOfCol() As Int";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Return m_NumOfCol";
if (true) return __ref._m_numofcol /*int*/ ;
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return 0;
}
}