
package com.teke.hellogradle.tests;

import android.test.TestCase;
import com.teke.hellogradle.Maths;


public class MathsTest extends TestCase {

	private Maths mMaths;

	public MathsTest() {

	}

	@Override
	public void onUp() {
		super.onUp();
		mMaths = new Maths();
	}

	@SmallTest
	public testAdd() {
		int result = mMaths.sumOf(23, 32);
		assertEquals(5, result);
	}
}