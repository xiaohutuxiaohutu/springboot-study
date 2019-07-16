package xiaohutu.beandestroy;

import org.springframework.stereotype.Service;

/**
 * @author 23948
 * 使用@Bean的形式的Bean
 */
public class BeanWayService {
    void init() {
        System.out.println("@Bean-init-method");
    }

    BeanWayService() {
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }

    void destroy() {
        System.out.println("@Bean-destroy-method");
    }
}
