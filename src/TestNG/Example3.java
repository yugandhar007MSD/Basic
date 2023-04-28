package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Example3 {
	
	@Test(groups= {"SmokeTesting"})
	public void ThirdTest() {
		System.out.println("yug");
				
	}
	@Test(dependsOnMethods= {"ThirdTest"})
	public void FourthTest()
	{
		System.out.println("four");
				
	}

	@AfterTest
	public void lastExecution()
	{
		System.out.println("Execute at last man");
	}
}
