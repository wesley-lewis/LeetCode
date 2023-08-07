public class RemoveDuplicatesMoreThanTwo {
  public static int removeDuplicates(int[] nums) {
    int newNum = nums[0];
    int k = 0;
    int count = 1;
    for (int i = 1; i < nums.length; i++) {
      if (newNum == nums[i]) {
        count++;
        if (count > 2) {
          nums[i] = -101;
          k++;
        }
      } else {
        newNum = nums[i];
        count = 1;
      }
    }

    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length - i - 1; j++) {
        if (nums[j] == -101) {
          int t = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = t;
        }
      }
    }

    for (int i = 0; i < nums.length; i++) {
      System.out.print(" " + nums[i]);
    }
    System.out.println();

    return nums.length - k;
  }

  public static void main(String[] args) {
    int nums[] = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
    int k = removeDuplicates(nums);

    System.out.println("Ans: " + k);
  }
}
