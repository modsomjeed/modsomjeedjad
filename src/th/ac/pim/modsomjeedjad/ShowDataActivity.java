package th.ac.pim.modsomjeedjad;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;


public class ShowDataActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show_data);
		
		// 1. get passed intent 
        Intent intent = getIntent();
 
        // 2. get message value from intent
        String message1 = intent.getStringExtra("message1");
        String message2 = intent.getStringExtra("message2");
		

        // 3. show message on textView 
        TextView textView1 = ((TextView)findViewById(R.id.editText1));
        textView1.setText(message1);
        TextView textView2 = ((TextView)findViewById(R.id.editText2));
        textView2.setText(message2);
      
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.show_data, menu);
		return true;
	}

}
