// import java.io.*;
import java.util.*;

public class MaxMinLCM {
    
        public static void main(String[] args) throws Exception {                        
            Scanner sc = new Scanner(System.in);
            
            int t = sc.nextInt();
            while(t-- != 0){
                int a = sc.nextInt(), b = sc.nextInt();
                findLCM(a,b);
            }

            sc.close();
        }
        
        public static void findLCM(int a,int b){
            long minlcm = Long.MAX_VALUE, maxlcm = Long.MIN_VALUE;
            for(int x=a+1;x<= (2*a); x++){
                minlcm = Math.min(minlcm,lcm(a,x));
            }
            maxlcm = a*b;
            maxlcm = (maxlcm - 1) * maxlcm;
            System.out.println(minlcm+" "+maxlcm);
        }

        public static long lcm(int a, int b){
            long res = a*b;
            res = res / hcf(a,b);
            return res;
        }

        public static long hcf(int a,int b){
            if(b%a == 0) return a;
            return hcf(a,b%a);
        }
}
