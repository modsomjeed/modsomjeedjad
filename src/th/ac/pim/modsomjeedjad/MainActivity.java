package th.ac.pim.modsomjeedjad;


import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		Handler handler = new Handler();//สร้าง class เพื่อจะหน่วงเวลา
		 
        // run a thread after 3 seconds to start the home screen
        handler.postDelayed(new Runnable() {
 
            @Override
            public void run() {
                // make sure we close the splash screen so the user won't come back when it presses back key
                finish();// ป้องกันการย้อนกลับไปหน้าเดิม
                    // start the home screen if the back button wasn't pressed already 
                    Intent intent = new Intent(MainActivity.this, KwangActivity.class); 
                    //ให้ link ไปหน้าไหน this คือหน้าเรา .class คือไปหน้าไหนนะจ๊ะ
                    startActivity(intent);//สั่งให้ code ทำงาน
            }
        }, 3000); // time in milliseconds (1 second = 1000 milliseconds) until the run() method will be called
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
