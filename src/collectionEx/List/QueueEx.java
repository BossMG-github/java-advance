package collectionEx.List;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx {

  public static void main(String[] args) {
    Queue<Integer> queue_int = new LinkedList<>(); // Integer형 큐 생성
    Queue<String> queue_String = new LinkedList<>(); // String형 큐 생성
    queue_int.add(1);
    queue_int.offer(2);
    System.out.println(queue_int);
    queue_int.poll();
    System.out.println(queue_int);
    queue_int.add(1);
    queue_int.remove(2);
    System.out.println(queue_int);
  }
}
