package cn.edu.hbsi.domain;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class XmlAdvice
{
    //切面类，包含通知/增强
    //前置通知

    /**
     *
     * @param joinPoint 封装了切入点的相关信息
     */
    public void before(JoinPoint joinPoint){
        System.out.println("这是前置通知");
        System.out.println("目标类是：" + joinPoint.getTarget());
        System.out.println("目标方法是：" + joinPoint.getSignature().getName());
    }

    //返回通知
    public void afterReturning(){
        System.out.println("这是返回通知，当目标方法成功执行后，才能增强，如果有异常，不执行");
    }

    /**
     *
     * @param point 封装了切入点的相关信息
     * @return 返回Object对象
     */
    //环绕通知
    public Object around(ProceedingJoinPoint point){
        System.out.println("这是环绕之前的部分");
        //执行目标方法
        Object obj = null;
        try {
            obj = point.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        System.out.println("这是环绕通知之后的部分");
        return obj;
    }

    //异常通知
    public void afterException(){
        System.out.println("异常通知");
    }

    //后置通知
    public void after(){
        System.out.println("这是后置通知，有异常也执行");
    }
}
