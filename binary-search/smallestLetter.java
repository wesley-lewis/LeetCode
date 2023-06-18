public class smallestLetter {
  public static void main(String[] args) {
    char[] letters = { 'c', 'f', 'j' };

    char target = 'j';

    char ans = solution(letters, target);
    System.out.println("Ans:" + ans);
  }

  public static char solution(char[] letters, char target) {
    int start, end, mid;

    start = 0;
    end = letters.length - 1;

    while (start <= end) {
      mid = (start + end) / 2;

      if (target < letters[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    return letters[start % letters.length];
  }
}
