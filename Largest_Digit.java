import java.util.Scanner;
class maxdigit
{
    public static int maximum(int n)
    {
        int r,max=0;
        while(n>0)
		{
			r=n%10;
			if (r==9)
			{
				max=9;
				break;
			}
			if (r>max)                       
			    max=r;
			n=n/10;
			
		}
		return max;
    }
        
    
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,result=0;
		n=sc.nextInt();
		result=maximum(n);
		System.out.println(result);
		
	
	}
	
}