import java.util.Stack;

public class InsertBottom {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(11);
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);

        Stack rt = new Stack();
        while(st.size() > 0) {
            rt.push(st.pop());
        }
        while(rt.size() > 0) {
        int x =(int) rt.pop();
            System.out.print(x+" ");
            st.push(x);
        }
        System.out.println(st);
    }
}
