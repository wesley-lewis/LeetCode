public class InsertRecur {
  private class Node {
    private int value;
    private Node next;

    public Node(int value) {
      this.value = value;
    }
  }

  public Node head;
  public int size;

  InsertRecur() {
    this.size = 0;
  }

  private Node insertRecur(int val, int index, Node node) {
    if (index == 1) {
      Node newNode = new Node(val);
      size++;
      return newNode;
    }
    node.next = insertRecur(val, index - 1, node.next);
    return node;
  }

  public void insert(int val, int index) {
    head = insertRecur(val, index, head);
  }

  public void display() {
    Node p = head;
    while (p != null) {
      System.out.print(p.value);
      if (p.next != null) {
        System.out.print(" -> ");
      }
      p = p.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    InsertRecur obj = new InsertRecur();
    for (int i = 1; i <= 5; ++i) {
      obj.insert(i, i);
    }

    obj.display();
  }
}