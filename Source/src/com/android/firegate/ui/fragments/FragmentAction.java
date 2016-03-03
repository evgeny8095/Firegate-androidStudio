package com.android.firegate.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.android.firegate.R;
import com.android.firegate.ui.activities.MainGameActivity;


public class FragmentAction extends BaseFragment implements OnClickListener {

	public MainGameActivity parentActivity;
	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_action, container, false);
		LinearLayout layoutTopbar = (LinearLayout) view.findViewById(R.id.layoutTopbar);
		layoutTopbar.setOnClickListener(this);
		return view;
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.layoutTopbar:
			if (parentActivity != null) {
				parentActivity.hideFragment();
			}
			break;

		default:
			break;
		}
	}
	
}
