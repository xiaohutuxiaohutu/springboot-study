package xiaohutu.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 23948
 * 先将活动的profile设置为prod
 * 后置注册Bean配置类，不然会报Bean未定义的错误
 * 刷新容器
 */
public class ProfileMain {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //错误顺序
        /*DemoBean bean = context.getBean(DemoBean.class);
        System.out.println(bean.getContent());*/

        //正确顺序

        context.getEnvironment().setActiveProfiles("prod");
        context.register(ProfileConfig.class);
        context.refresh();
        DemoBean bean1 = context.getBean(DemoBean.class);
        System.out.println(bean1.getContent());
        context.close();
    }
}
