package com.company.spring5.testDemo;

import com.company.spring5.autowire.Emp;
import com.company.spring5.bean.Orders;
import com.company.spring5.collectiontype.Book;
import com.company.spring5.collectiontype.Courses;
import com.company.spring5.collectiontype.Stu;
import com.company.spring5.factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5Demo{

    @Test
    public void testCollection(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();


    }

    @Test
    public void testCollection2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
        //单实例对象
        System.out.println(book2);
        System.out.println(book1);
        book1.test();
    }

    @Test
    public void testCollection3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Courses courses = context.getBean("myBean", Courses.class);
        System.out.println(courses);
    }

    @Test
    public void testCollection4(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步，创建对象的实例");

        context.close();

    }

    @Test
    public void test4(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.test();

    }
}
