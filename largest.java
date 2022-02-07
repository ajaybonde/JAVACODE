package com.Ajay;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the three no");
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();
        int max = a;
        if(b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println(max + "is largest value");
        }
    }


