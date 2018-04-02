package ch1.javaconfig;

/**
 * 1.此处没有使用@Service声明Bean
 * 2.此处没有使用@Autowired注解注入Bean
 */

//1
public class UserFunctionService {
    //2
    FunctionService functionService;

    public FunctionService getFunctionService() {
        return functionService;
    }

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String SayHello(String word){
        return functionService.sayHello(word);
    }

}
