package com.gupao.dubbo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("dubbo-client.xml");
        IGpHello iGpHello =  (IGpHello)context.getBean("gpHelloService");
        System.out.println( iGpHello.sayHello("cyy") );
    }
}
