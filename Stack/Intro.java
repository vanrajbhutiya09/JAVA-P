public class Intro {

    static class Stack{
        public static Node head;
        public static void push(int data){
            Node  newNode = new Node(data);
            if(isEmpty()) {

            }
        }
        public static boolean isEmpty() {
            return head == null;
        }
    }
    static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            next=null;
        }
    }
    public static void main(String[] args) {
//      last in first out "stack"
//      Stack  Data Structure Use LIFO Method

//      Operations
//        Push()
//        pop()
//        peek()

//        -> Implement with
//            - array ,  arrayList , linkedList
// ///////\\\\\\\\\\\\

//        int[] a = {2,3,2,1};
//        int b =a.length;
//        System.out.println(b);



    }
}
