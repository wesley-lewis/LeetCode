public class ReverseWords {
  public static String reverseWords(String s) {
    String arr[] = s.split(" ");
    System.out.println(arr.length);
    String st = "";
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != "")
        System.out.println("-|" + arr[i] + "|-");
    }
    return st;
  }

  public static void main(String[] args) {
    String s = "a good       example";
    String ans = reverseWords(s);
    System.out.println(ans);
  }
}
