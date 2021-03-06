
package com.teke.hellogradle.tests;

import android.test.AndroidTestCase;
import com.teke.hellogradle.Maths;


public class MathsTest extends AndroidTestCase {

	private Maths mMaths;

	@Override
	public void setUp() throws Exception {
		super.setUp();
		mMaths = new Maths();
	}

	public void testAdd() {
		int result = mMaths.sumOf(23, 32);
		assertEquals(55, result);
	}

	public void testMultiply() {
		int result = mMaths.productOf(3, 32);
		assertEquals(96, result);
	}

	@Override
	public void tearDown() throws Exception {
		super.tearDown();
		
	}
}
