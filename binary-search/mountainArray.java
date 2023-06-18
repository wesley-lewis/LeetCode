public class mountainArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6, 7, 8, 3, 2 };

        int ans = peakIndexMountainArray(arr);
        System.out.println("Ans: " + ans);
    }

    public static int peakIndexMountainArray(int[] arr) {
        int start, end, mid = -1;
        start = 0;
        end = arr.length - 1;

        while (start < end) {
            mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
