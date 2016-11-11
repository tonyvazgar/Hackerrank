import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();   //Tamaño de arreglo
        int k = in.nextInt();   //Veces que se rotará el arreglo
        int q = in.nextInt();   //Numero de Queries
        int[] a = new int[n];   //Tamaño(n) del arreglo
        int ult = a.length-1;   //an-1
        int pen = a.length-2;   //an-2
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        for(int x = 1; x <= k; x++){
			int aux = a[ult];
			for (int i = pen; i >= 0; i--){
				a[i + 1] = a[i];
			}
			a[0] = aux;
		}
        for(int i = 0; i < q; i++){
            int s = in.nextInt();
            System.out.println(a[s]);
        }
    }
}
