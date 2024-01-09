import java.util.Scanner;

public class Switchcases {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Characters :");
        char ch = sc.next().charAt(0);

        switch (ch) {    
            case 'a', 'e', 'i', 'o', 'u': {
                System.out.println("Vowels");
            }
            
            default:{
                System.out.println("Consonents");
            }
        }

    }

}
