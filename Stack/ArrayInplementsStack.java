public class ArrayInplementsStack {
   public class Stack{
        int Node;
        int top=-1;
        int[] arr = new int[5];
        public  void push(int data){
            arr[++top]  = data;
        }
        public void pop() {

            if(top == -1) {
                System.out.println("stack is empty");
            }
            arr[top--] = top;
        }

    }

//    public static void main(String[] args) {
//
////        Stack s = new Stack();
//        s.push(10);
//        s.pop();
//
//    }


}
