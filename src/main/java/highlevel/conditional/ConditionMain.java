package highlevel.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConditionMain {
    public static void main(String[] arg){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService bean = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name")+
                "系统命令："+
                bean.showListCmd());
    }
}
