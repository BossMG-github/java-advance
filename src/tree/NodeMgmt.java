package tree;

// Node 클래스
public class NodeMgmt {

  Node head = null;


  public class Node {

    Node left;
    Node right;
    int value;

    public Node() {
    }

    public Node(int data) {
      this.value = data;
      this.left = null;
      this.right = null;
    }
  }


  public boolean insertNode(int data){
    // Case 1 : 노드가 하나도 없을 때
    if(this.head == null){
      this.head = new Node(data);
    }
    else{// Case 2 : 노드가 하나 이상 있을 때
      Node findNode = this.head; // 항상 시작을 헤드로 시작.
      while(true){
        // Case 2-1 : 현재 Node 의 왼쪽에 Node가 들어가야 할 때
        if(data < findNode.value){
          if(findNode.left != null){ // null 아니면 왼쪽 노드가 있다는 의미. 즉 왼쪽 노드를 현재노드로 변경
            findNode = findNode.left;
          }
          else{
            findNode.left = new Node(data); // 현재 노드의 왼쪽에 노드를 생성해서 데이터를 넣음.
            break;
          }
        } // if 종료
        else{// Case 2-2 : 현재 Node 의 오른쪽에 Node가 들어가야 할 때
          if(findNode.right != null){
            findNode = findNode.right;
          }else{
            findNode.right = new Node(data);
            break;
          }
        }
      } // while 종료
    }
    return true;
  }

}
