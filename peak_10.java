import java.util.*;
public class peak_10
{
	static 	int peak(int[] arr,int n)
	{
		for(int i=0;i<n;i++)
		{
			if(i==0)
			{
				if(arr[i]>arr[i+1])
					return i;
			}
			else if(i==n-1)
			{
				if(arr[i]>arr[i-1])
					return i;
			}
			else
			{
				if((arr[i]>arr[i-1]) && (arr[i]>arr[i+1]))
					return i;
			}
		}
		return -1;
	}
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter n and then enter elements of list ");
        int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		if(peak(arr,n)==-1)
			System.out.println("No peak element");
		else
			System.out.println(peak(arr,n));
    }	
}