package org.example.spring2;

import org.example.spring2.User2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser2 {
    public static void main(String[] args) throws Exception {
        //加载 applicationContext.xml 配置
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext-User2.xml");
        //获取配置中的 User2 实例
        User2 user2 = applicationContext.getBean("user2", User2.class);
        System.out.println(user2);
    }
}