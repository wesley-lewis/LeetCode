public class RowColMatrix {
  public static void main(String[] args) {
    // int[][] nums = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 28, 29, 37, 39 },
    // { 33, 38, 38, 50 } };
    // int[][] nums = { { 1 } };
    int[][] nums = { { 1, 3 } };
    int[] ans = solution(nums, 29);
    System.out.println("Ans: " + ans[0] + " " + ans[1]);
  }

  static int[] solution(int nums[][], int target) {
    int solution[] = { -1, -1 };
    int start = 0;
    int end = nums.length - 1;
    int n = nums.length;

    while (start <= n && end >= 0) {
      int element = nums[start][end];
      if (element == target) {
        solution[0] = start;
        solution[1] = end;
        return solution;
      } else if (element < target) {
        start++;
      } else if (element > target) {
        end--;
      }
    }
    return solution;
  }
}

/*
 * 1 2 3 4
 * 2 4 6 8 <-
 * 3 6 9 12
 * 4 8 12 16
 */