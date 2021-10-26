import java.io.*;
import java.util.*;

/*
5 4 3 7 6 1 9

3 7 9
*/

public class SortedTriplet{
    
        public static void main(String[] args) throws Exception {
            // pass the path to the file as a parameter
            File file = new File("assets/input.txt");
            Scanner sc = new Scanner(file);
            
            String[] str = sc.nextLine().split(" ");
            int[] arr = new int[str.length];
            int i=0;
            for(String s:str){
                arr[i] = Integer.parseInt(s);
                ++i;
            }

            System.out.println(getTriplet(arr));
            
            sc.close();
        }
        
        public static String getTriplet(int[] arr){
            String res = "";
            int n = arr.length;
            if(n<3) return res;
            int minidx = 0, low = -1,mid =-1, i;
            for(i=1;i<n;i++){
                if(arr[i]<=arr[minidx]){
                    minidx = i;
                }else if(mid == -1){
                    low = minidx;
                    mid = i;
                }else if(arr[i] > arr[mid]){
                    break;
                }
            }
            res = "" + arr[low] + " " +arr[mid] + " " + arr[i];
            return res;
        }
}
