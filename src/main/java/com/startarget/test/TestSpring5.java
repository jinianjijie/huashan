package com.startarget.test;

import com.startarget.Book;
import com.startarget.Student;
import com.startarget.User;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {
    @Test
    public void testAdd(){
        //控制反转IOC

        //加载配置文件，加载好配置文件之后创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.testDemo();
    }

    @Test
    public void testOrders(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.testDemo();
    }

    @Test
    public void testStudent(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }

}
