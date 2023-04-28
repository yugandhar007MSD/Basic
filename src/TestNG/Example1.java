package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example1 {
	@Test
	public void add() {

		int a = 1;
		int b = 2;
		int c = a + b;
		System.out.println(c);

	}
	@BeforeClass
	public void class1()
	{
		
		System.out.println("class first");
	}

	@Test
	public void secondTest() {
		System.out.println("c");

	}
	@Test
	public void loginthroughmob() {
		System.out.println("mob");
		
	}
	@Test(groups= {"SmokeTesting"})
	public void loginthroughphone() {
		System.out.println("phone");
		
	}

	@BeforeSuite
	public void firstExecute()
	{
		System.out.println("Execute at first");
	}
@AfterSuite
public void lastExecute()
{
	System.out.println("Execute at last");
}
}
