public class RemoveElement {
    public static void main(String[] args) {
        int nums[] = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        int ans = removeElement(nums, val);

        System.out.println("Ans: " + ans);
    }

    public static int removeElement(int[] nums, int val) {
        int newArr[] = new int[nums.length];
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                counter++;
            } else {
                newArr[i - counter] = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = newArr[i];
            System.out.print(nums[i] + " ");
        }
        return nums.length - counter;
    }
}
