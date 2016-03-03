package com.android.firegate.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;

import com.android.firegate.R;

public class StartGameActivity extends BaseActivity implements OnClickListener {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_startgame);
		
		ImageView btnStartGame = (ImageView) findViewById(R.id.btnStartGame);
		btnStartGame.setOnClickListener(this);
		
		ImageView btnContinueGame = (ImageView) findViewById(R.id.btnContinueGame);
		btnContinueGame.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnStartGame:
			showCreateCharacterScreen();
			break;
		case R.id.btnContinueGame:
			showChooseCharacterScreen();
			break;
		default:
			break;
		}
	}

	private void showCreateCharacterScreen() {
		Intent intent = new Intent(StartGameActivity.this, CreateCharacterActivity.class);
		startActivity(intent);
	}
	
	private void showChooseCharacterScreen() {
		Intent intent = new Intent(StartGameActivity.this, ChooseCharacterActivity.class);
		startActivity(intent);
	}
}
