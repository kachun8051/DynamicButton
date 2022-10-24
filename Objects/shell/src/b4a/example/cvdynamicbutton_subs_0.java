package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cvdynamicbutton_subs_0 {


public static RemoteObject  _buttonx_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonX_Click (cvdynamicbutton) ","cvdynamicbutton",2,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("buttonx_click")) { return __ref.runUserSub(false, "cvdynamicbutton","buttonx_click", __ref);}
RemoteObject _button1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _pos_1 = RemoteObject.declareNull("b4a.example.cvdynamicbutton._pos");
RemoteObject _coordinate = RemoteObject.createImmutable("");
 BA.debugLineNum = 92;BA.debugLine="Sub ButtonX_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="Dim Button1 As Button";
Debug.ShouldStop(268435456);
_button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("Button1", _button1);
 BA.debugLineNum = 94;BA.debugLine="Button1 = Sender";
Debug.ShouldStop(536870912);
_button1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), cvdynamicbutton.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("Button1", _button1);
 BA.debugLineNum = 96;BA.debugLine="Dim Pos_1 As Pos = Button1.Tag";
Debug.ShouldStop(-2147483648);
_pos_1 = (_button1.runMethod(false,"getTag"));Debug.locals.put("Pos_1", _pos_1);Debug.locals.put("Pos_1", _pos_1);
 BA.debugLineNum = 97;BA.debugLine="Dim Coordinate As String = $\"(${Pos_1.x}, ${Pos_1";
Debug.ShouldStop(1);
_coordinate = (RemoteObject.concat(RemoteObject.createImmutable("("),cvdynamicbutton.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_pos_1.getField(true,"x" /*RemoteObject*/ )))),RemoteObject.createImmutable(", "),cvdynamicbutton.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_pos_1.getField(true,"y" /*RemoteObject*/ )))),RemoteObject.createImmutable(")")));Debug.locals.put("Coordinate", _coordinate);Debug.locals.put("Coordinate", _coordinate);
 BA.debugLineNum = 98;BA.debugLine="ToastMessageShow(\"Button: \" & Coordinate & \" is C";
Debug.ShouldStop(2);
cvdynamicbutton.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Button: "),_coordinate,RemoteObject.createImmutable(" is Clicked")))),(Object)(cvdynamicbutton.__c.getField(true,"False")));
 BA.debugLineNum = 99;BA.debugLine="CallSub2(mCallBack, mEventName, Coordinate)";
Debug.ShouldStop(4);
cvdynamicbutton.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_meventname" /*RemoteObject*/ )),(Object)((_coordinate)));
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private mEventName As String 'ignore";
cvdynamicbutton._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",cvdynamicbutton._meventname);
 //BA.debugLineNum = 11;BA.debugLine="Private mCallBack As Object 'ignore";
cvdynamicbutton._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",cvdynamicbutton._mcallback);
 //BA.debugLineNum = 12;BA.debugLine="Private mBase As Panel";
cvdynamicbutton._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_mbase",cvdynamicbutton._mbase);
 //BA.debugLineNum = 13;BA.debugLine="Public Const DefaultColorConstant As Int = -98483";
cvdynamicbutton._defaultcolorconstant = BA.numberCast(int.class, -(double) (0 + 984833));__ref.setField("_defaultcolorconstant",cvdynamicbutton._defaultcolorconstant);
 //BA.debugLineNum = 14;BA.debugLine="Private Const m_NumOfCol As Int = 3";
cvdynamicbutton._m_numofcol = BA.numberCast(int.class, 3);__ref.setField("_m_numofcol",cvdynamicbutton._m_numofcol);
 //BA.debugLineNum = 15;BA.debugLine="Private m_NumOfRow As Int = 5";
cvdynamicbutton._m_numofrow = BA.numberCast(int.class, 5);__ref.setField("_m_numofrow",cvdynamicbutton._m_numofrow);
 //BA.debugLineNum = 16;BA.debugLine="Private m_BtnWidth As Int";
cvdynamicbutton._m_btnwidth = RemoteObject.createImmutable(0);__ref.setField("_m_btnwidth",cvdynamicbutton._m_btnwidth);
 //BA.debugLineNum = 17;BA.debugLine="Private m_BtnHeight As Int";
cvdynamicbutton._m_btnheight = RemoteObject.createImmutable(0);__ref.setField("_m_btnheight",cvdynamicbutton._m_btnheight);
 //BA.debugLineNum = 18;BA.debugLine="Private m_PanelWidth As Int";
cvdynamicbutton._m_panelwidth = RemoteObject.createImmutable(0);__ref.setField("_m_panelwidth",cvdynamicbutton._m_panelwidth);
 //BA.debugLineNum = 19;BA.debugLine="Private m_PanelHeight As Int";
cvdynamicbutton._m_panelheight = RemoteObject.createImmutable(0);__ref.setField("_m_panelheight",cvdynamicbutton._m_panelheight);
 //BA.debugLineNum = 21;BA.debugLine="Type Pos(x As Int,y As Int)";
;
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createbuttons(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateButtons (cvdynamicbutton) ","cvdynamicbutton",2,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("createbuttons")) { return __ref.runUserSub(false, "cvdynamicbutton","createbuttons", __ref);}
int _c = 0;
int _r = 0;
RemoteObject _buttonx = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _posx = RemoteObject.declareNull("b4a.example.cvdynamicbutton._pos");
 BA.debugLineNum = 71;BA.debugLine="Public Sub CreateButtons()";
Debug.ShouldStop(64);
 BA.debugLineNum = 73;BA.debugLine="For c = 0 To m_NumOfCol-1";
Debug.ShouldStop(256);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_m_numofcol" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_c = 0 ;
for (;(step1 > 0 && _c <= limit1) || (step1 < 0 && _c >= limit1) ;_c = ((int)(0 + _c + step1))  ) {
Debug.locals.put("c", _c);
 BA.debugLineNum = 74;BA.debugLine="For r = 0 To m_NumOfRow-1";
Debug.ShouldStop(512);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_m_numofrow" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_r = 0 ;
for (;(step2 > 0 && _r <= limit2) || (step2 < 0 && _r >= limit2) ;_r = ((int)(0 + _r + step2))  ) {
Debug.locals.put("r", _r);
 BA.debugLineNum = 75;BA.debugLine="Dim ButtonX As Button";
Debug.ShouldStop(1024);
_buttonx = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("ButtonX", _buttonx);
 BA.debugLineNum = 76;BA.debugLine="Dim PosX As Pos";
Debug.ShouldStop(2048);
_posx = RemoteObject.createNew ("b4a.example.cvdynamicbutton._pos");Debug.locals.put("PosX", _posx);
 BA.debugLineNum = 77;BA.debugLine="PosX.x = c";
Debug.ShouldStop(4096);
_posx.setField ("x" /*RemoteObject*/ ,BA.numberCast(int.class, _c));
 BA.debugLineNum = 78;BA.debugLine="PosX.y = r";
Debug.ShouldStop(8192);
_posx.setField ("y" /*RemoteObject*/ ,BA.numberCast(int.class, _r));
 BA.debugLineNum = 79;BA.debugLine="ButtonX.Initialize(\"ButtonX\")";
Debug.ShouldStop(16384);
_buttonx.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ButtonX")));
 BA.debugLineNum = 80;BA.debugLine="ButtonX.Tag = PosX";
Debug.ShouldStop(32768);
_buttonx.runMethod(false,"setTag",(_posx));
 BA.debugLineNum = 81;BA.debugLine="ButtonX.Text = $\"(${r}, ${c})\"$";
Debug.ShouldStop(65536);
_buttonx.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("("),cvdynamicbutton.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_r)))),RemoteObject.createImmutable(", "),cvdynamicbutton.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_c)))),RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 84;BA.debugLine="CallSubDelayed2(mCallBack, \"AddButtonHandler\",";
Debug.ShouldStop(524288);
cvdynamicbutton.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(BA.ObjectToString("AddButtonHandler")),(Object)((cvdynamicbutton.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("button")),(_buttonx.getObject()),RemoteObject.createImmutable(("x")),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_c),__ref.getField(true,"_m_btnwidth" /*RemoteObject*/ )}, "*",0, 1)),RemoteObject.createImmutable(("y")),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_r),__ref.getField(true,"_m_btnheight" /*RemoteObject*/ )}, "*",0, 1)),RemoteObject.createImmutable(("w")),(__ref.getField(true,"_m_btnwidth" /*RemoteObject*/ )),RemoteObject.createImmutable(("h")),(__ref.getField(true,"_m_btnheight" /*RemoteObject*/ )),RemoteObject.createImmutable(("r")),RemoteObject.createImmutable((_r)),RemoteObject.createImmutable(("c")),RemoteObject.createImmutable((_c))})))));
 }
}Debug.locals.put("r", _r);
;
 }
}Debug.locals.put("c", _c);
;
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (cvdynamicbutton) ","cvdynamicbutton",2,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "cvdynamicbutton","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 30;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="mBase = Base";
Debug.ShouldStop(1073741824);
__ref.setField ("_mbase" /*RemoteObject*/ ,_base);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (cvdynamicbutton) ","cvdynamicbutton",2,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "cvdynamicbutton","getbase", __ref);}
 BA.debugLineNum = 35;BA.debugLine="Public Sub GetBase As Panel";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Return mBase";
Debug.ShouldStop(8);
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ );
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbtnheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getBtnHeight (cvdynamicbutton) ","cvdynamicbutton",2,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("getbtnheight")) { return __ref.runUserSub(false, "cvdynamicbutton","getbtnheight", __ref);}
 BA.debugLineNum = 55;BA.debugLine="Public Sub getBtnHeight() As Int";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="Return m_BtnHeight";
Debug.ShouldStop(8388608);
if (true) return __ref.getField(true,"_m_btnheight" /*RemoteObject*/ );
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getnumofcol(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getNumOfCol (cvdynamicbutton) ","cvdynamicbutton",2,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("getnumofcol")) { return __ref.runUserSub(false, "cvdynamicbutton","getnumofcol", __ref);}
 BA.debugLineNum = 43;BA.debugLine="Public Sub getNumOfCol() As Int";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="Return m_NumOfCol";
Debug.ShouldStop(2048);
if (true) return __ref.getField(true,"_m_numofcol" /*RemoteObject*/ );
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getnumofrow(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getNumOfRow (cvdynamicbutton) ","cvdynamicbutton",2,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("getnumofrow")) { return __ref.runUserSub(false, "cvdynamicbutton","getnumofrow", __ref);}
 BA.debugLineNum = 47;BA.debugLine="Public Sub getNumOfRow() As Int";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="Return m_NumOfRow";
Debug.ShouldStop(32768);
if (true) return __ref.getField(true,"_m_numofrow" /*RemoteObject*/ );
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cvdynamicbutton) ","cvdynamicbutton",2,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cvdynamicbutton","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(16777216);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 26;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(33554432);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setnumofrow(RemoteObject __ref,RemoteObject _val) throws Exception{
try {
		Debug.PushSubsStack("setNumOfRow (cvdynamicbutton) ","cvdynamicbutton",2,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("setnumofrow")) { return __ref.runUserSub(false, "cvdynamicbutton","setnumofrow", __ref, _val);}
Debug.locals.put("val", _val);
 BA.debugLineNum = 51;BA.debugLine="Public Sub setNumOfRow(val As Int)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="m_NumOfRow = val";
Debug.ShouldStop(524288);
__ref.setField ("_m_numofrow" /*RemoteObject*/ ,_val);
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpanelheightwidth(RemoteObject __ref,RemoteObject _h,RemoteObject _w) throws Exception{
try {
		Debug.PushSubsStack("setPanelHeightWidth (cvdynamicbutton) ","cvdynamicbutton",2,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("setpanelheightwidth")) { return __ref.runUserSub(false, "cvdynamicbutton","setpanelheightwidth", __ref, _h, _w);}
Debug.locals.put("h", _h);
Debug.locals.put("w", _w);
 BA.debugLineNum = 59;BA.debugLine="Public Sub setPanelHeightWidth(h As Int, w As Int)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="m_PanelHeight = h";
Debug.ShouldStop(134217728);
__ref.setField ("_m_panelheight" /*RemoteObject*/ ,_h);
 BA.debugLineNum = 61;BA.debugLine="m_PanelWidth = w";
Debug.ShouldStop(268435456);
__ref.setField ("_m_panelwidth" /*RemoteObject*/ ,_w);
 BA.debugLineNum = 62;BA.debugLine="m_BtnWidth = m_PanelWidth / m_NumOfCol";
Debug.ShouldStop(536870912);
__ref.setField ("_m_btnwidth" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_m_panelwidth" /*RemoteObject*/ ),__ref.getField(true,"_m_numofcol" /*RemoteObject*/ )}, "/",0, 0)));
 BA.debugLineNum = 63;BA.debugLine="m_BtnHeight = m_PanelHeight / 5";
Debug.ShouldStop(1073741824);
__ref.setField ("_m_btnheight" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_m_panelheight" /*RemoteObject*/ ),RemoteObject.createImmutable(5)}, "/",0, 0)));
 BA.debugLineNum = 64;BA.debugLine="Log(\"Panel's Height: \" & m_PanelHeight)";
Debug.ShouldStop(-2147483648);
cvdynamicbutton.__c.runVoidMethod ("LogImpl","71507333",RemoteObject.concat(RemoteObject.createImmutable("Panel's Height: "),__ref.getField(true,"_m_panelheight" /*RemoteObject*/ )),0);
 BA.debugLineNum = 65;BA.debugLine="Log(\"Panel's Width: \" & m_PanelWidth)";
Debug.ShouldStop(1);
cvdynamicbutton.__c.runVoidMethod ("LogImpl","71507334",RemoteObject.concat(RemoteObject.createImmutable("Panel's Width: "),__ref.getField(true,"_m_panelwidth" /*RemoteObject*/ )),0);
 BA.debugLineNum = 66;BA.debugLine="Log(\"Button's Height: \" & m_BtnHeight)";
Debug.ShouldStop(2);
cvdynamicbutton.__c.runVoidMethod ("LogImpl","71507335",RemoteObject.concat(RemoteObject.createImmutable("Button's Height: "),__ref.getField(true,"_m_btnheight" /*RemoteObject*/ )),0);
 BA.debugLineNum = 67;BA.debugLine="Log(\"Button's Width: \" & m_BtnWidth)";
Debug.ShouldStop(4);
cvdynamicbutton.__c.runVoidMethod ("LogImpl","71507336",RemoteObject.concat(RemoteObject.createImmutable("Button's Width: "),__ref.getField(true,"_m_btnwidth" /*RemoteObject*/ )),0);
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}