package Array_assignment;

public class fibonacci_series {

	public static void main(String dfsf[])
	{
		int []arr=new int[5];
		arr[0]=0;
		arr[1]=1;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		for(int i=2;i<arr.length;i++)
		{
			arr[i]=arr[i-1]+arr[i-2];
			System.out.println(arr[i]);
		}
		     }
}
