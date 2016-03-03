package com.android.firegate.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;

import com.android.firegate.R;

public class MainLoginActivity extends BaseActivity implements OnClickListener {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_mainlogin);
		
		ImageView btnLogin = (ImageView) findViewById(R.id.btnLogin);
		btnLogin.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnLogin:
			showStartGameScreen();
			break;

		default:
			break;
		}
	}
	
	private void showStartGameScreen() {
		Intent intent = new Intent(MainLoginActivity.this, StartGameActivity.class);
		startActivity(intent);
	}
}
