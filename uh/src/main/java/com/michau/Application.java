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
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        HelloWorld helloBean = context.getBean("gucio", HelloWorld.class);
//        System.out.print("from xml --> ");
//        helloBean.sayHello();

        // wywołanie przez configuration class
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(WarmUpConfiguration.class);
        HelloWorld helloWorldBean = applicationContext.getBean("helloBean", HelloWorld.class);
        System.out.print("from configuration class --> ");
        helloWorldBean.sayHello();


        // wywołanie po skanowaniu componentów
        applicationContext.scan("com.michau");

        HelloWorld helloBean = applicationContext.getBean("helloBean", HelloWorld.class);
        helloBean.sayHello();

        HelloWorld helloWorld = applicationContext.getBean("helloWorld", HelloWorld.class);
        helloWorld.sayHello();
        System.out.println("");
        System.out.print("porównanie helloWorld z helloBean --> ");
        System.out.println(helloBean == helloWorld);

        HelloWorld helloBean2 = applicationContext.getBean("helloBean", HelloWorld.class);
        HelloWorld helloWorld2 = applicationContext.getBean("helloWorld", HelloWorld.class);

        System.out.print("porównanie helloBean z helloBean --> ");
        System.out.println(helloBean == helloBean2);
        System.out.print("porównanie helloWrold z helloWrold --> ");
        System.out.println(helloWorld == helloWorld2);
    }

}
