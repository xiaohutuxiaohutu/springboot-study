package xiaohutu.springel;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.util.Properties;


@Configuration
@ComponentScan("xiaohutu.springel")
@PropertySource(value = "classpath:xiaohutu/springel/test.properties",ignoreResourceNotFound=false,
encoding = "UTF-8", name="test.properties")
public class ElConfig {
    @Value("i love y")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;
    @Value("#{T(java.lang.Math).random()*100.0}")
    private double randomNumber;
    @Value("#{demoService.another}")
    private String fromAnother;
    @Value("classpath:xiaohutu/springel/test.txt")
    private Resource testFile;
    @Value("http://www.baidu.com")
    private Resource testUrl;
    @Value("${book.name}")
    private String bookName;
    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource() {
        try {
            //获取系统配置
            Properties properties = System.getProperties();
            System.out.println("user.name:"+properties.get("user.name"));

            System.out.println("normal:"+normal);
            System.out.println("osName："+osName);
            System.out.println("fromAnother:"+fromAnother);
            System.out.println("testFile:"+IOUtils.toString(testFile.getInputStream()));
            System.out.println("testUrl:"+IOUtils.toString(testUrl.getInputStream(), "utf-8"));
            System.out.println("bookName:"+bookName);
            System.out.println("environment.getProperty(\"book.author\"):"+environment.getProperty("book.author"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
