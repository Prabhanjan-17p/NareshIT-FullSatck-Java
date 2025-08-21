package com.nt;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring_Boot_MongoDB_Custome_Method_Proj2 {

    public static void main(String[] args) {
        try (ConfigurableApplicationContext ctx =
                     SpringApplication.run(Spring_Boot_MongoDB_Custome_Method_Proj2.class, args)) {


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
