here are strings. Each string's length is no more than characters. There are also queries. 
For each query, you are given a string, and you need to find out how many times this string occurred previously. 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] arr = new String[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.next();
        }
        int q = sc.nextInt();
        String[] que = new String[q];
        for(int l=0;l<q;l++){
            que[l] = sc.next();
        }
        for(int i=0;i<n;i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        for(int l=0;l<q;l++){
            if(map.get(que[l])==null){
                System.out.println("0");
            }else{
                System.out.println(map.get(que[l]));
            }

        }
    }
}