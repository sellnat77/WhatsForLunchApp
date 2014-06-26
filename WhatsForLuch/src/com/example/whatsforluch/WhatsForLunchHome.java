package com.example.whatsforluch;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class WhatsForLunchHome extends Activity implements OnClickListener {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_whats_for_lunch_home);
		
		Button whereButton = (Button) findViewById(R.id.start_random);
		
		whereButton.setOnClickListener(this);	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.whats_for_lunch_home, menu);
		return true;
	}

	@Override
	public void onClick(View theView) 
	{	
		TextView theRestaurant = (TextView) findViewById(R.id.place_to_eat);
		Button whereButton = (Button) findViewById(R.id.start_random);
		String restaurants[] = new String[28];
		restaurants[0]="Jack In The Box";
		restaurants[1]="McDonald's";
		restaurants[2]="Original Thai BBQ";
		restaurants[3]="Something from home";
		restaurants[4]="Carl's Jr.";
		restaurants[5]="Wendy's";
		restaurants[6]="In N Out";
		restaurants[7]="MVP's";
		restaurants[8]="Strawhat Pizza";
		restaurants[9]="Marie Calendars";
		restaurants[10]="Lucille's";
		restaurants[11]="Red Lobster";
		restaurants[12]="Super Mex";
		restaurants[13]="Flame Broiler";
		restaurants[14]="BJ's";
		restaurants[15]="Taco Bell";
		restaurants[16]="Famous Dave's";
		restaurants[17]="Pizza Hut";
		restaurants[18]="Fantastic Cafe";
		restaurants[19]="Burger King";
		restaurants[20]="Subway";
		restaurants[21]="Sizzler";
		restaurants[22]="Islands";
		restaurants[23]="Panda Express";
		restaurants[24]="KFC";
		restaurants[25]="Charo Chicken";
		restaurants[26]="Fudrucker's";
		restaurants[27]="Elbow's";
		
		whereButton.setBackgroundResource(R.drawable.buttonbgfocus);
		whereButton.setText("Okay, thats enough.");
		//whereButton.setEnabled(false);

		int theRandom = (int) (Math.random()*restaurants.length);
		theRestaurant.setText(restaurants[theRandom]);

	}
	
}
