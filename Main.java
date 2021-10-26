import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // pass the path to the file as a parameter
        File file = new File("assets/input.txt");
        Scanner sc = new Scanner(file);

        System.out.println("Code in Java");
        sc.close();
    }

}