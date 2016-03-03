package com.android.firegate.ui.activities;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.android.firegate.R;
import com.android.firegate.ui.fragments.FragmentAction;
import com.android.firegate.ui.fragments.FragmentAttribute;

public class MainGameActivity extends BaseFragmentActivity implements OnClickListener {

	private FrameLayout fragmentContainer;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_maingame);
		fragmentContainer = (FrameLayout) findViewById(R.id.fragmentContainer);
		LinearLayout layoutAction = (LinearLayout) findViewById(R.id.layoutAction);
		LinearLayout layoutAttribute = (LinearLayout) findViewById(R.id.layoutAttribute);
		Button btnGame = (Button) findViewById(R.id.btnGame);
		LinearLayout layoutChat = (LinearLayout) findViewById(R.id.layoutChat);

		layoutAction.setOnClickListener(this);
		layoutAttribute.setOnClickListener(this);
		btnGame.setOnClickListener(this);
		layoutChat.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.layoutAction:
			showActionFragment();
			break;
		case R.id.layoutAttribute:
			showAttributeFragment();
			break;
		case R.id.btnGame:
			showGameFragment();
			break;
		case R.id.layoutChat:
			showChatFragment();
			break;
		default:
			break;
		}
	}

	private void showActionFragment() {
		fragmentContainer.setVisibility(View.VISIBLE);
		FragmentAction fragment = new FragmentAction();
		fragment.parentActivity = this;
		getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, fragment).commit();
	}

	private void showAttributeFragment() {
		fragmentContainer.setVisibility(View.VISIBLE);
		FragmentAttribute fragment = new FragmentAttribute();
		fragment.parentActivity = this;
		getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, fragment).commit();
	}

	private void showGameFragment() {

	}

	private void showChatFragment() {

	}
	
	public void hideFragment() {
		fragmentContainer.setVisibility(View.GONE);
	}
}
