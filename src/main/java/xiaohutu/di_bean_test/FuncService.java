package xiaohutu.di_bean_test;

/**
 * 注入两种方式：1 @Service 2 @Bean
 * 通过@Beean注入
 */
public class FuncService {
    public String sayHello(){
        System.out.println("hello springboot");
        return "springboot;";
    }
    public String sayInput(String str){
        return "hello bean "+str;
    }
}
