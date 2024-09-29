package Array_assignment;
import java.util.Arrays;
import java.util.Collections;
public class ascending_decending_sort {

	public static void main(String[] args) {
        int[] arr = {1, 90, 34, 89, 7, 9};
        int mid ;
        mid = arr.length / 2;

        Arrays.sort(arr, 0, mid);

       
        Integer[] secondHalf = new Integer[arr.length - mid];
        for (int i = mid; i < arr.length; i++) {
            secondHalf[i - mid] = arr[i];
        }
        Arrays.sort(secondHalf, Collections.reverseOrder());

     
        for (int i = mid; i < arr.length; i++) {
            arr[i] = secondHalf[i - mid];
        }

       
        System.out.println("Output: " + Arrays.toString(arr));
    }
}
