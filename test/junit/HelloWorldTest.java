package junit;

import junit.framework.TestCase;

public class HelloWorldTest extends TestCase {
    public void testGetMessage() throws Exception {
		HelloWorld hello = new HelloWorld();
		String msg = hello.getMessage();
		assertEquals("Hello World", msg);
	}
    public void testGetMessageWithName() throws Exception {
    	HelloWorld hello = new HelloWorld();
    	String msg = hello.getMessage("수지");
    	assertEquals("Hello 수지", msg);
    }
    public void testGetMessageWithName2() throws Exception {
    	HelloWorld hello = new HelloWorld();
    	String msg = hello.getMessage("도희");
    	assertEquals("Hello 도희", msg);
    }
    public void testGetMessageNull() throws Exception {
    	HelloWorld hello = new HelloWorld();
    	String msg = hello.getMessage(null);
    	assertEquals("Hello World", msg);
    }
}
