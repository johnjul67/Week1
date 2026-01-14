import java.util.Scanner;
public class star_2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
	    System.out.println("Enter n: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) 
            System.out.print("* ");
        for(int i=0;i<n;i++) 
            System.out.println("*");
    }
}