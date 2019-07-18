package highlevel.taskscheduler;

import highlevel.taskexecutor.TaskExecutorConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SchedulerMain {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
//        ScheduledTaskService bean = context.getBean(ScheduledTaskService.class);
//        bean.fixTimeExecution();
//        bean.reportCurrentTime();
//        context.close();
    }
}
