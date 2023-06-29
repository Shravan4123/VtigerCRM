package TestNGprograms;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataProvider {

	@Test(dataProvider = "data")
	public void login(String user, String password) {
		System.out.println(user+" ");
		System.out.println(password);
		System.out.println("--------------------");
	}
	@DataProvider(name = "data")
	public String [][] a (){
		String value [][] = {{"valid","valid"},
							  {"invalid","invalid"}};
		return value;
		
	}
	
}
