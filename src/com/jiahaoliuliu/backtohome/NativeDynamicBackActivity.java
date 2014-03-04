package com.jiahaoliuliu.backtohome;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

public class NativeDynamicBackActivity extends Activity {

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.native_dynamic_back_layout);

		getActionBar().setDisplayHomeAsUpEnabled(true);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId() == android.R.id.home) {
			// Back to the previous activity
			onBackPressed();
			return true;
		} else {
			return super.onOptionsItemSelected(item);
		}
	}
}
