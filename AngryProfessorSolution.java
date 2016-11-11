import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();   //El numero de casos
        
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();   //numero de estudiantes de la clase
            int k = in.nextInt();   //limite de cancelacion
            int[] a = new int[n];   //Tiempos de llegada de los alumnos
            int cont = 0;
            
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();  //llena los tiempos de llegada
                if(a[a_i] <= 0){    //Si es mayor a 0, llegó tarde y no se cuenta
                    cont++;
                }
            }
            if(cont < k){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
