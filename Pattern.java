package TestYantra_programming;

import java.util.Iterator;

import org.testng.annotations.Test;

public class Pattern {
	
	@Test
	public void increasingTriangle() {
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 
		int n=5;
		for (int row = 1; row <= n; row++) {
		for (int col = 1; col <=row; col++) {
			System.out.print("* ");
		}
		System.out.println();
		}
	}
	//---------------------------------------------------
	@Test
	public void decreasingTriangle() {
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		*
		int n=5;
		for (int row = 1; row <= n; row++) {
		for (int col = 5; col >= row; col--) {
			System.out.print("* ");	
		}
		System.out.println();
		}
	}
	//---------------------------------------------------
		@Test
		public void pattern3() {
//			* * * * * 
//			* * * * * 
//			* * * * * 
//			* * * * * 
//			* * * * *
			int n=5;
			for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				System.out.print("* ");	
			}
			System.out.println();
			}
		}
		
		//---------------------------------------------------
		@Test
		public void vertiacalTriangle() {
//			* 
//			* * 
//			* * * 
//			* * * * 
//			* * * * * 
//			* * * * 
//			* * * 
//			* * 
//			*
			int n=5;
			for (int i = 1; i <=n; i++) {
				for (int j = 1; j <=i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		for (int x = 0; x <=n; x++) {
			for (int y = 3; y >=x; y--) {
				System.out.print("* ");
			}
			System.out.println();
		}	

		}
		
		@Test
		public void oppositeIncreasingTriangle() {
//		        * 
//		      * * 
//		    * * * 
//		  * * * * 
//		* * * * * 
			int n=5;
			for (int i = 1; i <=n; i++) {
				
				for (int j = n-1; j >=i; j--) {
					System.out.print("  ");
				}
				for (int x = 1; x <= i; x++) {
					System.out.print("* ");
				}
				System.out.println();	
			}
		}
		
		//--------------------------------------------------------------------------------
		
		public void name() {
			
		}

}
