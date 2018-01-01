# Auto Myanmar Font Detector [![Build Status][1]][2] [![Android Weekly][3]][4]

Auto Myanmar Font Detector ဟာ Android အက္ပလီေကးရွင္းမ်ား ေရးသားေနသူ Developer မ်ား အတြက္ မိမိ App မွ အသံုးျပဳသူ၏ ဖုန္းတြင္ အသံုးျပဳထားေသာ ျမန္မာစာစနစ္သည္ ေဇာ္ဂ်ီလား ယူနီကုဒ္လား ဆိုသည္ကို အလိုအေလ်ာက္ သိေအာင္ အလုပ္လုပ္ေပးေသာ class တစ္ခု ျဖစ္ပါသည္။

## အလုပ္လုပ္ပံု သေဘာတရား

App ကို ပထမဆံုးအၾကိမ္ အသံုးျပဳခ်ိန္မွာ မိမိ App မွာ ပါရွိမယ္႔ `View` ( `LinearLayout` (သို႔) `RelativeLayout`)  တစ္ခုထဲကို `TextView` တစ္ခုကို programatically ဖန္တီး လွမ္းထည္႔ျပီး အဲ႔ဒီ `TextView` ကို ေဇာ္ဂ်ီ/ယူနီကုဒ္ တစ္ခုခုျဖင့္ စာလွမ္းေရးျပီး အဲ႔ဒီစာကို ေဇာ္ဂ်ီလို ေပၚလား၊ ယူနီကုဒ္လို ေပၚလားဆိုတာ ၾကည္႔ကာ `SharedPreferences` မွာ သိမ္းပါတယ္။ 

ေနာက္တစ္ခါ App ကို ဖြင့္တိုင္း ဒီ `SharedPreferences` တန္ဖိုးကို ၾကည္႔ျပီး ေဇာ္ဂ်ီ၊ ယူနီကုဒ္ ခြဲျခားျပီး အလုပ္လုပ္ ေပးပါတယ္။ 

## အသံုးျပဳပံု 

မိမိ App မွာ 'Context' ရႏိုင္တဲ႔ ေနရာကေန `LinearLayout` (သို႔) `RelativeLayout` တစ္ခုခုကို `View´ တစ္ခု အေနနဲ႔ ထည္႔ေပးလိုက္ျပီး `AutoMyanmarFontDetector` instance ကို အေစာဆံုး ဖန္တီး ေခၚယူထားလိုက္ပါ။ ဥပမာ - 

```java
public class MainActivity extends Activity 
{
	public static AutoMyanmarFontDetector mFontDetector;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		View layout = findViewById(R.id.layoutView);
		
		
		mFontDetector = new AutoMyanmarFontDetector(this,layout);
		
    }
}
```

ဒီလို ဖန္တီးယူျပီးတဲ႔ေနာက္ ရလာတဲ႔ instance ကေန မိမိက ေဇာ္ဂ်ီသံုး ေရးေနတာ ဆိုရင္ `writeZawgyi("မဂၤလာပါ။")` method ျဖင့္၊ မိမိက ယူနီကုဒ္သံုး ေရးေနတာဆို 'writeUnicode("မင်္ဂလာပါ။")' method ျဖင့္ မိမိစာေရးခ်င္တဲ႔ ေနရာမွာ သာမန္ ေရးသြားသလို အသံုးျပဳပါ။  ဥပမာ - 

ေဇာ္ဂ်ီျဖင့္ ေရးေနသူက - 

```java
textview.setText(mFontDetector.writeZawgyi("မဂၤလာပါ။"));	
button.setText(mFontDetector.writeZawgyi("ပိတ္ရန္"));
```

ယူနီကုဒ္ျဖင့္ ေရးေနသူက -

```java
textview.setText(mFontDetector.writeUnicode("မင်္ဂလာပါ။"));
button.setText(mFontDetector.writeUnicode("ပိတ်ရန်"));
```

ဟု ေရးလိုက္မယ္ ဆိုရင္ အဲ႔ဒီ `TextView` အဲ႔ဒီ `Button` တို႔မွာ ဖုန္းမွာ အသံုးျပဳေနတဲ႔  ျမန္မာစာကို လိုက္ျပီး ေဇာ္ဂ်ီ၊ ယူနီကုဒ္ မွန္မွန္ကန္ကန္ ေပၚေနေစေအာင္ `AutoMyanmarFontDetector` instance မွ အလုပ္လုပ္ေပး သြားပါလိမ္႔မယ္။ 


