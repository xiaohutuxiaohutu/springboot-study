package xiaohutu.aoptest;

import org.springframework.stereotype.Service;

/**
 * @author 23948
 * 使用注解被拦截的类
 */
@Service
public class DemoAnnotationService {
    @Action(name="注解拦截add操作")
    public void add(){

    }
}
