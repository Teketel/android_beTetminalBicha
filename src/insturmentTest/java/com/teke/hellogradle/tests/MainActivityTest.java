package com.teke.hellogradle.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.teke.hellogradle.MainActivity;
import com.teke.hellogradle.R;


public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
	private MainActivity mainActivity;


	public MainActivityTest() {
		super("com.teke.hellogradle", MainActivity.class);
	}

	@Override
	public void onUp() {
		super.onUp();
		mainActivity = MainActivity();
	}

	@SmallTest
	public testTextView() {
		TextView titileTv = (TextView) mainActivity.findViewById(R.id.text_view);
		assertNotNull(titleTv);
	}
}