package com.example.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class SecrendActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secrend);
		Toast.makeText(this, "进入到第2个中", Toast.LENGTH_LONG).show();
	}
}
