import java.util.Scanner;
public class rev_5
{
    public static void main()
    {
		int rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("n: ");
		int n=sc.nextInt();
		for(int i=n;i>0;i/=10)
		{
			rev=(rev*10)+i%10;
		}
		System.out.println("reversed: "+rev);
    }
}