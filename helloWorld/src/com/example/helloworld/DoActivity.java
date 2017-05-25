package com.example.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class DoActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity2);
		Intent intent=getIntent();
		String huo=intent.getStringExtra("huoa");
		EditText huoa=(EditText) findViewById(R.id.huoa);
		huoa.setText(huo);
		
	}
	
	
	
	@Override
	public void onClick(View arg0) {
		
		
	}

	
	
}
