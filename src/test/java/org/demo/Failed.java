package org.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class Failed implements IAnnotationTransformer {

	public void transform(ITestAnnotation a, Class testClass, Constructor testConstructor, Method testMethod) {
	
		IRetryAnalyzer t = a.getRetryAnalyzer();
		if (t==null) {
			
			a.setRetryAnalyzer(Rerun.class);
			
		}
		
		
	}

}
