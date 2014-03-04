package com.jiahaoliuliu.backtohome;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends Activity {

	private Button backStaticalButton;
	private Button backDynamicalButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		
		// Link the content
		backStaticalButton = (Button)findViewById(R.id.backStaticalButton);
		backStaticalButton.setOnClickListener(onClickListener);
		
		backDynamicalButton = (Button)findViewById(R.id.backDynamicalButton);
		backDynamicalButton.setOnClickListener(onClickListener);
	}
	
	private View.OnClickListener onClickListener = new View.OnClickListener() {

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.backStaticalButton:
				// Start the activity
				Intent startBackStaticalActivityIntent
					= new Intent(HomeActivity.this, BackStaticalActivity.class);
				startActivity(startBackStaticalActivityIntent);

				break;
			case R.id.backDynamicalButton:
				// Start the activity
				Intent startBackDynamicalActivityIntent
					= new Intent(HomeActivity.this, BackDynamicalActivity.class);
				startActivity(startBackDynamicalActivityIntent);

				break;
			}
		}
	};
}
