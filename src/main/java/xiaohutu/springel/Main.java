package xiaohutu.springel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 *测试获取配置
 * @author 23948
 */
public class Main {
    public static void main(String[] args){
       //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ResourceConfig.class);
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig bean = context.getBean(ElConfig.class);
        bean.outputResource();

    }
}
