import java.util.*;
public class factorial_8
{
	static 	double fact(int n)
	{
		double f=1.0;
		for(int i=1;i<=n;i++)
			f*=i;
		return f;
	}
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
		System.out.println("n: ");
        int n=sc.nextInt();
		System.out.println("factorial: "+fact(n));
    }	
}