package com.teamReserveOn.reserveon;

import java.util.ArrayList;

import com.teamReserveOn.reserveonAdapters.TablesAdapter;
import com.teamReseveOn.reserveon.R;

import entities.Table;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
 

public class TablesActivity extends Activity {
	
	String [] myStringArray = {"Mesa 1", "Mesa 2", "Mesa 3", "Mesa 4"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_tables);
		
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(1, 4, "Fundos", 2000));
		list.add(new Table(2, 2, "Porta", 3022));
		
		ListView mesas = (ListView) findViewById(R.id.tables_container);
		
		mesas.setAdapter(new TablesAdapter(this, list));

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

}
