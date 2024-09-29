package Array_assignment;

public class max_avg_sum_array {

	public static void main(String aSdsd[])
	{
		int[] a= {1,22,78,12,44};
		int max=a[0];
		int sum=0;
		double avg;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("maximum number is:"+max);
		for(int i:a)
		{
			sum=sum+i;
		}
		System.out.println("sum of array is:"+sum);
		avg=sum/a.length;
	 System.out.println("average of element is:"+avg);
	}
}
