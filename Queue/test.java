import java.util.ArrayDeque;
import java.util.Queue;

public class test {
    public static void main(String[] args) {

            //Queue is FIFO Method: First In First Out
        Queue<Integer> qe = new ArrayDeque<>();
        System.out.println(qe.isEmpty());

        qe.add(1);
        qe.add(2);
        qe.add(3);

        System.out.println(qe.size());

        qe.add(4);
        qe.add(5);

        System.out.println(qe.element());
        qe.remove();
        System.out.println(qe);
    }
}
