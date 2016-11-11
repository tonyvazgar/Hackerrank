import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void cortar(int n, int[] a){
        Arrays.sort(a);
        int min = a[0];
        int x = 0;
        System.out.println(n);
        for(int i = 0; i < n - 1 ; i++ ){
            //System.out.println(n);
            if(a[i] != a[i+1]){
                System.out.println(n - (i + 1));
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        cortar(n, arr);
    }
}
