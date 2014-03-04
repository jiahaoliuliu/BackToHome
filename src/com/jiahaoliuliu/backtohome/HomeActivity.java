package com.jiahaoliuliu.backtohome;

import com.actionbarsherlock.app.SherlockActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends SherlockActivity {

	// Native Action bar
	private Button nativeStaticBackButton;
	private Button nativeDynamicBackButton;

	// Non native action bar (ActionBarSherlock)
	private Button nonNativeStaticBackButton;
	private Button nonNativeDynamicBackButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

		// Link the content
		nativeStaticBackButton = (Button)findViewById(R.id.nativeStaticBackButton);
		nativeStaticBackButton.setOnClickListener(onClickListener);

		nativeDynamicBackButton = (Button)findViewById(R.id.nativeDynamicBackButton);
		nativeDynamicBackButton.setOnClickListener(onClickListener);

		nonNativeStaticBackButton = (Button)findViewById(R.id.nonNativeStaticBackButton);
		nonNativeStaticBackButton.setOnClickListener(onClickListener);

		nonNativeDynamicBackButton = (Button)findViewById(R.id.nonNativeDynamicBackButton);
		nonNativeDynamicBackButton.setOnClickListener(onClickListener);
	}

	private View.OnClickListener onClickListener = new View.OnClickListener() {

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.nativeStaticBackButton:
				// Start the activity
				Intent startNativeStaticBackActivityIntent
					= new Intent(HomeActivity.this, NativeStaticBackActivity.class);
				startActivity(startNativeStaticBackActivityIntent);

				break;
			case R.id.nativeDynamicBackButton:
				// Start the activity
				Intent startDynamicBackActivityIntent
					= new Intent(HomeActivity.this, NativeDynamicBackActivity.class);
				startActivity(startDynamicBackActivityIntent);

				break;
			case R.id.nonNativeStaticBackButton:
				// Start the activity
				Intent startNonNativeStaticBackActivityIntent
					= new Intent(HomeActivity.this, NonNativeStaticBackActivity.class);
				startActivity(startNonNativeStaticBackActivityIntent);

				break;
			case R.id.nonNativeDynamicBackButton:
				// Start the activity
				Intent startNonNativeDynamicBackActivityIntent
					= new Intent(HomeActivity.this, NonNativeDynamicBackActivity.class);
				startActivity(startNonNativeDynamicBackActivityIntent);

				break;
			}
		}
	};
}
