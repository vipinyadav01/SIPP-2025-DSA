import java.util.*;

public class RotateArray {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    int k = 3;
    rotate(arr, k);
    // System.out.println(Arrays.toString(arr)); here only rotate one times

  }

  public static void rotate(int[] arr, int t) {
    int k = t % arr.length;
    for (int i = 0; i < k; i++) {
        int temp = arr[0];
        for (int j = 0; j < arr.length - 1; j++) {
            arr[j] = arr[j + 1];
        }
        arr[arr.length - 1] = temp;
        System.out.println(Arrays.toString(arr));
    }
  }
}