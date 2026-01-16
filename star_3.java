public class Triangle {
    public static void main(String[] args)
    {
		int c=1;
        for(int i=0;i<3;i++)
		{
			for (int j = 0; j < c; j++) 
            {
            if (j == c - 1)
                System.out.print("*");
            else
                System.out.print("* ");
            }
			System.out.println();
			c+=2;
		}      
    }
}
