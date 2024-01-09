import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws NullPointerException {


//        try , catch , finally , throw , throws
        try{
            String n = null;
            System.out.println(n.length()); // NullPointerException
        }catch(Exception n){
            System.out.println("Addition of two values");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
            System.out.println(n.getMessage());
        }

    }
}
