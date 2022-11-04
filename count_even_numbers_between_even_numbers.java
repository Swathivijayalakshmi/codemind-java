import java.util.Scanner;
class sample
{
    public static void main(String rags[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],i,n,count=0;
        n=sc.nextInt();
        x=new int[n];
        for (i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            
        }
        for (i=0;i<n;i++)
        {
            if (x[i]%2==0)
            {
                count++;
            }
        }
        System.out.println(count/2);
        
    }
}