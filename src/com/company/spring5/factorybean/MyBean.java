package com.company.spring5.factorybean;

import com.company.spring5.collectiontype.Courses;
import org.hamcrest.Factory;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<Courses> {

    //定义返回Bean
    @Override
    public Courses getObject() throws Exception {
        Courses courses = new Courses();
        courses.setCname("abc");
        return courses;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
