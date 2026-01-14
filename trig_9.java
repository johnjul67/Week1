import java.util.*;
public class trig_9
{
	static	double sine(double n)
	{
		return Math.sin(n);
    }
	
	static	double cosine(double n)
	{
		return Math.cos(n);
    }
    
	public static void main()
    {
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter n in degree: ");
        double n=sc.nextDouble();
		System.out.println("Sine of n: "+sine(n*Math.PI/180));
		System.out.println("Cosine of n: "+cosine(n*Math.PI/180));
    }	
}