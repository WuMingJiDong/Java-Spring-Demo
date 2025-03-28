package cn.edu.hbsi.domain;

//切面类，包含多个通知（增强）的方法
public class MyAspect
{
    public void check_Permissions(){
        System.out.println("模拟检查权限...");
    }

    public void log(){
        System.out.println("模拟日志记录...");
    }
}
