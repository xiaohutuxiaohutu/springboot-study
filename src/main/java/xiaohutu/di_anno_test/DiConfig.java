package xiaohutu.di_anno_test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("xiaohutu.di_anno_test")
@Configuration
public class DiConfig {
    public FuncService getFuncService(){
        return new FuncService();
    }
}
