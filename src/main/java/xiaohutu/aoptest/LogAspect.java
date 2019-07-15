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
 *
 */
@Aspect
@Component
public class LogAspect {
    /**
     *  @Pointcut---切入点
     */
    @Pointcut("@annotation(xiaohutu.aoptest.Action)")
    public void annotationPointCut() {
    }

    /**
     * @After---声明一个建言，并使用@PointCut定义的切点
     * 通过反射获得注解上的属性
     * @param joinPoint
     */
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Action annotation = method.getAnnotation(Action.class);
        System.out.println("注解式拦截："+annotation.name());
    }

    /**
     * @Before---声明一个建言，此建言直接使用拦截规则作为参数
     * @param joinPoint
     */
    @Before("execution(xiaohutu.aoptest.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则拦截："+method.getName());
    }


}
