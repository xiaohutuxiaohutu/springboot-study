package xiaohutu.singleton;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletonService singletonService = context.getBean(DemoSingletonService.class);
        DemoSingletonService bean = context.getBean(DemoSingletonService.class);

        DemoPrototypeService bean1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService bean2 = context.getBean(DemoPrototypeService.class);
        System.out.println("singletonService==bean:"+singletonService.equals(bean));
        System.out.println("bean1!==bean2:"+bean1.equals(bean2));


    }
}
