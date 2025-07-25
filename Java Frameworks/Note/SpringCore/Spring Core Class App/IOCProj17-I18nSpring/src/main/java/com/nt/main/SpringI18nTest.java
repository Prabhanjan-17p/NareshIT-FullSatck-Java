package com.nt.main;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;

public class SpringI18nTest {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx=new  AnnotationConfigApplicationContext(AppConfig.class);
				Scanner  sc=new Scanner(System.in);
				){
			System.out.println("Enter  language code ::");
			String lang=sc.next();
			
			System.out.println("Enter  country code ::");
			String country=sc.next();
			
			//create Locale object having lang and country codes
			Locale locale=new Locale(lang,country);
			//get  the messages   by  submitting the keys
			String msg1=ctx.getMessage("wish.message", new Object[] {}, "message1", locale);
			String msg2=ctx.getMessage("goodbye.message", new Object[] {}, "message2", locale);
			String msg3=ctx.getMessage("caring.message", new Object[] {}, "message3", locale);
			String msg4=ctx.getMessage("angry.message", new Object[] {"raja"}, "message4", locale);
			String msg5=ctx.getMessage("sad.message", new Object[] {}, "message5", locale);
			
			System.out.println(msg1+"...."+msg2+"...."+msg3+"...."+msg4+"..."+msg5);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
