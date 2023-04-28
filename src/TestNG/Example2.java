package TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Example2 {

	
	@Parameters({   "URL"  })
	@Test
	public void secondTest(int value) {
		System.out.println("print");
		System.out.println(value);

	}
	
	@Test(groups= {"SmokeTesting"})
	public void ThirdTest() {
		System.out.println("print 3");

	}
	@BeforeMethod
	public void secondTestyy() {
		System.out.println("First method");

	}

	
}
