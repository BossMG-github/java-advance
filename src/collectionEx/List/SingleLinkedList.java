package collectionEx.List;

import javax.swing.text.StyledEditorKit.BoldAction;

public class SingleLinkedList<T> {

  public Node<T> head = null;

  public class Node<T> {

    T data;
    Node<T> next = null;

    public Node(T data) {
      this.data = data;
    }
  }

  public void addNode(T data) {
    if (head == null) {
      head = new Node<T>(data);
    } else {
      Node<T> node = this.head;
      while (node.next != null) {
        node = node.next;
      }
      node.next = new Node<T>(data);
    }
  }

  public void printAll() {
    if (head != null) {
      Node<T> node = this.head;
      System.out.println(node.data);
      while (node.next != null) {
        node = node.next;
        System.out.println(node.data);
      }
    }
  }


  public Node<T> serch(T data) {
    if (this.head == null) {
      return null;
    } else {
      Node<T> node = this.head;
      while (node != null) {
        if (node.data == data) {
          return node;
        } else {
          node = node.next;
        }
      }
      return null;
    }
  }

  public void addNodeInside(T data, T isData) {
    // 강사님 코드.
    /*Node<T> searchedNode = this.serch(isData);

    if(searchedNode == null){
      this.addNode(data);
    }
    else{
      Node<T> nextNode = searchedNode.next;
      searchedNode.next = new Node<T>(data);
      searchedNode.next.next = nextNode;
    }*/

    if (this.head == null) {
      System.out.println("노드가 생성 되지 않았습니다.");
    } else {
      Node<T> node = this.head;
      while (node != null) {
        if (node.data == data) {
          Node<T> tmp = node.next;
          node.next = new Node<T>(isData);
          node.next.next = tmp;
          break;
        } else {
          node = node.next;
        }
      }
    }
  }

  public boolean delNode(T isData) {

    /*if(this.head == null){
      return false;
    }
    else{
      Node<T> node = this.head;
      while(node != null){
        if(head.data == isData){
          this.head = this.head.next;
          return true;

        }
        else{
          while(node.next != null){
            if(node.next.data == isData){
              node.next = node.next.next;
              return true;
            }
            else
            {
              node = node.next;
            }
            }
        }

      }
    }
    return false;*/
    // 리스트가 비어있는 경우
    if (this.head == null) {
      return false;
    }

    // 삭제할 노드가 헤드 노드인 경우
    if (this.head.data.equals(isData)) {
      this.head = this.head.next;
      return true;
    }

    // 그 외의 경우
    Node<T> node = this.head;
    while (node.next != null) {
      if (node.next.data.equals(isData)) {
        node.next = node.next.next;
        return true;
      }
      node = node.next;
    }

    return false; // 삭제할 노드를 찾지 못한 경우

  }


}
