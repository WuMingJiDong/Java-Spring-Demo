package cn.edu.hbsi.domain;

import cn.edu.hbsi.dao.UserDao;
import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//生成动态代理对象的类
public class MyProxy implements InvocationHandler, java.lang.reflect.InvocationHandler {
    private UserDao userDao;
    //提供创建代理对象的方法
    public Object createProxy(UserDao userDao){
        this.userDao = userDao;
        //1.获取类加载器
        ClassLoader classLoader = MyAspect.class.getClassLoader();
        //2.获取被代理对象的所有接口
        Class<?>[] interfaces = userDao.getClass().getInterfaces();

        return Proxy.newProxyInstance(classLoader,interfaces,this);
    }

    /**
     *
     * @param proxy the proxy instance that the method was invoked on
     *
     * @param method the {@code Method} instance corresponding to
     * the interface method invoked on the proxy instance.  The declaring
     * class of the {@code Method} object will be the interface that
     * the method was declared in, which may be a superinterface of the
     * proxy interface that the proxy class inherits the method through.
     *
     * @param args an array of objects containing the values of the
     * arguments passed in the method invocation on the proxy instance,
     * or {@code null} if interface method takes no arguments.
     * Arguments of primitive types are wrapped in instances of the
     * appropriate primitive wrapper class, such as
     * {@code java.lang.Integer} or {@code java.lang.Boolean}.
     *
     * @return
     * @throws Throwable
     */

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //创建切面对象
        MyAspect myAspect = new MyAspect();
        //前增强
        myAspect.check_Permissions();
        //目标对象调用方法
        Object obj = method.invoke(userDao,args);
        //后增强
        myAspect.log();
        return obj;
    }
}
