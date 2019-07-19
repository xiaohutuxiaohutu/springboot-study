package highlevel.annotation;

import org.springframework.stereotype.Service;

/**
 * @author 23948
 */
@Service
public class DemoService {
    public void outputResult(){
        System.out.println("从组合注解配置获得bean");
    }
}
