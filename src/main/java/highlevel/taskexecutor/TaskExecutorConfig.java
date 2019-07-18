package highlevel.taskexecutor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * @author 23948
 * 配置类
 * @EnableAsync 开启异步
 */
@Configuration
@ComponentScan("highlevel.taskexecutor")
@EnableAsync
public class TaskExecutorConfig implements AsyncConfigurer{//implements AsyncConfigurer
    /**
     * 返回一个ThreadPoolTaskExecutor，这样我们就获得了一个基于线程池 TaskExecutor
     *
     * @return Executor
     */
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(30);
        taskExecutor.setMaxPoolSize(50);
        taskExecutor.setQueueCapacity(50);
        taskExecutor.initialize();
        return taskExecutor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
