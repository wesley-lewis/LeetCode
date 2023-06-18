public class searchInMountain {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 4, 6, 3, 2 };
    int target = 3;
    int ans = search(arr, target);
    System.out.println("Ans: " + ans);
  }

  public static int search(int[] arr, int target) {
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

    int ans = binarySearchAsc(arr, target, 0, start);
    if (ans == -1) {
      ans = binarySearchDsc(arr, target, end + 1, arr.length - 1);
    }

    return ans;
  }

  public static int binarySearchAsc(int[] arr, int target, int start, int end) {
    int mid = -1;

    while (start <= end) {
      mid = start + (end - start) / 2;

      if (target < arr[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    return mid;
  }

  public static int binarySearchDsc(int[] arr, int target, int start, int end) {
    int mid = -1;

    while (start <= end) {
      mid = start + (end - start) / 2;

      if (target > arr[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    return mid;
  }

}