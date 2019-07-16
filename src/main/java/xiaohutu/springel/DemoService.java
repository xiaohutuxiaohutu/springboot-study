package xiaohutu.springel;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author 23948
 */
@Service
@Data
public class DemoService {
    //注入普通字符创

    @Value("其他类的属性")
    private String another;
}
