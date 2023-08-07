public class CycleLength {
  private class Node {
    int value;
    Node next;

    Node(int value) {
      this.value = value;
    }
  }

  public int LengthOfCycle(Node head) {
    Node slow = head, fast = head.next;

    while (slow != null && fast != null && slow != fast) {
      slow = slow.next;
      fast = fast.next.next;
    }

    if (slow == null || fast == null) {
      // no cycle hence length should be 0
      return 0;
    }

    int length = 1;
    slow = slow.next;
    while (slow != fast) {
      slow = slow.next;
      ++length;
    }
    return length;
  }
}