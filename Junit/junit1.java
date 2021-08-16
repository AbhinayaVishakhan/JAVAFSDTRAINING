package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class junit1 {
@ BeforeClass
public static void beforeAllTest()
{
	System.out.println("befpre all test starts");
}
@Before
public void beforeTest() {
	System.out.println("before test");
}
	@Test(timeout=500)
	public void test() {
		String str="Java Training";
		assertEquals("JAVA TRAINING",str);}
	@Test
	public  void test1()
	{
		int i=5;
		assertNotEquals(5,5);
	}
	@AfterClass
	public static void afterTest() {
		System.out.println("after test");
	}
	@After
	public void afterAllTestTest() {
		System.out.println("after all");
	}

}
