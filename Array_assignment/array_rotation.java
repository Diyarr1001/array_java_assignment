package Array_assignment;
import java.util.Arrays;
public class array_rotation {

	public static void rightRotate(int[] arr) {
        int last = arr[arr.length - 1];  
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];  
        }
        arr[0] = last;
    }
    public static void leftRotate(int[] arr) {
        int first = arr[0];  
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1]; 
        }
        arr[arr.length - 1] = first;  
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original array: " + Arrays.toString(arr));
        rightRotate(arr);
        System.out.println("Array after right rotation: " + Arrays.toString(arr));
        leftRotate(arr);
        System.out.println("Array after left rotation: " + Arrays.toString(arr));
    }
}
