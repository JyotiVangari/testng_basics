package Firstpackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Home_Loan 
{

    @BeforeMethod
	public void H_SignIn() 
	{
		System.out.println("BeforeMethod_H_SignIn");
	}
    @Test
	public void H_SignOut() 
	{
		System.out.println("H_SignOut");
	}
    @Test(groups= {"smoke"})
	public void H_SignOut2222() 
	{
		System.out.println("H_SignOut22222");
	}
    @BeforeSuite
	public void H_Login() 
	{
		System.out.println("BeforeSuite_H_Login");
	}
	
}
