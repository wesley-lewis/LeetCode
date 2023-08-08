public class ReverseList2 {
  public static ListNode reverseBetween(ListNode head, int left, int right) {
    if (left == right) {
      return head;
    }

    ListNode current = head;
    ListNode prev = null;
    for (int i = 0; current != null && i < left - 1; ++i) {
      prev = current;
      current = current.next;
    }
    ListNode last = prev;
    ListNode newEnd = current;
    ListNode next = current.next;

    // reverse between left and right.
    for (int i = 0; current != null && i < right - left + 1; ++i) {
      current.next = prev;
      prev = current;
      current = next;
      if (next != null)
        next = next.next;
    }

    if (last != null) {
      last.next = prev;
    } else {
      head = prev;
    }

    newEnd.next = current;
    return head;
  }

  private static void display(ListNode head) {
    int length = 0;
    while (head != null && length < 10) {
      System.out.print(head.val);
      if (head.next != null)
        System.out.print(" -> ");
      head = head.next;
      ++length;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    ListNode p = head;
    for (int i = 2; i <= 5; ++i) {
      p.next = new ListNode(i);
      p = p.next;
    }
    display(head);
    reverseBetween(head, 2, 4);
    display(head);
  }
}

class ListNode {
  int val;
  ListNode next;

  ListNode(int val) {
    this.val = val;
  }
}