package highlevel.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.Future;

public class AsyncMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService bean = context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 5; i++) {
            Future<Long> systemTime = bean.getSystemTime(i);
            if(systemTime.isDone()){
                try{
                    Long aLong = systemTime.get();
                    System.out.println("along:"+aLong);
                }catch (Exception e){

                }

            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("I:" + i);
            bean.executeAsyncTask(i);
            bean.executeAsyncTaskPlus(i);
        }


        context.close();
    }
}
