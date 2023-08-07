public class CycleDetection2 {
  private class Node {
    int value;
    Node next;

    public Node(int value) {
      this.value = value;
    }
  }

  public int LengthOfCycle(Node head) {
    Node fast = head;
    Node slow = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (fast == slow) {
        Node temp = slow;
        int length = 0;
        do {
          temp = temp.next;
          ++length;
        } while (slow != temp);
        return length;
      }
    }
    return 0;
  }

  public Node detectCycle(Node head) {
    Node slow = head;
    Node fast = head.next;
    int length = 0;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (fast == slow) {
        length = LengthOfCycle(slow);
        break;
      }
    }
    if (length == 0) {
      return null;
    }

    slow = head;
    fast = head;

    while (length != 0) {
      slow = slow.next;
    }

    while (slow != fast) {
      slow = slow.next;
      fast = fast.next;
    }

    return fast;
  }

}