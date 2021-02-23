package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        // 1
        Scanner in = new Scanner(System.in);
        /*System.out.print("Input the first number: ");
        int x = in.nextInt();
        System.out.print("Input the second number: ");
        int y = in.nextInt();
        System.out.print("Input the third number: ");
        int z = in.nextInt();
        small(x,y,z);*/

        // 2
        /*Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int x = in.nextInt();
        System.out.print("Input the second number: ");
        int y = in.nextInt();
        System.out.print("Input the third number: ");
        int z = in.nextInt();
        average(x,y,z);*/

        // 3
        /*System.out.print("Input  a year: ");
        int y = in.nextInt();
        leapYear(y);*/

        // 4
        /*System.out.println("Input the string: ");
        String s = in.nextLine();
        vowels(s);*/

        // 5
        System.out.print("Input the number of sides: ");
        int x = in.nextInt();
        System.out.print("Input the side: ");
        double y = in.nextDouble();
        pentagon(x,y);
    }

    // method 1
    public static void small(int a, int b, int c){
        if((a < b) && (a < c))
            System.out.println("the smallest value is "+a);
        else if((b < a) && (b < c))
            System.out.println("the smallest value is "+b);
        else if((c < a) && (c < b))
            System.out.println("the smallest value is "+c);
    }

    // method 2
    public static void average(int q, int w, int e){
        float sum = q + w + e;
        double avg;
        avg = sum / 3;
        System.out.println("The average value is "+ avg);
    }

    // method 3
    private static void leapYear(int y) {
        System.out.println(y % 4 == 0 && y / 100 != 0);
    }

    // method 4
    private static void vowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' ||
                    s.charAt(i) == 'u' || s.charAt(i) == 'i' || s.charAt(i) == 'o' )
                count++;
        }
        System.out.println("Number of words in the string: " + count);
    }

    // method 5
    private static void pentagon(int x, double y) {
        System.out.println("The area of the pentagon is: "
                +(x * y * y) / (4 * Math.tan(Math.PI / x)));
    }
}
