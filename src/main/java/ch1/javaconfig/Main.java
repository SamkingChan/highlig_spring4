package ch1.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 启动类
 * 1.使用AnnotationConfigApplicationContext作为Spring容器，接受输入一个配置类作为参数；
 * 2.获得声明配置的UserFunctionService的Bean
 *
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class); //1
        UserFunctionService userFunctionService = context.getBean(UserFunctionService.class); //2
        System.out.println(userFunctionService.SayHello("JavaConfig"));
        context.close();
    }
}
