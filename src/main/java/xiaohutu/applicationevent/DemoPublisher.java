package xiaohutu.applicationevent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author 23948
 * 注入ApplicaitonContext，使用它的的publishEvent方法来发布
 *
 */
@Component
public class DemoPublisher {

    private ApplicationContext applicationContext;

    public void publish(String msg){
        applicationContext.publishEvent(new DemoEvent(this,msg));
    }

    /**
     * 通过构造方法注入类属性
     *
     * @param applicationContext
     */
    @Autowired
    public DemoPublisher(@Nullable ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    /**
     * 通过set方法注入属性
     * 通过JDK1.8
     * @param context
     */
    /*@Autowired
    public void setApplicationContext(Optional<ApplicationContext> context) {
        context.ifPresent(s->this.applicationContext=s);
    }*/
}
