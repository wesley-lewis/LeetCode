// fast and slow pointer

public class CycleDetection {
  private class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
      this.val = val;
    }
  }

  public boolean detectCycle(ListNode head) {
    ListNode fast, slow;
    slow = head;
    fast = head.next;

    while (slow != null && fast != null && fast != slow) {
      slow = slow.next;
      fast = fast.next.next;
    }

    if (slow == null || fast == null) {
      return true;
    }
    return false;
  }
}