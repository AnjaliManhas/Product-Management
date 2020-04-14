package com.company;
import java.io.*;
import java.util.*;
import java.text.*;
import java.lang.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Application {
    static Map<String, User> userStorage = new HashMap<>();
    static Map<String, Product> productStorage = new HashMap<>();
    static TreeMap<String, String> viewProducts = new TreeMap<String, String>();


    public static void main(String[] args) {
        char a=0, b=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("****************Product Store************");
        boolean n = true;
        User user; Product product;
        int choice;
        while (n == true) {
            System.out.println("enter your choice= 1. for sign up  2. for sign in  3. to enter product details  4. to find product details  5. to view all the products");
            choice = scan.nextInt();
            switch (choice) {
                case 1: {
                    UserService userService = new UserService();
                    user = userService.getUserDetails();
                    userStorage.put(user.getPhone_no(), user);
                    break;
                }
                case 2: {
                    UserService userService = new UserService();
                    String mobileNumberToSearch = userService.findUserDetails();
                    User userFromStore = userStorage.get(mobileNumberToSearch);
                    userService.printUserDetails(userFromStore);
                    break;
                }
                case 3: {
                    ProductService productService = new ProductService();
                    product = productService.getProductDetails();
                    productStorage.put(product.getProduct_id(), product);
                    viewProducts.put(product.getProduct_id(), product.getProduct_name());
                    break;
                }
                case 4: {
                    ProductService productService = new ProductService();
                    String productIDToSearch = productService.findProductDetails();
                    Product productFromStore = productStorage.get(productIDToSearch);
                    productService.printProductDetails(productFromStore);
                    break;
                }
                case 5:{
                    System.out.println("The products are:" + viewProducts);
                    System.out.println("do you want to buy any product? Y/N");
                    b=scan.next().charAt(0);
                    if (b == 'Y' || b == 'y')
                    { System.out.println("which product do you want to buy? ");
                        ProductService productService = new ProductService();
                        String productIDToBuy = productService.productIDtoBeBought();
                        Product productFromStore = productStorage.get(productIDToBuy);
                        productService.productBill(productFromStore); }
                    if (b == 'N' || b == 'n')
                    {  break;}
                    break;
                }

                default: {
                    System.out.println("invalid choice");
                    break;
                }

            }
            System.out.println("do you want to continue?");
            a=scan.next().charAt(0);
            if (a == 'Y' || a == 'y')
            { continue;}
            if (a == 'N' || a == 'n')
            {  break;}
        }
    }
}

