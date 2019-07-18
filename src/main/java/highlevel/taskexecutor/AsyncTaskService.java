package highlevel.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

/**
 * @author 23948
 * 任务执行类
 */
@Service
public class AsyncTaskService {
    /**
     * @param integer
     */
    @Async
    public void executeAsyncTask(Integer integer) {
        System.out.println(integer+"-执行异步任务：" + integer);

    }

    @Async
    public void executeAsyncTaskPlus(Integer i) {

        System.out.println(i+"-执行异步任务plus：" + (i + 1));

    }
    @Async
    public Future<Long> getSystemTime(Integer i){
        long l = System.currentTimeMillis();
        return new AsyncResult<>(l);
    }
}
