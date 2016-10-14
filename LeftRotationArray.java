import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[(i+n-d)%n] = sc.nextInt();
            
        }
        /*String str="";
        for(int i=0;i<n;i++){
         str+=a[i]+" ";   
        
        }
        System.out.println(str); */
        for(int i=0; i<n;i++) {
            System.out.print(a[i] + " ");
        }
    }
}