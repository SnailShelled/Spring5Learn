package com.company.spring5.bean;

public class Orders {

    //无参的构造

    public Orders(){
        System.out.println("第一个，执行bean的第一个阶段");
    }

    private String oname;

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步，调用set");
    }

    //创建初始化的方法
    public void initMenth(){
        System.out.println("第三步，执行初始化方法");
    }

    //创建销毁的方法
    public void destroyMenth(){
        System.out.println("第五步，执行销毁方法");
    }

}
