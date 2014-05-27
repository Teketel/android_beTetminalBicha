
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
		assertEquals(5, result);
	}

	@Override
	public void tearDown() throws Exception {
		super.tearDown();
		
	}
}
