Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):

A byte is an 8-bit signed integer.
A short is a 16-bit signed integer.
An int is a 32-bit signed integer.
A long is a 64-bit signed integer.

First solution =================================================


import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        long t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768  && x<=32768 )System.out.println("* short");
                if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
                if(x>=-9223372036854775808l && x<=9223372036854775807l)System.out.println("* long");
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}

Second Solution=================================

for (int i = 0; i < t; i++) {
        try {
            long x = sc.nextLong();s
            System.out.println(x + " can be fitted in:");

            // Check ranges for each type
            if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                System.out.println("* byte");
            }
            if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                System.out.println("* short");
            }
            if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                System.out.println("* int");
            }
            if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                System.out.println("* long");
            }
        } catch (Exception e) {
            // Handle case where input can't be stored in long
            System.out.println(sc.next() + " can't be fitted anywhere.");



