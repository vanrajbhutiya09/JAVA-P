import java.util.Scanner;

public class Ternary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        sc.close();
        boolean b = (n & 1) == 1;
        if (b)
            System.out.println("Odd Number " + b);
        else
            System.out.println("Not Odd " + false);
    }
}
