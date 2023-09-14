package com.fdmgroup.testscripts;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class) //comprise of multiple test cases
@SuiteClasses({       //sequence of test cases
	LoginTest.class,
	LogoutTest.class
})
public class TestRunner {

}
