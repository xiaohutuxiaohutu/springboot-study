package xiaohutu.aoptest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import xiaohutu.di_anno_test.FuncService;


/**
 * @author 23948
 * @EnableAspectJAutoProxy---开启spring对aspectj的支持
 */
@Configuration
@ComponentScan("xiaohutu.aoptest")
@EnableAspectJAutoProxy
public class AopConfig {

}
