package Firstpackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG 
{
    @Parameters({ "URL","Pass"})
    @Test
    public void Demo1(String URL1, String pass2)
	{
	
    	System.out.println("My first method in this");
    	System.out.println(URL1);
    	System.out.println(pass2);
    	
	}
    
    @Test(groups= {"smoke"})
	public void Demo0() 
	{
		System.out.println("Demo0");
	}
	
    @BeforeTest
    public void Demo2()
	{
	
    	System.out.println("BeforeTest_Demo2");
    	
	}
    @BeforeClass
    public void Demo3()
	{
	
    	System.out.println("BeforeClass _Demo3");
    	
	}
    
}
