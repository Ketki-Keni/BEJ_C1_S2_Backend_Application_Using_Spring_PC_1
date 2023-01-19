/*
 * Author : Ketki Keni
 * Date : 19-01-2023
 * Created with : IntelliJ IDEA Community Edition
 */

package com.niit.bejp;

import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean("product1")
    public Product getProduct1(){
        return new Product(101,"Apple Airpods","Apple AirPods (2nd Generation) Wireless Earbuds with Lightning Charging Case Included",4);
    }

    @Bean("product2")
    public Product getProduct2(){
        return new Product(101,"Redragon Gaming Mouse","Wired Gaming Mouse with RGB Backlit",4);
    }
}
