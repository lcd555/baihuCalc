package com.example.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;



public class HelloWorldActivity extends Activity implements OnClickListener{

	//private CheckBox box;
	private EditText huoa,huob,huoc,huod;
	private EditText tuoa,tuob,tuoc,tuod;
	private EditText hua,hub,huc,hud;
	private TextView jg1,jg2,jg3,jg4;
	
	private Button calcu,reset,exit;
	
	
	private int [][]editSJ=new int[4][3];
	private double [] r=new double[4];
	private double[] r1=new double[4];
	
	private EditText m;
	String A,B,C,D;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        huoa=(EditText) findViewById(R.id.huoa);
        huob=(EditText) findViewById(R.id.huob);
        huoc=(EditText) findViewById(R.id.huoc);
        huod=(EditText) findViewById(R.id.huod);
        tuoa=(EditText) findViewById(R.id.tuoa);
        tuob=(EditText) findViewById(R.id.tuob);
        tuoc=(EditText) findViewById(R.id.tuoc);
        tuod=(EditText) findViewById(R.id.tuod);
        hua=(EditText) findViewById(R.id.hua);
        hub=(EditText) findViewById(R.id.hub);
        huc=(EditText) findViewById(R.id.huc);
        hud=(EditText) findViewById(R.id.hud);
        jg1=(TextView) findViewById(R.id.jg1);
        jg2=(TextView) findViewById(R.id.jg2);
        jg3=(TextView) findViewById(R.id.jg3);
        jg4=(TextView) findViewById(R.id.jg4);
        m=(EditText) findViewById(R.id.howMany);
        
        calcu=(Button) findViewById(R.id.calcu);
        reset=(Button) findViewById(R.id.reset);
        exit=(Button) findViewById(R.id.exit);
        calcu.setOnClickListener(this);
        reset.setOnClickListener(this);
        exit.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.reset:
			jg1.setText("");
			jg2.setText("");
			jg3.setText("");
			jg4.setText("");
			huoa.setText("");
			huob.setText("");
			huoc.setText("");
			huod.setText("");
			hua.setText("");
			hub.setText("");
			huc.setText("");
			hud.setText("");
			tuoa.setText("");
			tuob.setText("");
			tuoc.setText("");
			tuod.setText("");
			for(int i=0;i<4;i++){
				r[i]=0;
				r1[i]=0;
				
			}
			break;
		case R.id.calcu:
			for(int i=0;i<4;i++){
				r[i]=0;
				r1[i]=0;
				
			}
			result();
			break;
		case R.id.exit:
			finish();
			break;
		}
		
		
	}
	public void getSJ(){
		
		editSJ[0][0]=Integer.parseInt(huoa.getText().toString());
		editSJ[0][1]=Integer.parseInt(tuoa.getText().toString());
		editSJ[0][2]=Integer.parseInt(hua.getText().toString());
		editSJ[1][0]=Integer.parseInt(huob.getText().toString());
		editSJ[1][1]=Integer.parseInt(tuob.getText().toString());
		editSJ[1][2]=Integer.parseInt(hub.getText().toString());
		editSJ[2][0]=Integer.parseInt(huoc.getText().toString());
		editSJ[2][1]=Integer.parseInt(tuoc.getText().toString());
		editSJ[2][2]=Integer.parseInt(huc.getText().toString());
		editSJ[3][0]=Integer.parseInt(huod.getText().toString());
		editSJ[3][1]=Integer.parseInt(tuod.getText().toString());
		editSJ[3][2]=Integer.parseInt(hud.getText().toString());
		
	}
	
	public void  result(){
		double m1=0.0;
		if(m.getText().toString()!=""){
			m1=Double.parseDouble(m.getText().toString());
			getSJ();
		}
		
		
		for(int i=0;i<editSJ.length;i++){
			
				for(int j=i+1;j<4;j++){
				if(editSJ[i][1]>editSJ[j][1]){
					r[i]=r[i]+editSJ[i][1]+editSJ[j][1];
					r[j]=r[j]-editSJ[i][1]-editSJ[j][1];
					
					
				}else if(editSJ[i][1]<editSJ[j][1]){
					r[j]=r[j]+editSJ[i][1]+editSJ[j][1];
					r[i]=r[i]-editSJ[i][1]-editSJ[j][1];
				}
				
				r1[i]=r1[i]+(editSJ[i][2]-editSJ[j][2])*m1*(editSJ[i][0]+1)*(editSJ[j][0]+1);
				r1[j]=r1[j]-(editSJ[i][2]-editSJ[j][2])*m1*(editSJ[i][0]+1)*(editSJ[j][0]+1);
				}
				
			
		}
		
		
		
		
		
		
		
	
		jg1.setText(r[0]+r1[0]+"");
		jg2.setText(r[1]+r1[1]+"");
		jg3.setText(r[2]+r1[2]+"");
		
		jg4.setText(r[3]+r1[3]+"");
		
		
		
		
	}
	
	
	

	
	/*public void passDate(){
		
		
		Intent intent=new Intent(this,DoActivity.class);
		
		intent.putExtra("huoa", huoa.getText().toString().trim());
		startActivity(intent);
		
	}
	*/
	

   
    
}
