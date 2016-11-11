import java.io.*;
import java.util.*;

public class Solution {
     /*
     *De acuerdo al pseudocodigo de "Lomuto Partitioning"
     *proporcionado arriba.
     */
    private static int particion(int[] arr, int lo, int hi){
    	  int pivote = arr[hi];
        int i = lo;
        for(int j = lo; j < hi; ++j){
            if(arr[j] < pivote){
                swap(arr, i, j);
                i = i+1;
            }
        }
        swap(arr, i, hi);
        return i;
    }
    
    public static void quickSort(int[] arr, int lo, int hi){
      	if(lo < hi){
            //imprimir(arr);
            int p = particion(arr, lo, hi);
            imprimir(arr);
            quickSort(arr, lo, p-1);
            quickSort(arr, p+1, hi);
        }
    }
    
    private static void imprimir(int[] ar){
        for(int n = 0; n < ar.length; n++ ){
            System.out.print(ar[n] +" ");
        }
        System.out.println();
    }
    
    private static void swap(int[] arr, int x, int y){
    	  int temp = arr[x];
    	  arr[x] = arr[y];
    	  arr[y] = temp;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named          Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];
        int x = n-1;
        
        for(int i = 0; i < n; i++){
            ar[i] = scan.nextInt();
        }
        
        quickSort(ar, 0, x);
    }
}
