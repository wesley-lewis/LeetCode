public class RemoveDuplicate {
  public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  public static ListNode deleteDuplicates(ListNode head) {
    ListNode p = head;
    while (p != null) {
      if (p.val != p.next.val) {
        p.next = p.next.next;
        ListNode q = p.next;
        while (q != null && p.val == q.val) {
          q = q.next;
        }
        p.next = q;
      }
    }
    return head;
  }

}