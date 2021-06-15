package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Input a numbers: ");
        System.out.println("X: ");
        int x = in.nextInt();
        System.out.println("A: ");
        int a = in.nextInt();
        System.out.println("C: ");
        int c = in.nextInt();
        System.out.println("B: ");
        int b = in.nextInt();
        int F;
        if (x != 0 && c < 0){
            F = ((-1*a)*x)-c;
            System.out.println("Answer: ");
            System.out.println(F);
        }
        if (c > 0 && x == 0){
            F = (x-a)/(-1*c);
            System.out.println("Answer: ");
            System.out.println(F);
        }
        else {
            F = (b*c)/(c-a);
            System.out.println("Answer: ");
            System.out.println(F);
        }
    }
}
