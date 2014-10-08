package com.teamReserveOn.reserveon;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

import com.teamReseveOn.reserveon.R;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		
		// create the TabHost that will contain the Tabs
				TabHost tabHost = getTabHost();

				TabSpec tab1 = tabHost.newTabSpec("Reserva");
				TabSpec tab2 = tabHost.newTabSpec("Pedido");
				TabSpec tab3 = tabHost.newTabSpec("Pagamento");

				// Set the Tab name and Activity
				// that will be opened when particular Tab will be selected
				tab1.setIndicator("Reserva");
				tab1.setContent(new Intent(this, Aba1Activity.class));

				tab2.setIndicator("Pedido");
				tab2.setContent(new Intent(this, Aba2Activity.class));

				tab3.setIndicator("Pagamento");
				tab3.setContent(new Intent(this, Aba3Activity.class));

				/** Add the tabs to the TabHost to display. */
				tabHost.addTab(tab1);
				tabHost.addTab(tab2);
				tabHost.addTab(tab3);
		
	}
	
	@Override
	public void onStart() {
		super.onStart();
	}
	
	@Override
	public void onRestart() {
		super.onRestart();
	}
	
	@Override 
	public void onResume() {
		super.onResume();
	}
	
	@Override
	public void onPause() {
		super.onPause();
	}
	
	@Override
	public void onStop() {
		super.onStop();
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
	}
	
	public void initTablesActivity(View v) {
		Intent tablesActivity = new Intent(this, TablesActivity.class);
		startActivity(tablesActivity);
	}
}
