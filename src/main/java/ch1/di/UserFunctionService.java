package ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *  使用功能类的Bean
 *
 * 1.使用@Service 注解声明当前UserFunctionService类是Spring管理的一个Bean
 * 2.使用@Autowired将FunctionService的实体Bean注入到UserFunctionService中，
 *  让UserFunctionService具备FunctionService的功能,
 *  此处使用JSR-330的@Inject注解或者JSR-250的@Resource注解是等效的
 */
@Service //1
public class UserFunctionService {

    @Autowired //2
    FunctionService functionService;

    public String SayHello(String word){
        return functionService.sayHello(word);
    }

}
