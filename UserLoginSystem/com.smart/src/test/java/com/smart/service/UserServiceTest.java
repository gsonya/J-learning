package com.smart.service;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.smart.domain.User;

@ContextConfiguration("classpath*:/smart-context.xml")
public class UserServiceTest extends AbstractTransactionalTestNGSpringContextTests{

  private UserService userService;
  @Autowired//注入spring容器中的Bean
  public void setUserService(UserService userService) {
	  this.userService=userService;
  }
  //标注测试方法
  @Test
  public void findUserByUserNameTest() {
    User user=userService.findUserByUserName("admin");
    assertEquals(user.getUserName(),"admin");
  }

  @Test
  public void hasMatchUserTest() {
    boolean b1=userService.hasMatchUser("admin", "123456");
    boolean b2=userService.hasMatchUser("admin", "1111");
    assertTrue(b1);
    assertTrue(!b2);
  }

  @Test
  public void loginSucessTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void setLoginLogDaoTest() {
    throw new RuntimeException("Test not implemented");
  }
}
