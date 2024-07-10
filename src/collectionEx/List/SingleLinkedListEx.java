package collectionEx.List;

public class SingleLinkedListEx {

  public static void main(String[] args) {
    Node<Integer> node1 = new Node<>(1);
    Node<Integer> node2 = new Node<>(2);
    node1.next = node2;
    Node<Integer> head = node1;

    SingleLinkedList<Integer> mylist = new SingleLinkedList<>();
    mylist.addNode(1);
    mylist.addNode(2);
    mylist.addNode(3);
    //System.out.println(mylist.head.next.data);
    mylist.serch(3);
    mylist.printAll();
    mylist.addNodeInside(2,10);
    mylist.printAll();
    mylist.delNode(10);
    mylist.printAll();
  }
}
