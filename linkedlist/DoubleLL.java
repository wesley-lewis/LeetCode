public class DoubleLL {
  private class Node {
    private int value;
    private Node next;
    private Node prev;

    public Node(int value) {
      this.value = value;
    }
  }

  private Node head;
  private Node tail;
  private int size;

  public DoubleLL() {
    this.size = 0;
  }

  public void insertFirst(int value) {
    Node node = new Node(value);
    node.prev = null;
    node.next = head;
    if (head != null)
      head.prev = node;
    head = node;

    size += 1;
  }

  public void insert(int value, int index) {
    Node node = new Node(value);
    int pos = 0;
    Node p = head;

    if (p == null) {
      if (index == 1) {
        head = node;
        node.prev = null;
        node.next = null;
        return;
      } else {
        System.out.println("Index out of bounds");
        return;
      }
    }

    ++pos;
    if (index == pos) {
      node.next = head;
      head.prev = node;
      node.prev = null;
      head = node;
      return;
    }
    while (p.next != null && index != pos) {
      p = p.next;
      ++pos;
    }

    if (p.next == null) {
      p.next = node;
      node.prev = p;
      node.next = null;
      return;
    }

    if (index == pos) {
      p.next.prev = node;
      node.next = p.next;
      p.next = node;
      node.prev = p;
    }

    size += 1;
  }

  public void insertLast(int value) {
    Node node = new Node(value);
    node.next = null;

    if (head == null) {
      node.prev = null;
      head = node;
      return;
    }
    Node p = head;
    while (p.next != null) {
      p = p.next;
    }

    p.next = node;
    node.prev = p;
    node.next = null;
  }

  public void display() {
    Node p = head;

    while (p != null) {
      System.out.print(p.value);
      if (p.next != null)
        System.out.print(" -> ");

      p = p.next;
    }
    System.out.println();
  }

  public void displayRev() {
    Node p = head;
    while (p.next != null) {
      p = p.next;
    }
    System.out.println("Last " + p.value);
    while (p != null) {
      System.out.print(p.value);

      if (p.prev != null) {
        System.out.print(" -> ");
      }

      p = p.prev;

    }
    System.out.println();
  }

  public static void main(String[] args) {
    DoubleLL dll = new DoubleLL();

    for (int i = 0; i < 5; ++i) {
      dll.insertLast(i);
    }

    dll.insert(99, 3);
    dll.insert(100, 7);
    dll.insert(101, 1);
    // for (int i = 0; i < 3; ++i) {
    // dll.insertFirst(i);
    // }
    dll.display();
    dll.displayRev();
  }
}