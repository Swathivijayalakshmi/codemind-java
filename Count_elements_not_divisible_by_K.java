import java.util.Scanner;
class array2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x[],i,k,n,count=0;
		n=sc.nextInt();
		x=new int[n];
		k=sc.nextInt();
		for (i=0;i<n;i++)
		{
			x[i]=sc.nextInt();
		}
		for (i=0;i<n;i++)
		{
		    if (x[i]%k!=0)
		        count++;
		    
		}    
			System.out.print(count);
		
	}
}