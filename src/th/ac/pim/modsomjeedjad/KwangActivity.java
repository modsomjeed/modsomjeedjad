package th.ac.pim.modsomjeedjad;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class KwangActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_kwang);
		
		Button button1 = (Button)findViewById(R.id.button1);
		button1.setOnClickListener((new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(KwangActivity.this, FriendActivity.class);
				startActivity(intent);
			}
		}));
	}
			

}
