package org.demo;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


public class RunnerClass {

	@Test
	public void result() {
	
		Result r= JUnitCore.runClasses(A.class,B.class);
		
		
		int runCount = r.getRunCount();
		System.out.println("Total run count ="+runCount);
		System.out.println("Ignore count="+r.getIgnoreCount());
	}
	
	
	
	
			

}
