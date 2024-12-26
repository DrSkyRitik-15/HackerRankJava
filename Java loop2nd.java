
We use the integers a. b. and n to create the following æries:
(a +2^0 • b), (a +2^0.b+2^1 • .b+2^1 . b + ...+2^n-1.b)
You are given q queries in the form Of a. b. and n. For each query. print the series
to the given a, b, and n values as a single line of space-separated
integers.
The first line contains an integer q denoting the number of queries.
Each line (i) b of the  subsequent lines contains three space-separated integers describing the respective n and  values for that query.

Output Format
For each query. print the corresponding series on a new line. Each seriæ must be
in order as a single line Of n space-separated integers.


Solution=====================================

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
                  int sum = a; // Initialize sum with 'a'
        for (int x = 0; x < n; x++) {
            sum += (Math.pow(2, x) * b); // Add the term for the current iteration
            System.out.print(sum + " "); // Print the current sum
        }
        System.out.println(); // Move to the next line after one test case
    }
    in.close(); // Close the scanner
}
        }
     
