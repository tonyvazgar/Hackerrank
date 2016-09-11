package hackerrank;
import java.util.Arrays;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class RunningTimeofAlgorithms {
   public static void insertionSort(int[] arreglo){
        int cont=0;
        int e, x, n = (arreglo.length);
        for(int i=1; i<n;i++){
            e = arreglo[i];
            x = i;
            while(x > 0 && arreglo[x-1] > e){
                swap(arreglo, x , x-1);
                x = x-1;
                cont++;
            }
            arreglo[ x ] = e;
        }
        System.out.println(cont);
    }
    public static void swap(int[] a, int i, int j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
    }
    public static void main(String Args[]){
        /*
        int[] arreglo = new int[5];
        arreglo[0] = 2;
        arreglo[1] = 1;
        arreglo[2] = 3;
        arreglo[3] = 1;
        arreglo[4] = 2;
        System.out.println("El arreglo es: "+Arrays.toString(arreglo));
        insertionSort(arreglo);
        //System.out.println("SORTED: "+Arrays.toString(arreglo));
        */
        Scanner scanner = new Scanner(System.in);
        int elements = scanner.nextInt();
        int[] arreglo = new int [elements];
        for(int i=0; i<elements; i++){
            arreglo[i]=scanner.nextInt();
        }
        //System.out.println(Arrays.toString(arreglo));
        insertionSort(arreglo);
        //System.out.println(Arrays.toString(arreglo));
    }
}