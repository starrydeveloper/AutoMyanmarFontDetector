package com.mkk.myanmarfontdetector;

import android.app.*;
import android.graphics.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity 
{
	private TextView tv;
	private Button button;
	private int countDown = 20;
	
	public static AutoMyanmarFontDetector mFontDetector;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		View layout = findViewById(R.id.layoutView);
		tv = (TextView)findViewById(R.id.tv);
		button = (Button) findViewById(R.id.button);
		
		mFontDetector = new AutoMyanmarFontDetector(this,layout);
		
		delay();
		
    }
	
	private void delay() {
		
		new Handler().postDelayed((Runnable ) new Runnable() {
									  @Override
									  public void run() {
										  if(countDown > 0) {
											  countDown();
										  } else {
											  showResult();
										  }
									  }
								  }, 700); 
		countDown--;
		
	}
	
	private void showResult() {
		tv.setTextSize(14);
		tv.setBackgroundColor(Color.argb(250,50,100,200));
		tv.setText(mFontDetector.fromUnicode("မင်္ဂလာပါ ...\n\nသင်၏ ဖုန်းသည် ဇော်ဂျီကို အသုံးပြုသည် ဖြစ်စေ၊ ယူနီကုဒ်ကို အသုံးပြုသည် ဖြစ်စေ၊ ဤ စာသားများကို စာလုံး မှန်မှန်ဖြင့် ဖတ်လို့ ရနေရပါမည်။\n\nDeveloped By MKK ®"));
		button.setText(mFontDetector.fromUnicode("ပိတ်ရန်"));
	}
	private void countDown() {
		tv.setTextSize(100);
		tv.setText(countDown + "");
		delay();
	}
}
