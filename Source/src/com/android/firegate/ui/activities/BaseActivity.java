package com.android.firegate.ui.activities;

import android.app.Activity;
import android.content.Intent;

import com.android.firegate.R;

public class BaseActivity extends Activity {
	@Override
	public void startActivity(Intent intent) {
		super.startActivity(intent);
		overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
	}

	@Override
	public void startActivityForResult(Intent intent, int requestCode) {
		super.startActivityForResult(intent, requestCode);
		overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
	}
	
	

	@Override
	public void finish() {
		// TODO Auto-generated method stub
		super.finish();
		overridePendingTransition(R.anim.slide_in_finish, R.anim.slide_out_finish);
	}
}
