package com.nycrera.SingleResponsibilityPrinciple;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Created by Alperen Asa
 * Date: 20.06.2020
 * Time: 21:54
 * Project Name: Design Patterns in Java
 */

public class Persistance {

    public void saveToFile(Journal journal, String fileName, boolean overwrite) throws FileNotFoundException {
        if(overwrite || new File(fileName).exists()) {
            try(PrintStream out = new PrintStream(fileName)) {
                out.println(journal.toString());
            }
        }
    }

}
