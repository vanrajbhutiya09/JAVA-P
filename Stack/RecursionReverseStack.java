import java.util.Stack;
public class RecursionReverseStack {


    public static void reverseStackWithRecursion(Stack<Integer> st) {

        if(st.size() == 0) return;

        Integer top = st.pop();
        System.out.print(top+" ");
        //with the help of recursion reverse the stack in java
        reverseStackWithRecursion(st);
        st.push(top);

    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
//        System.out.println(st.size());

//        with the help of for loop to revrse the stack in java
        for(int i=st.size()-1;i>=0;i--) {
            System.out.print(st.get(i)+" ");
        }
        System.out.println();
        reverseStackWithRecursion(st);

    }
}
