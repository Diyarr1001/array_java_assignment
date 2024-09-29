package Array_assignment;

public class occurance_array {

	public static void main(String adf[])
	{
		int []arr= {1,2,3,4,6,6,6,6};
		int n=6;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				count++;
			}
			
		}
		System.out.println("count of  " +n+ " is "+count);
	}
}
