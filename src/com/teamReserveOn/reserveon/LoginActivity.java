package com.teamReserveOn.reserveon;

import com.teamReseveOn.reserveon.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        
        
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
	
	public void initApp(View v) {
		Intent mainActivity = new Intent(this, MainActivity.class);
		startActivity(mainActivity);		
	}
	
	public void registerNewUser(View v) {
		Intent registerActivity = new Intent(this, RegisterActivity.class);
		startActivity(registerActivity);
	}
   
}
