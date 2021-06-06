package ex16.base;

/* UCF COP3330 Summer 2021 Assignment 1 Solution
   Copyright 2021 Rachel Schwarz
*/

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your age? ");
        String str1 = input.nextLine();
        int age = Integer.parseInt(str1);

        System.out.println((age >= 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.");
    }
}
