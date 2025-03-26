package cn.edu.hbsi.utils;

import cn.edu.hbsi.domain.Bean3;

public class MyBean3Factory
{
    public Bean3 createBean(){
        System.out.println("创建Bean3");
        return new Bean3();
    }
}
