package BaseConversion;
import java.io.*;
import java.util.*;


/*
    => Decimal to Any base,
Input:
57
2
Output:
111001

Input: 
16
16
Output:
10
*/

public class Decimal2Any {
    
        public static void main(String[] args) throws Exception {
            // pass the path to the file as a parameter
            File file = new File("assets/input.txt");
            Scanner sc = new Scanner(file);
            
            int num = Integer.parseInt(sc.nextLine());
            int base = Integer.parseInt(sc.nextLine());
            System.out.println(getNumber(num,base));
            
            sc.close();
        }

        public static long getNumber(int n,int base){
            long num = 0;
            int dec = 10, pow = 1;
            while(n != 0){
                num += (n%base) * pow;
                n/=base;
                pow *= dec;
            }

            return num;
        }
    
}
