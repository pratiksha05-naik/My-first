package amazonprograms.Amazon_Practise;

import org.testng.annotations.Test;

public class Testcase1 extends Base_Class{

	
	
	@Test
	public void testCase1()
	{
		Login_Page  H1= new Login_Page (driver);
		H1.enteremail();
		H1.continueclick();
		H1.password();
		H1.signin();
		
		Home_Page H2= new Home_Page(driver);
		H2.dropdown();
		H2.search();
	}
}
