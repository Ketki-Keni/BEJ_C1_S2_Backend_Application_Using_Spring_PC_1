package com.niit.bejp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Product product = applicationContext.getBean("product1", Product.class);
        System.out.println(product);
        Product product1 = applicationContext.getBean("product2", Product.class);
        System.out.println(product1);
    }
}
