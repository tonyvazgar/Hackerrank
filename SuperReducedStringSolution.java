import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static String cortar(String s){
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){ 
                s = s.substring(0,i-1) + s.substring(i+1);
                i = 0;
            }
        }
        return s;
    }
    public static String tiene(String pal){
        String nada = "Empty String";
        String si = pal;
        if(pal.isEmpty() == true){
            return nada; 
        }else{
            return pal;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ori = input.nextLine();
        String b = cortar(ori);
        System.out.println(tiene(b));
    }
}
