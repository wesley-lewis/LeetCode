public class SortLinkedList {
  private class Node {
    int val;
    Node next;

    Node(int value) {
      this.val = value;
    }

    Node() {
    }
  }

  public Node mergeSort(Node head) {
    if (head == null || head.next == null) {
      return head;
    }

    Node middle = mid(head);
    Node left = mergeSort(head);
    Node right = mergeSort(middle);

    return merge(left, right);
  }

  private Node merge(Node list1, Node list2) {
    Node dummyHead = new Node();

    Node tail = dummyHead;

    while (list1 != null && list2 != null) {
      if (list1.val < list2.val) {
        tail.next = list1;
        list1 = list1.next;
        tail = tail.next;
      } else {
        tail.next = list2;
        list2 = list2.next;
        tail = tail.next;
      }
    }
    tail.next = (list1 != null) ? list1 : list2;
    return dummyHead;
  }

  private Node mid(Node head) {
    Node fast = head;
    Node slow = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public Node BubbleSort(Node head) {
    Node p = head;
    if (head == null) {
      return null;
    }
    while (p != null) {
      Node j = head;
      Node prev = null;
      while (j.next != null) {
        if (j.val > j.next.val) {
          if (prev != null) {
            j.next = j.next.next;
            prev.next = j.next;
            j.next.next = j;
          } else {
            head = j.next;
            j = j.next.next;
            head.next = j;
          }
        }
      }
    }

    return head;
  }

  public static void main(String[] args) {

  }
}