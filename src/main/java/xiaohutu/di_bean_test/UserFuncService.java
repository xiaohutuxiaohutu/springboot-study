package xiaohutu.di_bean_test;


public class UserFuncService {

    FuncService funcService;
    public void setFuncService(FuncService funcService) {
        this.funcService = funcService;
    }

    public String hello() {
        return funcService.sayHello();
    }

    public String hello(String s) {
        return funcService.sayInput(s);
    }

}
