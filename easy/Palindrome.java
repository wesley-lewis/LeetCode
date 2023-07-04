public class Palindrome {
  public static void main(String[] args) {
    int num = -121;
    boolean ans = solution(num);
    System.out.println("Ans: " + ans);
  }

  static boolean solution(int x) {
    String x_str = Integer.toString(x);
    int start = 0;
    int end = x_str.length() - 1;

    for (start = 0; start < x_str.length(); start++) {
      if (x_str.charAt(start) != x_str.charAt(end)) {
        return false;
      }
      end--;

    }
    return true;
  }
}
