import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();   long tam = s.length();  long numdeas = 0;
        long numdeass = 0;
        for(int i=0; i < tam; i++){
            if(s.charAt(i) == 'a'){
                numdeas++;
            }
        }
        long n = in.nextLong();
        long veces = n / tam;
        long m = n % tam;
        for(int i = 0; i < m; i++){
            if(s.charAt(i) == 'a'){
                numdeass++;
            }
        }
        long valor = veces * numdeas + numdeass;
        System.out.println(valor);
    }
}
