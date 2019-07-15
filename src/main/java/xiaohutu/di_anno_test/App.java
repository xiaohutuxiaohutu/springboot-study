package xiaohutu.di_anno_test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试springDI依赖注入两种方式@Auwired
 * 测试springDI依赖注入两种方式@Auwired
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext content = new AnnotationConfigApplicationContext(DiConfig.class);
        UserFuncService bean = content.getBean(UserFuncService.class);
        System.out.println(bean.hello());
        content.close();
    }
}
