package org.example.spring2;

import org.example.spring2.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        // 加载 applicationContext.xml 配置
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) // 获取配置中的 UserService 实例
                applicationContext.getBean("userService");
        boolean flag = userService.login("张三", "123");
        if (flag) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
    }
}
