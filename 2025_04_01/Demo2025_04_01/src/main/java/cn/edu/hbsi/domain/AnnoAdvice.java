package cn.edu.hbsi.domain;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("annoAdvice")
@Aspect("AnnoAdvice")
public class AnnoAdvice
{
    //切入点
    @Pointcut("execution(* cn.edu.hbsi.dao.Impl.UserDaoImpl.*(..))")
    public void pointcut(){}

    //前置通知
    @Before("pointcut()")
    public void before(JoinPoint joinPoint){
        System.out.println("这是前置通知");
    }

    //返回通知
    @AfterReturning("pointcut()")
    public void afterReturn(){
        System.out.println("这是返回通知");
    }

    //环绕通知
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint point){
        //调用目标方法
        Object obj = null;
        try {
            obj = point.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }

        return obj;
    }

    //异常通知
    @AfterThrowing("pointcut()")
    public void afterException(){
        System.out.println("异常通知");
    }

    //后置通知
    @After("pointcut()")
    public void after(){
        System.out.println("后置通知");
    }
}