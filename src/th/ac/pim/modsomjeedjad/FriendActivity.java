package th.ac.pim.modsomjeedjad;

//import java.util.ArrayList;
//import java.util.Arrays;
import android.widget.ListView;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

public class FriendActivity extends Activity {

//	 private ListView mainListView ;
//	  private ArrayAdapter<String> listAdapter ;
	  
	  ListView list;
		String[] web = { "Kaew", "Nozto", "Sorn", "Por", "Niya"};
		Integer[] imageId = { R.drawable.image1, R.drawable.image2,
				R.drawable.image3, R.drawable.image4, R.drawable.image5};
	    String[] message = { "5452300040", "5452300015", "5452300155", "5452300147", "5452300058"};
	    String[] positions = { "1", "2", "3", "4", "5"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_friend);
		
//		mainListView = (ListView) findViewById( R.id.mainListView );
//	    String[] planets = new String[] { "Kaew", "Sorn", "Nozto"};  //สร้าง array string
//	    ArrayList<String> planetList = new ArrayList<String>(); 
//	    planetList.addAll( Arrays.asList(planets) );
//	    listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow, planetList);
//	    
//	    mainListView.setAdapter( listAdapter );
//	    listAdapter.add( "Niya" );
//	    listAdapter.add( "Mebud" );
//	    listAdapter.add( "Por" );
//	    listAdapter.add( "Udom" );
		
		CustomList adapter = new CustomList(FriendActivity.this, web, imageId, message , positions);
		list = (ListView) findViewById(R.id.list);
		list.setAdapter(adapter);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Toast.makeText(FriendActivity.this,"You Clicked at " + web[+position], Toast.LENGTH_LONG).show();
				// Toast คือ class ที่ใช้แสดงตัวอักษร ต่างจาก messagebox นะ
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.friend, menu);
		return true;
	}

}
