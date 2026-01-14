import java.util.Scanner;
public class sumtillN_6
{
	static int NumberSum(int n)
	{
		int s=0;
		for(int i =0;i<=n;i++)
		{
			s+=i;
		}
		return s;
	}
	public static void main()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("n: ");
		int n=sc.nextInt();
		System.out.println(NumberSum(n));
	}
}