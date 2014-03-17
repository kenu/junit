package junit;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(HelloWorldTest.class);
		suite.addTestSuite(PlayTest.class);
		//$JUnit-END$
		return suite;
	}

}
