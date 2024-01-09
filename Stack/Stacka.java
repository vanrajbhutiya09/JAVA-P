import java.util.Stack;
public class Stacka {


    public static void main(String[] args) {
        pd(5);
//        Stack s = new Stack();
//        s.push(12);
//        s.push(13);
//        s.push(14);
//        s.push(15);
//        s.push("hello");
////        s.push(17);
//        System.out.println(s.pop());
    }
    static void pd(int n){
        if(n == 0) return;

        System.out.println(n);
        pd(n-1);
    }
};
