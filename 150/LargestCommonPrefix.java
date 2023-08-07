public class LargestCommonPrefix {
  public static String longestCommonPrefix(String[] strs) {
    int max = 0;
    int i = 0;
    boolean noCommon = false;
    if (strs.length == 1) {
      return strs[0];
    }
    try {
      for (i = 0; i < strs[0].length(); i++) {
        max = i;
        char t = strs[0].charAt(i);
        for (int j = 0; j < strs.length; j++) {
          if (t != strs[j].charAt(i)) {
            noCommon = true;
            break;
          }
        }
        if (noCommon) {
          break;
        }
      }
    } catch (Exception e) {

      if (max == 0) {
        return "";
      } else {
        return strs[0].substring(0, max);
      }
    }
    System.out.println(i);
    System.out.println(max);
    if (i - 1 == max)
      return strs[0].substring(0, max + 1);
    return strs[0].substring(0, max);
  }

  public static void main(String[] args) {
    String[] strs = { "flower", "flower", "flower", "flower" };
    String ans = longestCommonPrefix(strs);
    System.out.println("Ans: " + ans);
  }
}
