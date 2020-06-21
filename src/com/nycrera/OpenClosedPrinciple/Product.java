package com.nycrera.OpenClosedPrinciple;

/**
 * Created by Alperen Asa
 * Date: 21.06.2020
 * Time: 14:18
 * Project Name: Design Patterns in Java
 */

public class Product {

    public String name;
    public Color color;
    public Size size;

    public Product(String name, Color color, Size size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }
}
