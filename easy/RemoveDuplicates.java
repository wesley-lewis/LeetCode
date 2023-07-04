import java.util.HashMap;

public class RemoveDuplicates {
  public static void main(String[] args) {
    int[] nums = { 1, 1, 1, 2, 3, 3, 4, 4, 4, 4, 5 };
    int ans = solution(nums);
    System.out.println("Ans: " + ans);
  }

  static int solution(int[] nums) {
    int duplicates = 0;
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      if (i == 0) {
        continue;
      } else if (nums[i] == nums[i - 1]) {
        int getValue = map.get(nums[i]);
        map.put(nums[i], getValue + 1);
        duplicates++;
      } else {
        map.put(nums[i], 1);
      }
    }

    for (int i = 0; i < nums.length; i++) {

    }

    return duplicates;
  }
}
