package Firstpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Car_Loan 
{
    @AfterSuite
    public void C_SignIn() 
	{
		System.out.println("AfterSuite_C_SignIn");
	}
    @AfterMethod
	public void C_SignOut() 
	{
		System.out.println("AfterMethod_C_SignOut");
	}
    @Test
   	public void c_Sign() 
   	{
   		System.out.println("First_dependsOnMethodsc_Sign");
   	}
       
    @Test
   	public void c_zign() 
   	{
   		System.out.println("First_dependsOnMethods_c_zign");
   	}
      
    
    @Test(dependsOnMethods= {"c_Sign","c_zign"})
	public void c_Login() 
	{
		System.out.println("c_Login");
	}
    @Test
    public void c_LoginStet() 
	{
		System.out.println("c_LoginStet");
	}
    @Test
   	public void c_Login143() 
   	{
   		System.out.println("c_Login143");
   	}
    @Test(groups= {"smoke"})
	public void c_Login11111() 
	{
		System.out.println("c_Login1111");
	}
	
	
	
}
