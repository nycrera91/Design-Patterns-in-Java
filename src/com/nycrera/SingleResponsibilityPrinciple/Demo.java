package com.nycrera.SingleResponsibilityPrinciple;

/**
 * Created by Alperen Asa
 * Date: 20.06.2020
 * Time: 21:54
 * Project Name: Design Patterns in Java
 */

public class Demo {

    public static void main(String[] args) throws Exception {
        Journal journal = new Journal();

        journal.addEntry("I cried today");
        journal.addEntry("I ate a bug");

        System.out.println(journal);

        Persistance persistance = new Persistance();

        String fileName = "SRP";
        persistance.saveToFile(journal, fileName, true);

        // windows!
        Runtime.getRuntime().exec("notepad.exe " + fileName);
    }

}
