package xiaohutu.applicationevent;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

/**
 * @author 23948
 * 自定义事件
 */
@Data
public class DemoEvent extends ApplicationEvent {
    private static final long SERIVALVERSIONUID = 1L;
    private String msg;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }
}
