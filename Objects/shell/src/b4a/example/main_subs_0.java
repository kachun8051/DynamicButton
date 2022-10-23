package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,28);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(268435456);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 30;BA.debugLine="dybtn.Initialize(Me, \"dybtn_click\")";
Debug.ShouldStop(536870912);
main.mostCurrent._dybtn.runClassMethod (b4a.example.cvdynamicbutton.class, "_initialize" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.getObject()),(Object)(RemoteObject.createImmutable("dybtn_click")));
 BA.debugLineNum = 31;BA.debugLine="dybtn.setActivityHeightWidth(Activity.Height, Act";
Debug.ShouldStop(1073741824);
main.mostCurrent._dybtn.runClassMethod (b4a.example.cvdynamicbutton.class, "_setactivityheightwidth" /*RemoteObject*/ ,(Object)(main.mostCurrent._activity.runMethod(true,"getHeight")),(Object)(main.mostCurrent._activity.runMethod(true,"getWidth")));
 BA.debugLineNum = 32;BA.debugLine="dybtn.setNumOfRow(8)";
Debug.ShouldStop(-2147483648);
main.mostCurrent._dybtn.runClassMethod (b4a.example.cvdynamicbutton.class, "_setnumofrow" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 8)));
 BA.debugLineNum = 34;BA.debugLine="ScrollView1.Panel.Height = dybtn.BtnHeight * dybt";
Debug.ShouldStop(2);
main.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {main.mostCurrent._dybtn.runClassMethod (b4a.example.cvdynamicbutton.class, "_getbtnheight" /*RemoteObject*/ ),main.mostCurrent._dybtn.runClassMethod (b4a.example.cvdynamicbutton.class, "_getnumofrow" /*RemoteObject*/ )}, "*",0, 1));
 BA.debugLineNum = 35;BA.debugLine="ScrollView1.Panel.Width = Activity.Width";
Debug.ShouldStop(4);
main.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setWidth",main.mostCurrent._activity.runMethod(true,"getWidth"));
 BA.debugLineNum = 37;BA.debugLine="dybtn.CreateButtons";
Debug.ShouldStop(16);
main.mostCurrent._dybtn.runClassMethod (b4a.example.cvdynamicbutton.class, "_createbuttons" /*RemoteObject*/ );
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,44);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 44;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,40);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 40;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(128);
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addbuttonhandler(RemoteObject _mapres) throws Exception{
try {
		Debug.PushSubsStack("AddButtonHandler (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,56);
if (RapidSub.canDelegate("addbuttonhandler")) { return b4a.example.main.remoteMe.runUserSub(false, "main","addbuttonhandler", _mapres);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _y = RemoteObject.createImmutable(0);
RemoteObject _w = RemoteObject.createImmutable(0);
RemoteObject _h = RemoteObject.createImmutable(0);
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _col = RemoteObject.createImmutable(0);
Debug.locals.put("mapRes", _mapres);
 BA.debugLineNum = 56;BA.debugLine="Sub AddButtonHandler(mapRes As Map)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="Dim btn As Button = mapRes.Get(\"button\")";
Debug.ShouldStop(16777216);
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), _mapres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("button")))));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 58;BA.debugLine="Dim x As Int = mapRes.Get(\"x\")";
Debug.ShouldStop(33554432);
_x = BA.numberCast(int.class, _mapres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("x")))));Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 59;BA.debugLine="Dim y As Int = mapRes.Get(\"y\")";
Debug.ShouldStop(67108864);
_y = BA.numberCast(int.class, _mapres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("y")))));Debug.locals.put("y", _y);Debug.locals.put("y", _y);
 BA.debugLineNum = 60;BA.debugLine="Dim w As Int = mapRes.Get(\"w\")";
Debug.ShouldStop(134217728);
_w = BA.numberCast(int.class, _mapres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("w")))));Debug.locals.put("w", _w);Debug.locals.put("w", _w);
 BA.debugLineNum = 61;BA.debugLine="Dim h As Int = mapRes.Get(\"h\")";
Debug.ShouldStop(268435456);
_h = BA.numberCast(int.class, _mapres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("h")))));Debug.locals.put("h", _h);Debug.locals.put("h", _h);
 BA.debugLineNum = 62;BA.debugLine="Dim row As Int = mapRes.Get(\"r\")";
Debug.ShouldStop(536870912);
_row = BA.numberCast(int.class, _mapres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("r")))));Debug.locals.put("row", _row);Debug.locals.put("row", _row);
 BA.debugLineNum = 63;BA.debugLine="Dim col As Int = mapRes.Get(\"c\")";
Debug.ShouldStop(1073741824);
_col = BA.numberCast(int.class, _mapres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("c")))));Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 64;BA.debugLine="ScrollView1.Panel.AddView(btn, x, y, w, h)";
Debug.ShouldStop(-2147483648);
main.mostCurrent._scrollview1.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_btn.getObject())),(Object)(_x),(Object)(_y),(Object)(_w),(Object)(_h));
 BA.debugLineNum = 65;BA.debugLine="Log(\"Button added: \" & $\"(${row}, ${col})\"$)";
Debug.ShouldStop(1);
main.mostCurrent.__c.runVoidMethod ("LogImpl","7458761",RemoteObject.concat(RemoteObject.createImmutable("Button added: "),(RemoteObject.concat(RemoteObject.createImmutable("("),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_row))),RemoteObject.createImmutable(", "),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_col))),RemoteObject.createImmutable(")")))),0);
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,48);
if (RapidSub.canDelegate("button1_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button1_click");}
 BA.debugLineNum = 48;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="xui.MsgboxAsync(\"Hello world!\", \"B4X\")";
Debug.ShouldStop(65536);
main._xui.runVoidMethod ("MsgboxAsync",main.processBA,(Object)(BA.ObjectToCharSequence("Hello world!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("B4X"))));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dybtn_click(RemoteObject _res) throws Exception{
try {
		Debug.PushSubsStack("dybtn_click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,52);
if (RapidSub.canDelegate("dybtn_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","dybtn_click", _res);}
Debug.locals.put("res", _res);
 BA.debugLineNum = 52;BA.debugLine="Sub dybtn_click(res As String)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="ToastMessageShow(res, False)";
Debug.ShouldStop(1048576);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_res)),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 24;BA.debugLine="Private ScrollView1 As ScrollView";
main.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private dybtn As cvDynamicButton";
main.mostCurrent._dybtn = RemoteObject.createNew ("b4a.example.cvdynamicbutton");
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
cvdynamicbutton.myClass = BA.getDeviceClass ("b4a.example.cvdynamicbutton");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _scrollview1_scrollchanged(RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("ScrollView1_ScrollChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,68);
if (RapidSub.canDelegate("scrollview1_scrollchanged")) { return b4a.example.main.remoteMe.runUserSub(false, "main","scrollview1_scrollchanged", _position);}
Debug.locals.put("Position", _position);
 BA.debugLineNum = 68;BA.debugLine="Private Sub ScrollView1_ScrollChanged(Position As";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="Log(\"ScrollView: \" & Position)";
Debug.ShouldStop(16);
main.mostCurrent.__c.runVoidMethod ("LogImpl","7524289",RemoteObject.concat(RemoteObject.createImmutable("ScrollView: "),_position),0);
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}