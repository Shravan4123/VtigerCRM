package TestNGprograms;

import org.testng.annotations.Test;

public class MultiDimentionalArray {
	@Test
	public void a() {
		int a[] = new int [4];
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		//arrays start from 0 and end with n-1
		
		// adding data into arrays
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("-------------");
		
		// for loop with arrays
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("-------------------");
		
		// for each loop with arrays
		for (int i:a) {
			System.out.println(i);
		}
	}	
}
