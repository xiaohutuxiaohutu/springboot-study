package xiaohutu.di_anno_test;

//注入两种方式：1 @Service 2 @Bean

import org.springframework.stereotype.Service;

@Service
public class FuncService {
    public String sayHello(){
        System.out.println("hello springboot");
        return "springboot;";
    }
}
