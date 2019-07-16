package xiaohutu.beandestroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrePostMain {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService bean = context.getBean(BeanWayService.class);
        JSR250WayService bean1 = context.getBean(JSR250WayService.class);
        context.close();
    }
}
