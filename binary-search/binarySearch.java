
class binarySearch {
  public static void main(String[] args) {
    int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int target = 9;
    System.out.println("Binary search answer: " + solution(arr, target));
  }

  public static int solution(int[] arr, int target) {
    int start, end, mid;
    start = 0;
    end = arr.length - 1;
    while (start <= end) {
      mid = (start + end) / 2;
      System.out.println("Start: " + start);
      System.out.println("End: " + end);
      System.out.println("Mid: " + mid);
      System.out.println("-----------------------------------");
      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] <= target) {
        start = mid + 1;
      } else {
        end = mid;
      }
    }

    return -1;
  }
}