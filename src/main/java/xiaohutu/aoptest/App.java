package xiaohutu.aoptest;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import xiaohutu.di_anno_test.DiConfig;
import xiaohutu.di_anno_test.UserFuncService;

/**
 * 测试springDI依赖注入两种方式@Auwired
 * 测试springDI依赖注入两种方式@Auwired
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext content = new AnnotationConfigApplicationContext(DiConfig.class);
        DemoAnnotationService bean = content.getBean(DemoAnnotationService.class);
        bean.add();
        DemoMethodService bean1 = content.getBean(DemoMethodService.class);
        bean1.add();
        content.close();
    }
}
