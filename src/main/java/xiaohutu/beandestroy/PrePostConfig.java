package xiaohutu.beandestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 23948
 * @Bean(initMethod = "init",destroyMethod = "destroy")
 * 指定init和destroy方法
 */
@Configuration
@ComponentScan("xiaohutu.beandestroy")
public class PrePostConfig {
    @Bean(initMethod = "init",destroyMethod = "destroy")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }
    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}
