import java.util.Scanner;

public class ExceptionHeadling {

    public static void main(String[] args) throws ArithmeticException {

       Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Age :");
        int age = sc.nextInt();

        if(age < 18) {
                throw new ArithmeticException("No no Beta");
        }else{
            System.out.println("Tu Yaar Moto Thego Have Hal hai");
        }

    }

}
