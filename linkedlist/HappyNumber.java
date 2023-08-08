public class HappyNumber {
  private class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
      this.value = value;
    }
  }

  public boolean isHappyNumber(int number) {
    int slow = number;
    int fast = number;

    do {
      slow = findSquare(slow);
      fast = findSquare(findSquare(fast));
    } while (fast != slow);

    if (slow == 1) {
      return true;
    }
    return false;
  }

  private int findSquare(int n) {
    int ans = 0;
    while (n > 0) {
      int rem = n % 10;
      ans += rem * rem;
      n = n / 10;
    }
    return ans;
  }
}
