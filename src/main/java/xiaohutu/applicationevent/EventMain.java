package xiaohutu.applicationevent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 23948
 */
public class EventMain {
    
    public static void main(String[] arg){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher bean = context.getBean(DemoPublisher.class);
        bean.publish("helleo applicaiotn event");
        context.close();
    }
}
