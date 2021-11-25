package cn.spring.test;

import cn.spring.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testDemo {
    @Test
    public void text(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
       UserService userService = (UserService) context.getBean("userService");
       userService.addUser();
    }
}
