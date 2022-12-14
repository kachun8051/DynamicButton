B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=11.2
@EndOfDesignText@
'Custom View class 
#Event: ExampleEvent (Value As Int)
#DesignerProperty: Key: BooleanExample, DisplayName: Boolean Example, FieldType: Boolean, DefaultValue: True, Description: Example of a boolean property.
#DesignerProperty: Key: IntExample, DisplayName: Int Example, FieldType: Int, DefaultValue: 10, MinRange: 0, MaxRange: 100, Description: Note that MinRange and MaxRange are optional.
#DesignerProperty: Key: StringWithListExample, DisplayName: String With List, FieldType: String, DefaultValue: Sunday, List: Sunday|Monday|Tuesday|Wednesday|Thursday|Friday|Saturday
#DesignerProperty: Key: StringExample, DisplayName: String Example, FieldType: String, DefaultValue: Text
#DesignerProperty: Key: ColorExample, DisplayName: Color Example, FieldType: Color, DefaultValue: 0xFFCFDCDC, Description: You can use the built-in color picker to find the color values.
#DesignerProperty: Key: DefaultColorExample, DisplayName: Default Color Example, FieldType: Color, DefaultValue: Null, Description: Setting the default value to Null means that a nullable field will be displayed.
Sub Class_Globals
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Panel
	Public Const DefaultColorConstant As Int = -984833 'ignore
	Private Const m_NumOfCol As Int = 3
	Private m_NumOfRow As Int = 5
	Private m_BtnWidth As Int
	Private m_BtnHeight As Int
	Private m_PanelWidth As Int
	Private m_PanelHeight As Int
	' Private mScrollView As ScrollView
	Type Pos(x As Int,y As Int)
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
	
End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
    
End Sub

Public Sub GetBase As Panel
	Return mBase
End Sub

'Public Sub setScrollView(sv As ScrollView)
'	mScrollView = sv
'End Sub

Public Sub getNumOfCol() As Int
	Return m_NumOfCol
End Sub

Public Sub getNumOfRow() As Int
	Return m_NumOfRow
End Sub

Public Sub setNumOfRow(val As Int)
	m_NumOfRow = val
End Sub

Public Sub getBtnHeight() As Int
	Return m_BtnHeight
End Sub

Public Sub setPanelHeightWidth(h As Int, w As Int)
	m_PanelHeight = h
	m_PanelWidth = w 
	m_BtnWidth = m_PanelWidth / m_NumOfCol
	m_BtnHeight = m_PanelHeight / 5
	Log("Panel's Height: " & m_PanelHeight)
	Log("Panel's Width: " & m_PanelWidth)	
	Log("Button's Height: " & m_BtnHeight)
	Log("Button's Width: " & m_BtnWidth)
End Sub


Public Sub CreateButtons()
     
	For c = 0 To m_NumOfCol-1
		For r = 0 To m_NumOfRow-1
			Dim ButtonX As Button
			Dim PosX As Pos
			PosX.x = c
			PosX.y = r
			ButtonX.Initialize("ButtonX")
			ButtonX.Tag = PosX
			ButtonX.Text = $"(${r}, ${c})"$
			' Activity.AddView(ButtonX,x*33%x,y*20%y,33%x,20%y)
			' mScrollView.Panel.AddView(ButtonX,c*m_BtnWidth,r*m_BtnHeight,m_BtnWidth,m_BtnHeight)
			CallSubDelayed2(mCallBack, "AddButtonHandler", _ 
				CreateMap("button": ButtonX, "x": c*m_BtnWidth, "y": r*m_BtnHeight, _ 
					"w": m_BtnWidth, "h": m_BtnHeight, "r": r, "c": c))
		Next
	Next
    
End Sub

Sub ButtonX_Click    
	Dim Button1 As Button
	Button1 = Sender    
	' Log(Button1.Left & " " & Button1.Top)
	Dim Pos_1 As Pos = Button1.Tag
	Dim Coordinate As String = $"(${Pos_1.x}, ${Pos_1.y})"$
	ToastMessageShow("Button: " & Coordinate & " is Clicked", False)
    CallSub2(mCallBack, mEventName, Coordinate)
End Sub