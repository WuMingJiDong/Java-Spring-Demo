package cn.edu.hbsi.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("Student")
public class Student
{
    @Value("1")
    private Integer id;
    @Value("悸动.")
    private String name;

    public Student() {
    }

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @PostConstruct
    public void init(){
        System.out.println("Bean初始化完成调用init()方法");
    }

    public void init2(){
        System.out.println("Bean初始化完成调用init()2方法");
    }

    @PreDestroy
    public void destory(){
        System.out.println("Bean销毁前调用destory");
    }

    public void destory2(){
        System.out.println("Bean销毁前调用destory2");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
