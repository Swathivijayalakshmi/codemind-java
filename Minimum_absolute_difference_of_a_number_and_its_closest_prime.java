import java.util.Scanner;
class nearestprime
{
	public static boolean isprime(int n)
	{
		int count=0;
		for ( int i=2;i<=(int)Math.sqrt(n);i++)
		{
			if (n%i==0)
				count++;
		}
		if (count==0)
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,d1=0,d2=0;
		n=sc.nextInt();
		for (i=n;;i--)
		{
			if (isprime(i))
			{
				d1=i;
				break;
			}
		}
		for (i=n;;i++)
		{
			if (isprime(i))
			{
				d2=i;
				break;
			}
		}
		if (n==1)
			System.out.println("2");
		else if ((n-d1)<=(d2-n))
			System.out.println(n-d1);
		else
			System.out.println(d2-n);
	}
}