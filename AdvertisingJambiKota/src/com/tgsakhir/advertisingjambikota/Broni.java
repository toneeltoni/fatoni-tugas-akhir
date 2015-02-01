package com.tgsakhir.advertisingjambikota;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Broni extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_broni);
	}
	public void advsepakat(View v){
 		Intent i = new Intent(getApplicationContext(),Sepakat.class);
	startActivity(i);
	}
	
	
	public void advvirgo(View v){
 		Intent i = new Intent(getApplicationContext(),Virgo.class);
	startActivity(i);
	}
	
	public void advestika(View v){
 		Intent i = new Intent(getApplicationContext(),Estika.class);
	startActivity(i);
	}
	
	public void advsartika(View v){
 		Intent i = new Intent(getApplicationContext(),Sartika.class);
	startActivity(i);
	}
	
	
	public void advmerapi(View v){
 		Intent i = new Intent(getApplicationContext(),Merapi.class);
	startActivity(i);
	}

	public void advr3(View v){
 		Intent i = new Intent(getApplicationContext(),R3.class);
	startActivity(i);
	}

	public void advdhimas(View v){
 		Intent i = new Intent(getApplicationContext(),Dhimas.class);
	startActivity(i);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.broni, menu);
		return true;
	}

	   


	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
