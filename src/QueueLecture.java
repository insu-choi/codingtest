import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLecture {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(1);
        queue.add(3);
        queue.offer(2);

        queue.remove(3);
        System.out.println(queue.toString());
        Integer a = queue.poll();
        System.out.println(a);
        System.out.println("peek: " + queue.peek());
        System.out.println("element: " + queue.element());
        System.out.println("remove: " + queue.remove(4));
        System.out.println("last:" + queue.remove());
        System.out.println("last:" + queue.poll());

        CustomQueue<Integer> cq = new CustomQueue<Integer>();
        cq.add(1);
        cq.add(2);
        System.out.println("cq: " + cq.toString());
        cq.poll();
        System.out.println("cq poll : " + cq.poll());
        System.out.println("cq: " + cq.toString());
    }
}
