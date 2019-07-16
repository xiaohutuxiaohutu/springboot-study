package xiaohutu.profile;

import lombok.Data;

/**
 * @author 23948
 */
@Data
public class DemoBean {
    private String content;
    public DemoBean(String content){
        super();
        this.content=content;
    }
}
