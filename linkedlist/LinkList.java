public class LinkList {

  private Node head;
  private Node tail;
  private int size;

  public LinkList() {
    this.size = 0;
  }

  public int getSize() {
    return this.size;
  }

  public void insertFirst(int val) {
    Node node = new Node(val);
    node.next = head;
    head = node;

    if (tail == null) {
      tail = head;
    }

    size += 1;
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

  public void insertLast(int val) {
    Node node = new Node(val);
    if (head == null) {
      head = node;
      tail = node;
    } else {
      tail.next = node;
      tail = node;
    }
    size += 1;
  }

  public void deleteFirst() {
    if (head.next != null)
      head = head.next;
    else {
      head = null;
      tail = null;
    }
    size -= 1;
  }

  public void deleteLast() {
    if (tail != null) {
      Node p = head;
      while (p.next != tail) {
        p = p.next;
      }
      tail = p;
      p.next = null;
    }
    // 1 -> 2 -> 3 -> 4
    size -= 1;
  }

  public void deleteAt(int index) {
    if (index == 1) {
      deleteFirst();
      return;
    }
    if (index == size) {
      deleteLast();
      return;
    }

    Node p = head;
    Node prev = null;
    int count = 1;
    while (count != index && p != null) {
      prev = p;
      p = p.next;
      ++count;
    }

    prev.next = p.next;
    p = null;
    size -= 1;
  }

  private class Node {
    private int value;
    private Node next;

    public Node(int value) {
      this.value = value;
    }
  }

  public static void main(String[] args) {
    LinkList ll = new LinkList();
    for (int i = 0; i < 5; ++i) {
      ll.insertLast(i);
    }

    // for (int i = 0; i < 2; ++i) {
    // ll.deleteLast();
    // ll.display();
    // }

    ll.deleteAt(2);
    ll.display();
    ll.deleteAt(3);
    ll.display();

    System.out.println("Head: " + ll.head.value);
    System.out.println("Tail: " + ll.tail.value);
    System.out.println("Size: " + ll.getSize());
  }

}
