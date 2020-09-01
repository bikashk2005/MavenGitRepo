package com.cg.MavenApp;

import org.junit.Assert;
import org.junit.Test;



public class MainTest {
	
	@Test
	public void test1() {
		System.out.println("test1");
		Assert.fail("test1 has fail");
		
	}
	@Test
	public void test2() {
		System.out.println("test2");
		//Assert.fail("test1 has fail");
		
	}
	@Test
	public void test3() {
		System.out.println("test3");
		Assert.fail("test3 has fail");
		
	}

}
