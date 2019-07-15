package xiaohutu.di_anno_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserFuncService {

    //@Inject
    //@Resource

    @Autowired
    private FuncService funcService;
    public String hello(){
        return funcService.sayHello();
    }

}
