public class Substring {
  public static void main(String[] args) {
    String haystack = "bbbbababbbaabbba";
    String needle = "xxx";

    int ans = solution(haystack, needle);
    System.out.println("Ans: " + ans);
  }

  // static int solution(String haystack, String needle) {

  // boolean ans = haystack.contains(needle);
  // haystack.
  // if (!ans) {
  // return -1;
  // } else {
  // int counter = 0;
  // for (int i = 0; i < haystack.length(); i++) {
  // if (haystack.charAt(i) == needle.charAt(0)) {
  // for (int j = 1; j < needle.length(); j++) {
  // if (haystack.charAt(i + j) == needle.charAt(j)) {
  // counter++;
  // } else {
  // break;
  // }

  // if (counter == needle.length()) {
  // return i;
  // }
  // }

  // }
  // }
  // }
  // return -1;
  // }

  static int solution(String haystack, String needle) {
    int ans = haystack.indexOf(needle, 0);
    System.out.println(ans);
    return ans;
  }
}
