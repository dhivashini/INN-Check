package com.example.inn_check;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toast t=Toast.makeText(this, "welcome",Toast.LENGTH_LONG);
		t.show();
		
	}
	public void onRadioButtonClicked(View view) {
	    // Is the button now checked?
	    boolean checked = ((RadioButton) view).isChecked();
	    
	    // Check which radio button was clicked
	    switch(view.getId()) {
	        case R.id.c1:
	            if (checked)
	            	
	            	{Intent inte=new Intent(this,Activity1.class);
	        	startActivity(inte);
	            	}
	            break;
	            	
	        case R.id.c2:
	            if (checked)
	            	{
	            	Intent inte2=new Intent(this,Activity2.class);
	            	
	        	startActivity(inte2);
	            	}
	            break;
	        case R.id.c3:
	            if (checked)
	            	{
	            	Intent inte3=new Intent(this,Activity3.class);
	            	
	        	startActivity(inte3);
	            	}
	            break;
	        case R.id.c4:
	            if (checked)
	            	{
	            	Intent inte3=new Intent(this,Activity4.class);
	            	
	        	startActivity(inte3);
	            	}
	            break;
	        case R.id.c5:
	            if (checked)
	            	{
	            	Intent inte3=new Intent(this,Activity5.class);
	            	
	        	startActivity(inte3);
	            	}
	            break;
	    }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
