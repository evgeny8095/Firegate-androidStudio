package com.android.firegate.ui.activities;

import android.os.Bundle;
import android.view.Window;

import com.android.firegate.R;

public class ChooseCharacterActivity extends BaseActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_choosecharacter);
	}

}
