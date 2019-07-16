package xiaohutu.aoptest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试springDI依赖注入两种方式@Auwired
 * 测试springDI依赖注入两种方式@Auwired
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext content = new AnnotationConfigApplicationContext(AopConfig.class);

        DemoMethodService bean1 = content.getBean(DemoMethodService.class);
        DemoAnnotationService bean2 = content.getBean(DemoAnnotationService.class);
        bean1.add();
        bean2.add();
        content.close();
    }
}
