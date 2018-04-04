package ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 使用@EnableAspectJAutoProxy注解开启Spring对AspectJ的支持
 */
@Configuration
@ComponentScan("ch1.aop")
@EnableAspectJAutoProxy//1
public class AopConfig {

}
