### Auto Myanmar Font Detector
ဖုန္းမွာ အသံုးျပဳေနတဲ႔ ျမန္မာစာဟာ ေဇာ္ဂ်ီ လား ယူနီကုဒ္လား ဆိုတာကို အလိုအေလ်ာက္ ခြဲေပးေသာ class တစ္ခု ျဖစ္ပါတယ္။

### အသံုးျပဳပံု 

`**public class MainActivity extends Activity {**`

`public static AutoMyanmarFontDetector mFontDetector;`
	
  `  @Override`
    `protected void onCreate(Bundle savedInstanceState)`
    `{`
        `super.onCreate(savedInstanceState);`
        `setContentView(R.layout.main);`
		
		`View layout = findViewById(R.id.layoutView);`
		
		`mFontDetector = new AutoMyanmarFontDetector(this,layout);`
		
    `}`
