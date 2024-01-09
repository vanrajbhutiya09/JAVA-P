
class Practice{
    public static void greeting(){
        System.out.println("I am In Static Contain");
    }
    public void printData(){
        System.out.println("I am In Normal Contain");
    }
}

public class Demo extends Practice{

    public static void main(String[] args) {


        final float PI = 3.14F;


//       Demo d = new Demo();
        greeting();
//        printData();



    }


}
