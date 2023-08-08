public class BubbleSort {
  public Node swapNodes(Node head) {
    if (head == null) {
      return null;
    }

    if (head.next == null) {
      return head;
    }

    Node p = head;
    Node q = head.next;

    p.next = q.next;
    q.next = p;
    head = q;
    return head;
  }

  public Node bubbleSort(Node head) {
    if (head == null) {
      return null;
    }
    Node first = head;
    Node second = head.next;
    Node prev = null;
    int length = this.LengthOfList(head);
    while (length > 0) {
      first = head;
      second = head.next;
      prev = null;
      while (second != null) {
        if (first.value > second.value) {
          if (first == head) {
            // 1 -> 2 -> 3
            first.next = second.next;
            second.next = first;
            head = second;
            Node t = second;
            second = first;
            first = t;
          } else {

            prev.next = second;
            first.next = second.next;
            second.next = first;
            Node t = second;
            second = first;
            first = t;
          }
        }
        prev = first;
        first = first.next;
        second = second.next;
      }
      --length;
    }
    return head;
  }

  public int LengthOfList(Node head) {
    Node p = head;
    int length = 0;
    while (p != null) {
      ++length;
      p = p.next;
    }
    return length;
  }

  public void display(Node head) {
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
    Node head = new Node(60);
    Node p = head;
    for (int i = 5; i > 0; --i) {
      Node newNode = new Node(i * 10);
      p.next = newNode;
      p = p.next;
    }

    BubbleSort obj = new BubbleSort();
    obj.display(head);
    System.out.println(obj.LengthOfList(head));
    head = obj.bubbleSort(head);
    obj.display(head);
  }
}

class Node {
  int value;
  Node next;

  public Node(int value) {
    this.value = value;
    next = null;
  }
}