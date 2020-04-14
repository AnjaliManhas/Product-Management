package com.company;
import java.io.*;
import java.util.*;
import java.text.*;
import java.lang.*;
import java.util.Scanner;

public class UserService {
    public User getUserDetails() {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.println("==============User Details Input=================");
        System.out.println("Please enter you name : ");
        String name = scanner.nextLine();
        if (name == null || name.isEmpty()) {
            System.out.println("Please enter a valid name");
        }
        user.setName(name);
        System.out.println("enter your address ");
        String address = scanner.nextLine();
        user.setAddress(address);
        System.out.println("enter your city ");
        String city = scanner.nextLine();
        user.setCity(city);
        System.out.println("enter your date of birth ");
        String dob = scanner.nextLine();
        user.setDob(dob);
        System.out.println("enter phone number");
        String phone_no = scanner.nextLine();
        user.setPhone_no(phone_no);
        System.out.println("enter email");
        String emailID = scanner.nextLine();
        user.setEmailId(emailID);

        return user;
    }
    public String findUserDetails() {
        System.out.println("Mobile Number to search : ");
        Scanner scanner = new Scanner(System.in);
        String phone = scanner.nextLine();
        return phone;
    }

    public void printUserDetails(User userFromStore) {
        System.out.println("user searched is : "+userFromStore.getName());
    }
}
