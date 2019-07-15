package xiaohutu.di_bean_test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试springDI依赖注入两种方式
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext content = new AnnotationConfigApplicationContext(DiConfig.class);
        FuncService bean1 = content.getBean(FuncService.class);
        bean1.sayHello();
        UserFuncService bean = content.getBean(UserFuncService.class);
        System.out.println(bean.hello("xiaohutu"));
        content.close();
    }
}
