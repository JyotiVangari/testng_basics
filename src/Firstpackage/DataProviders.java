package Firstpackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders 
{
	@Test(dataProvider="getdata")
	public void Data(String User , String Pass)
	
	{
		System.out.println("UserFristName is "+User);
		System.out.println("UserLastName  is "+Pass);
	}
	
	@DataProvider
	public 	Object[][] getdata()
	{
		System.out.println("Data Provider Annotations");
		
		Object[][] data = new Object[2][2];
		
		data[0][0]="Jyoti";
		data[0][1]="Vangari";
				data[1][0]="Shyam";
				data[1][1]="SudarVangari";
				        
						return data;
	}
	
}
