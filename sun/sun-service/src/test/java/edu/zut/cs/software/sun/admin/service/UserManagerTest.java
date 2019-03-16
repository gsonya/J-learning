package edu.zut.cs.software.sun.admin.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import Impl.UserManagerImpl;

public class UserManagerTest extends AbstractJUnit4SpringContextTests{
	
	UserManager userManger;
	@Autowired
	public void setUserManager(UserManager userManager) {
		this.userManger=userManager;
	}

	@Test
	public void testSayHello() {
		String expected="Hello,World!";
		String result=this.userManger.sayHello("world");
		assertEquals(expected,result);
	}

}
