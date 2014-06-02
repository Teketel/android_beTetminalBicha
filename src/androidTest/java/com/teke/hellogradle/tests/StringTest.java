package com.teke.hellogradle.tests;

import android.test.AndroidTestCase;
import com.teke.hellogradle.StringStuff;


public class StringTest extends AndroidTestCase {

    private StringStuff mString;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        mString = new StringStuff();
    }

    public void testStringSwitch() {
        String[] result = mString.stringSwitch("Hello", "there");
        assertTrue("Hello" == result[1]);
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        
    }

}