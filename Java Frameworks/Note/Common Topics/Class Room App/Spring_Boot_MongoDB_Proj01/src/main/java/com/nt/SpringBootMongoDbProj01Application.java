package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.entity.Product;
import com.nt.service.IProductService;

@SpringBootApplication
public class SpringBootMongoDbProj01Application {

    public static void main(String[] args) {
        try (ConfigurableApplicationContext ctx =
                     SpringApplication.run(SpringBootMongoDbProj01Application.class, args)) {

            // Get Service Bean
            IProductService bean = ctx.getBean(IProductService.class);

            // For one product insert
            // Product prod = new Product("Table", 45000.0, 10.0);
            Product prod = new Product("Table", 45000.0, 10.0, "A gaming table.");
            // String product = bean.saveProduct(prod);
            // System.out.println(product);

            // For multiple products insert
            // List<Product> products = Arrays.asList(
            //     new Product("Table", 45000.0, 10.0, "A gaming table."),
            //     new Product("Chair", 15000.0, 5.0, "An ergonomic office chair."),
            //     new Product("Laptop", 75000.0, 15.0, "High-performance gaming laptop."),
            //     new Product("Headphones", 2500.0, 20.0, "Noise-cancelling headphones."),
            //     new Product("Monitor", 18000.0, 12.0, "4K Ultra HD monitor."),
            //     new Product("Keyboard", 4500.0, 8.0, "Mechanical gaming keyboard."),
            //     new Product("Mouse", 2000.0, 10.0, "Wireless gaming mouse."),
            //     new Product("Smartphone", 65000.0, 10.0, "Flagship Android smartphone."),
            //     new Product("Backpack", 3500.0, 5.0, "Laptop-friendly travel backpack."),
            //     new Product("Smartwatch", 12000.0, 7.0, "Waterproof fitness smartwatch.")
            // );
            // List<Product> savedProducts = bean.saveProduct(products);
            // savedProducts.forEach(x -> System.out.println(x.getId()));

            // For Product1
            // Product1 p1 = new Product1("Table", 45000.0, 10.0, "A gaming table.");
            // String prod1 = bean.saveProduct(p1);
            // System.out.println(prod1);

            // For Product2
            // Product2 p2 = new Product2("Table", 45000.0, 10.0, "A gaming table.");
            // String prod2 = bean.saveProduct(p2);
            // System.out.println(prod2);

            // Fetch all
            // bean.findAll().forEach(System.out::println);

            // Update product
            // String updateProduct = bean.updateProduct("689df52590e311bb115714f6", 33333333);
            // System.out.println(updateProduct);

            // Sorted fetch
            List<Product> sortedProducts = bean.findInSortBy(prod, true, "name");
            sortedProducts.forEach(System.out::println);

            // Delete product
            // String deleteProduct = bean.deleteProduct("7539");
            // System.out.println(deleteProduct);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
