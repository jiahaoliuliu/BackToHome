package com.jiahaoliuliu.backtohome;

import com.actionbarsherlock.app.SherlockActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends SherlockActivity {

	// Native Action bar
	private Button nativeBackStaticalButton;
	private Button nativeBackDynamicalButton;

	// Non native action bar (ActionBarSherlock)
	private Button nonNativeBackStaticalButton;
	private Button nonNativeBackDynamicalButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

		// Link the content
		nativeBackStaticalButton = (Button)findViewById(R.id.nativeBackStaticalButton);
		nativeBackStaticalButton.setOnClickListener(onClickListener);

		nativeBackDynamicalButton = (Button)findViewById(R.id.nativeBackDynamicalButton);
		nativeBackDynamicalButton.setOnClickListener(onClickListener);

		nonNativeBackStaticalButton = (Button)findViewById(R.id.nonNativeBackStaticalButton);
		nonNativeBackStaticalButton.setOnClickListener(onClickListener);

		nonNativeBackDynamicalButton = (Button)findViewById(R.id.nonNativeBackDynamicalButton);
		nonNativeBackDynamicalButton.setOnClickListener(onClickListener);
	}

	private View.OnClickListener onClickListener = new View.OnClickListener() {

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.nativeBackStaticalButton:
				// Start the activity
				Intent startBackStaticalActivityIntent
					= new Intent(HomeActivity.this, NativeBackStaticalActivity.class);
				startActivity(startBackStaticalActivityIntent);

				break;
			case R.id.nativeBackDynamicalButton:
				// Start the activity
				Intent startBackDynamicalActivityIntent
					= new Intent(HomeActivity.this, NativeBackDynamicalActivity.class);
				startActivity(startBackDynamicalActivityIntent);

				break;
			}
		}
	};
}
