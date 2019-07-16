package xiaohutu.aoptest;

import java.lang.annotation.*;

/**
 * @author 23948
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Action {
    String name();
}
