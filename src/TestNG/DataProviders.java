package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	
	@Test(dataProvider="testDta")
	public void dataProvExample(String data1,String data2, String data3) {
		
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
	}
	
	@DataProvider
	public Object[][] testDta() {
	Object[][] data = new Object[2][3];
	
	data [0][0] = "abcdef";
	data [0][1] = "bcdef";
	data [0][2] ="abcdef";
	data [1][0] = "c";
	data [1][1] = "d";
	data [1][2] = "cd";
	
	return data;
	
}
}