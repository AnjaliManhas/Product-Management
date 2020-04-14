package com.company;
import java.io.*;
import java.util.*;
import java.text.*;
import java.lang.*;

public class Product {
    private String product_name;
    private String product_id;
    private float price;
    private String color;

    public String getProduct_name() { return product_name; }
    public void setProduct_name(String product_name) {this.product_name= product_name;}
    public String getProduct_id() {return product_id;}
    public void setProduct_id(String product_id) {this.product_id= product_id;}
    public float getPrice() {return price;}
    public void setPrice(float price) { this.price= price;}
    public String getColor() { return color;}
    public void setColor(String color) {this.color= color;}
}
