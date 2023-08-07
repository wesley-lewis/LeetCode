public class LengthOfLastWord {
  public static int lengthOfLastWord(String s) {
    String arr[] = s.split(" ");

    String newS = arr[arr.length - 1];
    return newS.length();
  }

  public static void main(String[] args) {
    String s = "   well     How are         you     doing?    ";
    int ans = lengthOfLastWord(s);
    System.out.println("Ans: " + ans);
  }
}
