package org.demo;

import org.basec.HelperClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class B extends HelperClass {
	
		@Test
		private void tc1() {
		System.out.println("Tc-1");
		}
	
		@Test
		private void tc2() {
			Assert.assertTrue(false);
		System.out.println("Tc-2");
		}
	

		@Test
		private void tc3() {
		System.out.println("Tc-3");
		}
	

	
	
}
