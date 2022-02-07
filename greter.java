package com.Ajay;

import java.util.Scanner;

public class greter {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        int no1 =x.nextInt();
        int  no2= y.nextInt();
        if(no1>no2){
            System.out.println(" gretter no is" +  no1);
            System.out.println("smoller no is" +  no2);
        }else if(no1<no2){
            System.out.println("greter no is" + no2);
            System.out.println("smoller no is" + no1);
        }else{
            System.out.println("no is equal");
        }
    }
}
