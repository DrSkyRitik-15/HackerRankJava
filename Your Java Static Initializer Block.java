//Your Java Static Initializer Block submission



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    

public static int B;
public static int H;
public static boolean flag;

static{
    flag=true;
    Scanner s= new Scanner(System.in);
    B=s.nextInt();
    H=s.nextInt();

    if (B <= 0 || H <= 0) {
        flag = false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

