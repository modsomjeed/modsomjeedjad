package th.ac.pim.modsomjeedjad;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomList extends ArrayAdapter<String> {

	private final Activity context;
	private final String[] web;
	private final Integer[] imageId;
	private String[] message;
	private String[] positions;
	
	public CustomList(Activity context, String[] web, Integer[] imageId , String[] message , String[] positions ) {
		super(context, R.layout.list_single, web);
		this.context = context;
		this.web = web;
		this.imageId = imageId;
		this.message = message;
		this.positions = positions;

	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		LayoutInflater inflater = context.getLayoutInflater();
		View rowView = inflater.inflate(R.layout.list_single, null, true);
		TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
		TextView txtTitle1 = (TextView) rowView.findViewById(R.id.txt1);
		TextView txtTitle2 = (TextView) rowView.findViewById(R.id.txt2);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
//		ImageView imageView1 = (ImageView) rowView.findViewById(R.id.img2);
		txtTitle.setText(web[position]);//เซตตัวอักษร
		txtTitle1.setText(message[position]);
		txtTitle2.setText(positions[position]);
		imageView.setImageResource(imageId[position]);//เซตรูป
//		imageView1.setImageResource(imageId[position]);
		return rowView;
	}
}