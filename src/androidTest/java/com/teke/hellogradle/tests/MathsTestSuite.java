package com.teke.hellogradle.tests;


import android.test.AndroidTestCase;
import com.teke.hellogradle.tests.MathsTest;
import junit.framework.TestSuite;


public class MathsTestSuite extends TestSuite {

    public static TestSuite sute() {

        TestSuite zSuite = new  TestSuite();
        zSuite.addTest(TestSuite.createTest(MathsTest.class, "testAdd"));
        return zSuite;
    }
}
