package com.android.firegate.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.firegate.R;

public class CreateCharacterActivity extends BaseActivity implements OnClickListener {
	private LinearLayout layoutPopup;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_createcharacter);
		
		ImageView btnStartGame = (ImageView) findViewById(R.id.btnStartGame);
		ImageView btnCancelGame = (ImageView) findViewById(R.id.btnCancelGame);
		Button btnPhone = (Button) findViewById(R.id.btnPhone);
		Button btnCamera = (Button) findViewById(R.id.btnCamera);
		Button btnCancelUpload = (Button) findViewById(R.id.btnCancelUpload);
		ImageView btnUploadImage = (ImageView) findViewById(R.id.btnUploadImage);
		btnStartGame.setOnClickListener(this);
		btnCancelGame.setOnClickListener(this);
		btnPhone.setOnClickListener(this);
		btnCamera.setOnClickListener(this);
		btnCancelUpload.setOnClickListener(this);
		btnUploadImage.setOnClickListener(this);
		TextView tvDescription = (TextView) findViewById(R.id.tvDescription);
		tvDescription.setMovementMethod(new ScrollingMovementMethod());
		layoutPopup = (LinearLayout) findViewById(R.id.layoutPopup);
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnStartGame:
			showMainGameScreen();
			break;
		case R.id.btnCancelGame:
			
			break;
		case R.id.btnPhone:
			
			break;
		case R.id.btnCamera:
			
			break;
		case R.id.btnCancelUpload:
			layoutPopup.setVisibility(View.GONE);
			break;
		case R.id.btnUploadImage:
			layoutPopup.setVisibility(View.VISIBLE);
			break;
		}
	}
	
	private void showMainGameScreen() {
		Intent intent = new Intent(CreateCharacterActivity.this, MainGameActivity.class);
		startActivity(intent);
	}

}
