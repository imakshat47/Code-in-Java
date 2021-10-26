import java.util.*;

public class RoundRank {
    
        public static void main(String[] args) throws Exception {            
            Scanner sc = new Scanner(System.in);
            
            int t = sc.nextInt();
            while(t-- != 0){
                int n = sc.nextInt(), pos = sc.nextInt();
                --n;
                while(pos != 1){
                    --n;
                    --pos;
                }
                System.out.println(2*n);
            }

            sc.close();
        }
        
}
