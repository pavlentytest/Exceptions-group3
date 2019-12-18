package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File("C:/123/test.txt");
        // Scanner - читаем с файла
        // BufferedReader - читаем
        // PrintWriter - пишем

        try {
            boolean flag = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


        if(1==2) {
            throw new NullPointerException("Null pointer exception!!!");
        }
       // throw new ArrayIndexOutOfBoundsException("Error!!!");

/*
        try {
            Car.dooo();
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            int a = 100;
            int b = 0;
           // int c = a / b;
            int[] f = {1,2,3};
            f[10] = 900;
        } catch (ArithmeticException|ArrayIndexOutOfBoundsException vvv) {
            System.out.println("Что-то случилось 2:" + vvv.toString());
        } finally {
            System.out.println("Что-то закрываем!");
        }

        System.out.println("После...");
*/
	
    }
}
