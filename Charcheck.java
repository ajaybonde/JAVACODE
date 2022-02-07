package com.Ajay;

import java.util.Scanner;

public class Charcheck {
    public static void main(String[] args) {
        Scanner ch = new Scanner(System.in);
        char str =ch.next() .trim() .charAt(0);
        if ( str >'a' && str < 'z')
        {
            System.out.println("case is lower case");
        }else
        {
            System.out.println("case is upper case");
        }
    }
}
