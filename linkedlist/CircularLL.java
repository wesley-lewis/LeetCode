public class CircularLL {
  private class Node {
    int value;
    Node next;

    public Node(int value) {
      this.value = value;
      next = null;
    }
  }

  Node head;
  Node tail;
  int size;

  public CircularLL() {
    this.size = 0;
  }

  public void insertLast(int value) {
    Node node = new Node(value);
    node.next = null;
    if (head == null) {
      head = node;
      tail = node;
      return;
    }

    tail.next = node;
    node.next = head;
    tail = node;
    ++size;
  }

  public void insertFirst(int value) {
    Node node = new Node(value);
    if (head == null) {
      head = node;
      tail = node;
      return;
    }

    if (tail == head) {
      node.next = head;
      tail = head;
      head = node;
      return;
    }

    node.next = head;
    head = node;
    tail.next = node;
  }

  public void display() {
    Node p = head;
    if (p != null) {
      System.out.print(p.value);
    }
    p = p.next;
    while (p != head) {

      System.out.print(" -> " + p.value);
      p = p.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    CircularLL cll = new CircularLL();

    for (int i = 0; i < 5; ++i) {
      cll.insertFirst(i);
    }

    cll.display();
    System.out.println(cll.tail.value);
  }
}