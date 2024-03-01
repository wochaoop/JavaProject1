import org.example.spring1.HelloSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloSpring {
    public static void main(String[] args) {
        // 初始化 spring 容器，加载 applicationContext.xml 配置
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 通过容器获取配置中 helloSpring 的实例
        HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
        // 调用方法
        helloSpring.show();
    }
}