package com.michau;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Application {
    public static void main(String[] args) {
//        // rejestracja i wywołanie przez dodanie do contextu
//        GenericApplicationContext applicationContext=new GenericApplicationContext();
//        applicationContext.registerBean("helloBean",HelloWorld.class);
//        applicationContext.refresh();
//        HelloWorld bean=applicationContext.getBean("helloBean",HelloWorld.class);
//        System.out.print("from context --> ");
//        bean.sayHello();


        // wywołanie przez xml-a
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld helloBean = context.getBean("gucio", HelloWorld.class);
        System.out.print("from xml --> ");
        helloBean.sayHello();

        // wywołanie przez configuration class
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(WarmUpConfiguration.class);
        HelloWorld helloWorldBean = applicationContext.getBean("helloBean", HelloWorld.class);
        System.out.print("from configuration class --> ");
        helloWorldBean.sayHello();


        applicationContext.scan("com.michau");

        

    }

}
