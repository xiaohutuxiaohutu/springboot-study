package highlevel.springaware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowireMain {
    public static void main(String[] args){
        for(String arg:args){
            System.out.println(arg);
        }
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutowireConfig.class);
        AwareService bean = context.getBean(AwareService.class);
        bean.outputResult();
        context.close();
    }
}
