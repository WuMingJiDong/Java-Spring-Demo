package cn.edu.hbsi.domain;

public class MyBean2Factory
{
    //静态方法
    public static Bean2 creatBean(){
        System.out.println("工厂的静态方法");
        return new Bean2();
    }
}
