import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int sumPrim = 0;
    static int sumSec = 0;
    static int difference = 0;
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        
        //Llena la matriz con los datos que se insertan
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        
        //Hacer la suma de la diagonal primaria "\"
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(i == j){
                    //System.out.println(a[i][j]);
                    sumPrim = sumPrim + a[i][j];
                }
            }
        }
        //System.out.println(sumPrim);
                    
        
        //Hacer la suma de la diagonal secondaria "/"
        for (int i = n-1; i >= 0 ; i--){
            for (int j = 0; j < n; j++){
                if ( n-1-i == j ){
                    //System.out.println(a[i][j]);
                    sumSec = sumSec + a[i][j];
                }
            }
        }
        
        //Imprime la diferencia
        difference = Math.abs(sumPrim - sumSec);
        System.out.println(difference);
                    
    }
}
