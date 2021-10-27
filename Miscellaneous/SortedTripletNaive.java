import java.io.*;
import java.util.*;

/*

Given an integer array `nums`, efficiently find a sorted triplet such that `nums[i] < nums[j] < nums[k]` where `i < j < k`.

Input : [7, 3, 4, 2, 6]
Output: (3, 4, 6)

• If the input contains several sorted triplets, the solution can return any one of them.

Input : [5, 4, 3, 7, 6, 1, 9]
Output: (5, 7, 9) or (4, 7, 9) or (3, 7, 9) or (5, 6, 9) or (4, 6, 9) or (3, 6, 9)

• If no triplet exists, return null.

Input : [5, 4, 3]
Output: null

*/

public class SortedTripletNaive {
    
        public static void main(String[] args) throws Exception {
            // pass the path to the file as a parameter
            File file = new File("assets/input.txt");
            Scanner sc = new Scanner(file);
            
            String[] str = sc.nextLine().split(" ");
            int arr[] = new int[str.length], i = 0;

            for(String s:str)
                arr[i++] = Integer.parseInt(s);
            
            System.out.println(getTriplet(arr));

            sc.close();
        }
    
        public static String getTriplet(int[] arr){
            String str = "";            
            int n = arr.length;

            if(n>=3){
                int i,j,k;
                for(i=1;i<n;i++){
                    for(j=i-1;j>=0;j--)
                        if(arr[i]>arr[j]){
                            for(k=i+1;k<n;k++)
                                if(arr[i]<arr[k])
                                    str += arr[j] + " " + arr[i] + " " + arr[k] + "\n";
                        }                    
                }
            }

            return str;
        }
}
