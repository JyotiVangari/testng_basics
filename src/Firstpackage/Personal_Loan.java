package Firstpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Personal_Loan 

{
    @AfterClass
    public void P_SignIn() 
	{
		System.out.println("AfterClass_P_SignIn");
	}
    @Test(groups= {"smoke"})
	public void P_SignOut1111() 
	{
		System.out.println("P_SignOut111");
	}
    
    @Test(enabled=false)
   	public void P_SignOut() 
   	{
   		System.out.println("P_SignOut");
   	}
    @AfterTest
	public void P_Login() 
	{
		System.out.println("AfterTest_P_Login");
	}
	
	
	
}
