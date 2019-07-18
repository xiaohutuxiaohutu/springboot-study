package highlevel.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 23948
 * 计划任务执行类
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("5秒执行一次：" + format.format(new Date()));
    }

    /**
     * 每天 11:28执行
     */
    @Scheduled(cron = "0 59 16 ? * *")
    public void fixTimeExecution() {
        System.out.println("在指定事件执行：" + format.format(new Date()));
    }
}
