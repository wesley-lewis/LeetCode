public class CopyRandomList {
  public static void main(String[] args) {
    Node h = new Node(10);
    Node p = new Node(20);
    h.next = p;
    p.next = new Node(30);
    p = p.next;
    p.next = new Node(40);
    p = p.next;
    p.next = new Node(50);

    h.next.next.random = h;
    h.next.next.next.next.random = h.next.next;
    h.next.random = h.next.next.next;

    System.out.println("Printing first list");
    p = h;
    while (p != null) {
      System.out.print(p.val + " ");
      if (p.random != null)
        System.out.print("random: " + p.random.val);
      System.out.write('\n');
      p = p.next;
    }
    System.out.write('\n');
    Node ans = copyRandomList(h);
    p = ans;
    System.out.println("Printing new list");
    while (p != null) {
      System.out.print(p.val + " ");
      if (p.random != null) {
        System.out.print("random: " + p.random.val);
      }
      System.out.write('\n');
      p = p.next;
    }
    System.out.write('\n');
  }

  public static Node copyRandomList(Node head) {
    if (head == null) {
      return null;
    }
    Node newListHead = new Node(head.val);
    Node p = head;
    p = p.next;
    Node q = newListHead;
    while (p != null) {
      q.next = new Node(p.val);
      q = q.next;
      p = p.next;
    }
    p = head;
    q = newListHead;

    while (q != null) {
      Node target = p.random;
      Node temp = head;
      Node t2 = newListHead;
      if (target != null) {
        while (temp != null) {

          if (temp == target) {
            q.random = t2;
          }
          t2 = t2.next;
          temp = temp.next;
        }
      }
      q = q.next;
      p = p.next;
    }
    return newListHead;
  }
}

class Node {
  int val;
  Node next;
  Node random;

  public Node(int val) {
    this.val = val;
    this.next = null;
    this.random = null;
  }
}