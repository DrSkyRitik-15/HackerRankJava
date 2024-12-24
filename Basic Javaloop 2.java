import java.util.Scanner;

class Solution{
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            
                  int sum = a; 
        for (int x = 0; x < n; x++) {
            sum += (Math.pow(2, x) * b);
            System.out.print(sum + " "); 
        }
        System.out.println(); 
    }
    sc.close(); 
        }
    }
     