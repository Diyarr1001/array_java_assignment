package Array_assignment;
import java.util.Arrays;
public class second_max_second_min {

	public static void main(String[] args) {
		int []arr= {1,32,34,94,55,64};
		Arrays.sort(arr);
		System.out.println("second minimum:"+arr[1]);
		System.out.println("second maximum:"+arr[arr.length-2]);

	}
}
