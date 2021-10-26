import java.io.*;
import java.util.*;

class Triplet<X,Y,Z>{
    public X first;
    public Y  second;
    public Z third;

    private Triplet(X first,Y second, Z third){
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public static <X,Y,Z> Triplet <X,Y,Z> of(X a, Y b,Z c){
        return new Triplet<>(a, b, c);
    }
}

public class SortedTriplets {
    
        public static void main(String[] args) throws Exception {
            // pass the path to the file as a parameter
            File file = new File("assets/input.txt");
            Scanner sc = new Scanner(file);
            
            String[] str = sc.nextLine().split(" ");
            int[] arr = new int[str.length];
            int i=0;
            for(String s:str){
                arr[i++] = Integer.parseInt(s);                
            }

            
            
            sc.close();
        }
        
}
