public class infiniteArray {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9, 10, 90, 130, 140, 160, 170 };
        int target = 9;
        int ans = solution(arr, target);

        System.out.println("Ans: " + ans);
    }

    public static int solution(int[] arr, int target) {
        int start, end;
        start = 0;
        end = 1;

        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return binarySearch(arr, target, start, end);

    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        int mid = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return mid;
    }

}
