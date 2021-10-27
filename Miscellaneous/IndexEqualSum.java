import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

/*

Given an integer array, find an index that divides it into two non-empty contiguous subarrays having an equal sum.

Input : [-1, 6, 3, 1, -2, 3, 3]
Output: 2
Explanation: The element 3 at index 2 divides the array into two non-empty subarrays `[-1, 6]` and `[1, -2, 3, 3]` having the same sum.

• The solution should return -1 if no partition is possible.

Input : [6, -5, 2, -4, 1]
Output: -1
Explanation: No equal sum partition possible.

• In case multiple partitions is possible, return the index of the first partition.

Input : [-1, -2, 2, -3]
Output: 1
Explanation: The index 1 and 2 divides the array into two equal sum subarrays. The solution should return index 1.

Input : [4, 2, -3, 4, -1, 0, 4]
Output: 1
Explanation: The index 1 and 3 divides the array into two equal sum subarrays. The solution should return index 1.

*/


public class IndexEqualSum {
    
        public static void main(String[] args) throws Exception {
            // pass the path to the file as a parameter
            File file = new File("assets/input.txt");
            Scanner sc = new Scanner(file);
            
            String[] str = sc.nextLine().split(" ");
            int i=0, arr[] = new int[str.length];            
            for(String s:str)
                arr[i++] = Integer.parseInt(s);
            
            System.out.println(getIndex(arr));

            sc.close();
        }

        public static int getIndex(int[] arr){
            if(arr.length == 0)
                return -1;
            int total = IntStream.of(arr).sum();
            int lftsum = arr[0];
            for(int i=1;i<arr.length;i++){
                if(lftsum == (total - (arr[i]+lftsum)))
                    return i;
                lftsum += arr[i];
            }
            return -1;
        }
        
}
