package ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 1.使用@Configuration注解表明当前类是一个配置类，这意味着这个类里可能有0个或者多个@Bean注解，此处没有使用包扫描，是因为所有的Bean都在此类中定义了。
 * 2.使用@Bean注解声明当前方法FunctionSerivce的返回值是一个Bean，Bean的名称是方法名。
 * 3.注入FunctionService的Bean时候，直接调用functionService()
 * 4.另一种注入的方式，直接将FunctionService作为参数给userFunctionService()，这也是Spring容器提供的极好的功能。在Spring容器中，只要容器中存在某个Bean，就可以在另外一个Bean的声明方法的参数中注入
 */
@Configuration//1
public class JavaConfig {
    @Bean//2
    public FunctionService functionService(){
        return new FunctionService();
    }

    @Bean
    public UserFunctionService userFunctionService(){
        UserFunctionService userFunctionService = new UserFunctionService();
        userFunctionService.setFunctionService(functionService());//3
        return userFunctionService;
    }
//    4:
//    public UserFunctionService userFunctionService(FunctionService functionService){
//        UserFunctionService userFunctionService = new UserFunctionService();
//        userFunctionService.setFunctionService(functionService);
//        return userFunctionService;
//    }
}
