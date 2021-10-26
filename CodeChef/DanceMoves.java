// import java.io.*;
import java.util.*;

public class DanceMoves {
    
        public static void main(String[] args) throws Exception {            
            Scanner sc = new Scanner(System.in);
            
            int t = sc.nextInt();
            while(t-- != 0){
                int x = sc.nextInt(), y = sc.nextInt();
                System.out.println(findMinWays(x,y));
            }
            sc.close();
        }
        
    public static int findMinWays(int x, int y){                            
        if(x < y)
            return findMinWays(x+2, y) + 1;
        else if(x > y)
            return findMinWays(x-1, y) + 1;        
        return 0;
    }
}
