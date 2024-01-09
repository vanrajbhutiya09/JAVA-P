import java.util.Stack;

public class CopyTheStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        Stack<Integer> rt = new Stack<>();
        Stack<Integer> res = new Stack<>();

        System.out.println(st);
        while(st.size() > 0) {
            rt.push(st.pop());

        }
        Stack<Integer> gt = new Stack<>();
        while(st.size() > 0) {
            gt.push(rt.pop());

        }
        System.out.println(gt);
    }
}
