package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();

        if(n > 0) {
            String[] name = new String[n];
            for(int i = 0; i < n; i++){
                name[i] = s.nextLine();
            }

            for(String str: name) {
                System.out.println("Hello, " + str);
                //System.out.println();
            }
        } else if (n == 0) {
            System.out.println("Oh, it looks like there is no one here");
        }
        else {
            System.out.println("Seriously? Why so negative?");
        }
    }
}
