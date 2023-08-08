public class ReverseList {
  Node head;
  Node tail;

  public void reverseList(Node node) {
    if (node == tail) {
      head = tail;
      return;
    }
    reverseList(node.next);
    tail.next = node;
    tail = node;
    tail.next = null;
  }

  public Node reverseListIterative(Node head) {
    Node prev = null;
    Node present = head;
    Node next = head.next;

    while (present != null) {
      present.next = prev;
      prev = present;
      present = next;
      if (next != null)
        next = next.next;
    }
    head = prev;
    return head;
  }

  public void display(Node head) {
    while (head != null) {
      System.out.print(head.value);
      if (head.next != null) {
        System.out.print(" -> ");
      }
      head = head.next;
    }
    System.out.println();
  }

  public void setTail(Node node) {
    tail = node;
  }

  public static void main(String[] args) {
    Node head = new Node(10);
    Node p = head;
    Node prev = null;
    for (int i = 2; i <= 5; ++i) {
      p.next = new Node(i * 10);
      prev = p;
      p = p.next;
    }

    ReverseList obj = new ReverseList();
    obj.setTail(prev);
    obj.display(head);
    head = obj.reverseListIterative(head);
    obj.display(head);
  }
}

class Node {
  int value;
  Node next;

  public Node(int value) {
    this.value = value;
  }
}