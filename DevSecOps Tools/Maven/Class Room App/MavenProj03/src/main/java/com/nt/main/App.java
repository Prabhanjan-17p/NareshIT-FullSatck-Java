package com.nt.main;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args)throws Exception {
        System.out.println("Hello World!");
        Class clazz=Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("driver obj hashcode::"+clazz.getName());
    }
}
