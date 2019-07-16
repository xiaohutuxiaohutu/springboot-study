package xiaohutu.aoptest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author 23948
 * 切面
 * @Aspect--声明一个切面
 */
@Aspect
@Component
public class LogAspect {
    /**
     * @Pointcut---切入点
     */
    @Pointcut("@annotation(xiaohutu.aoptest.Action)")
    public void annotationPointCut() {
    }

    /**
     * @param joinPoint
     * @After---声明一个建言，并使用@PointCut定义的切点 通过反射获得注解上的属性
     */
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Action annotation = method.getAnnotation(Action.class);
        System.out.println("注解式拦截：" + annotation.name());
    }

    /**
     * execution(* project.mybatis.service.*.*(..))
     * 切入点表达式的使用规则：
     * 1、execution(): 表达式主体。
     * 2、第一个*号：表示返回类型，*号表示所有的类型。
     * 3、包名：表示需要拦截的包名，后面的两个句点表示当前包和当前包的所有子包，com.sample.service.impl包、子孙包下所有类的方法。
     * 4、第二个*号：表示类名，*号表示所有的类。
     * 5、*(..):最后这个星号表示方法名，*号表示所有的方法，后面括弧里面表示方法的参数，两个句点表示任何参数。
     *
     * @param joinPoint
     * @Before---声明一个建言，此建言直接使用拦截规则作为参数
     */
    @Before("execution(* xiaohutu.aoptest.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则拦截：" + method.getName());
    }


}
