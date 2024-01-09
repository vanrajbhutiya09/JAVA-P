
//Queue Is Interface
//Stack Is Class
//ArrayList Also A Class
//Vector is Legacy class

public class Implements {
    public static class queue{
        int front = -1;
         int rear = -1;
        int size=0;
        int[] arr=new int[100];
        public void add(int data) {
            if(arr.length-1 == rear) {
                System.out.println("Queue Is Full");
                return;
            }
            if(front==-1) front=rear=0;
            else
                arr[++rear] = data;
            size++;
        }
        public int remove() {
            front++;
            size--;
            return arr[front-1];
        }
        public int peek(){
            if(size > 0) {
                return arr[front];
            }
        }

    }
    public static void main(String[] args) {

        //        Queue<Integer> q = new ArrayDeque<>();
//        q.add(11);
//        q.add(12);
//        q.add(13);
//        q.add(14);
//        q.add(15);
//
//        Queue<Integer> q1 = new ArrayDeque<>();
//        while(q.size() > 0) {
//            int x = q.remove();
//            q1.add(x);
//            System.out.print(x+" ");
//        }
//        System.out.println(q1);
    }
}
