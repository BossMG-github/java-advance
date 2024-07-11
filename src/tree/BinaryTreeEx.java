package tree;

public class BinaryTreeEx {

  public static void main(String[] args) {
    NodeMgmt myTree = new NodeMgmt();
    myTree.insertNode(2);
    myTree.insertNode(1);
    myTree.insertNode(3);
    myTree.insertNode(5);
    System.out.println("Head : " + myTree.head.value);
    System.out.println("Head 왼쪽 : " + myTree.head.left.value);
    System.out.println("Head 오른쪽 : " + myTree.head.right.value);
    System.out.println("Head 오른쪽의 오른쪽 : " + myTree.head.right.right.value);
  }
}
