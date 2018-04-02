package ch1.di;

import org.springframework.stereotype.Service;

/**
 * 功能类的Bean
 *
 * 1:使用@Service注解声明当前FunctionService类是Spring管理的一个Bean。
 *  其中，使用@Component、@Service、@Repository和@Controller是等效的，可根据需要选用
 */
@Service //1
public class FunctionService {
    public String sayHello(String word){
        return "Hello " + word + "!";
    }
}
