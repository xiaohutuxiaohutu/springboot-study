package xiaohutu.beandestroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author 23948
 * 使用JSR250形式的bean
 * @PostConstruct---在构造函数执行完之后执行
 * @PreDestroy---在Bean销毁之前执行
 */
public class JSR250WayService {
    @PostConstruct
    public void init() {
        System.out.println("jsr250-init-method");

    }

    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("jsr250-destory-method");
    }
}
