import java.util.*;

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


public class IndexEqualSumNaive {
    
        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            
            String str[] = sc.nextLine().split(" ");
            int i=0, arr[] = new int[str.length];

            for(String s:str)
                arr[i++] = Integer.parseInt(s);
            
            System.out.println(getIndex(arr));
            
            sc.close();
        }
        
        public static int getIndex(int[] arr){
            int n = arr.length;
            for(int i=1;i<n-1;i++){
                int leftsum = 0, rghtsum = 0;
                for(int j=i-1;j>=0;j--)
                    leftsum+=arr[j];
                for(int j=i+1;j<n;j++)
                    rghtsum += arr[j];
                if(leftsum == rghtsum)
                    return i;
            }
            return -1;
        }
}
