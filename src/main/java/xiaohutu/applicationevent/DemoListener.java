package xiaohutu.applicationevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author 23948
 * 事件监听器
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    @Override
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();
        System.out.println("bean-demolistener 接收到了 demo-publisher发布的信息："
        +msg);
    }
}
