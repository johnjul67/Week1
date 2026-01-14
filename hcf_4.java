import java.util.Scanner;
public class hcf_4
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a: ");
        int a=sc.nextInt();
		System.out.println("Enter b: ");
        int b=sc.nextInt();
        while(b!=0)
		{
			int temp=b;
			b=a%b;
			a=temp;
		}
	System.out.println("HCF: "+a);
    }	
}