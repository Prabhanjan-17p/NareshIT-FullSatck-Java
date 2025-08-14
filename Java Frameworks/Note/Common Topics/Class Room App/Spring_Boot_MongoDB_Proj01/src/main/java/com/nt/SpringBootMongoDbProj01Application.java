package com.nt;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.entity.Product;
import com.nt.service.IProductService;

@SpringBootApplication
public class SpringBootMongoDbProj01Application {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootMongoDbProj01Application.class, args);) {
			//For One Data Insert
//			IProductService bean = ctx.getBean(IProductService.class);
////			Product prod = new Product("Table", 45000.0, 10.0);
//			Product prod = new Product("Table", 45000.0, 10.0,"A gaming table.");
//			String product = bean.saveProduct(prod);
//			System.out.println(product);
			
			//For All data insert 
			IProductService bean = ctx.getBean(IProductService.class);
			List<Product> products = Arrays.asList(
			        new Product("Table", 45000.0, 10.0, "A gaming table."),
			        new Product("Chair", 15000.0, 5.0, "An ergonomic office chair."),
			        new Product("Laptop", 75000.0, 15.0, "High-performance gaming laptop."),
			        new Product("Headphones", 2500.0, 20.0, "Noise-cancelling headphones."),
			        new Product("Monitor", 18000.0, 12.0, "4K Ultra HD monitor."),
			        new Product("Keyboard", 4500.0, 8.0, "Mechanical gaming keyboard."),
			        new Product("Mouse", 2000.0, 10.0, "Wireless gaming mouse."),
			        new Product("Smartphone", 65000.0, 10.0, "Flagship Android smartphone."),
			        new Product("Backpack", 3500.0, 5.0, "Laptop-friendly travel backpack."),
			        new Product("Smartwatch", 12000.0, 7.0, "Waterproof fitness smartwatch.")
			    );
			List<Product> saveProduct = bean.saveProduct(products);
			saveProduct.stream().forEach((x)-> System.out.println(saveProduct.get(0).getId()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
