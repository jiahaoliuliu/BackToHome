package com.jiahaoliuliu.backtohome;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class NativeStaticBackActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Lock the screen orientation
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

		setContentView(R.layout.native_static_back_layout);
	}
}
