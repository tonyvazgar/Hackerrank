import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
    public static int veces(String B, int n){
        int count = 0;
        for(int x = 0; x < n-2; x++){
            if(B.charAt(x) == '0' && B.charAt(x+1) == '1' && B.charAt(x+2) == '0'){
                count++;
                x=x+2;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        System.out.println( veces( B , n ) );
    }
    
}
