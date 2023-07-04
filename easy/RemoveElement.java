public class RemoveElement {
    public static void main(String[] args) {
        int nums[] = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;

        int ans = removeElement(nums, val);
        System.out.println("Ans: " + ans);
        for (int i = 0; i < ans; i++)
            System.out.println(nums[i]);

    }

    public static int removeElement(int[] nums, int val) {
        int newNums[] = new int[nums.length];
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                newNums[counter] = nums[i];
                counter++;
            }
        }

        // nums = newNums;
        for (int i = 0; i < nums.length; i++)
            nums[i] = newNums[i];

        for (int i = 0; i < nums.length; i++)
            System.out.println(nums[i]);
        return counter;
    }
}
