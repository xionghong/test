package com.example.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private Button start;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final Intent intent = new Intent(this, SecrendActivity.class);
		start = (Button) findViewById(R.id.bt_start);
		start.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivityForResult(intent, 0);
			}			
		});	
		Toast.makeText(this, "2141111111111111111124", Toast.LENGTH_LONG).show();
	}	
}
