package xiaohutu.di_bean_test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 通过bean 注解注入service
 */
@ComponentScan("xiaohutu.di_bean_test")
@Configuration
public class DiConfig {


    @Bean
    public FuncService getFuncService(){
        return new FuncService();
    }

    @Bean
    public UserFuncService getUserFuncService(){
        UserFuncService userFuncService = new UserFuncService();
        userFuncService.setFuncService(getFuncService());
        return  userFuncService;
    }

}
