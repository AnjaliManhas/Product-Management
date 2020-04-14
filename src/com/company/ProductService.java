package com.company;
import java.io.*;
import java.util.*;
import java.text.*;
import java.lang.*;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

import static java.lang.System.*;

public class ProductService {
    public Product getProductDetails(){
        Product product= new Product();
        Scanner scanner = new Scanner(in);
        out.println("==============Product Details Input=================");
        out.println("Please enter product name : ");
        String product_name = scanner.nextLine();
        product.setProduct_name(product_name);
        out.println("Please enter product id : ");
        String product_id=scanner.nextLine();
        product.setProduct_id(product_id);
        out.println("Please enter product price : ");
        float price= scanner.nextFloat();
        product.setPrice(price);
        out.println("Please enter product's color : ");
        String color= scanner.nextLine();
        color = scanner.nextLine();
        product.setColor(color);
        return product;
    }
    public String findProductDetails(){
        out.println("Product id to be searched : ");
        Scanner scanner = new Scanner(in);
        String id = scanner.nextLine();
        return id;
    }
    public String productIDtoBeBought(){
        out.println("enter product's ID to be bought : ");
        Scanner scanner = new Scanner(in);
        String id = scanner.nextLine();
        return id;

    }
    public void printProductDetails(Product productFromStore){
        out.println("product searched is : "+productFromStore.getProduct_name());
        out.println(+productFromStore.getPrice());
        out.println(productFromStore.getColor());
    }
    public void productBill(Product productFromStore){
        out.println("**********Product store**********");
        out.println("product's bill is : " +productFromStore.getProduct_name());
        out.println("total amount="+productFromStore.getPrice());
        out.println(productFromStore.getColor());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        out.println("******thank for shopping with us******");
    }
}