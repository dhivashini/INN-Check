package com.example.inn_check;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;

public class Activity3 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity3);
	}
	public void onRadioButtonClicked(View view) {
	    // Is the button now checked?
	    boolean checked = ((RadioButton) view).isChecked();
	    
	    // Check which radio button was clicked
	    switch(view.getId()) {
	        case R.id.d1:
	            if (checked)
	            	
	            	{
	            	AlertDialog.Builder ab=new AlertDialog.Builder(this);
	            	ab.setTitle("COST DETAILS");
	            	ab.setMessage("cost for 2 is 4000INR");
	            	ab.setPositiveButton("ok",null);
	            	ab.show();
	            	}
	            break;
	            	
	        case R.id.d2:
	            if (checked)
	            	{
	            	AlertDialog.Builder ab=new AlertDialog.Builder(this);
	            	ab.setTitle("COST DETAILS");
	            	ab.setMessage("cost for 2 is 6000INR");
	            	ab.setPositiveButton("ok",null);
	            	ab.show();
	            	}
	            break;
	        case R.id.d3:
	            if (checked)
	            	{
	            	AlertDialog.Builder ab=new AlertDialog.Builder(this);
	            	ab.setTitle("COST DETAILS");
	            	ab.setMessage("cost for 2 is 8000INR");
	            	ab.setPositiveButton("ok",null);
	            	ab.show();
	            	}
	            break;
	        case R.id.d4:
	            if (checked)
	            	{
	            	AlertDialog.Builder ab=new AlertDialog.Builder(this);
	            	ab.setTitle("COST DETAILS");
	            	ab.setMessage("cost for 2 is 10000INR");
	            	ab.setPositiveButton("ok",null);
	            	ab.show();
	            	}
	            break;
	    }
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity3, menu);
		return true;
	}

}
