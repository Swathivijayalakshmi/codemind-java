import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],i,n,found=0;
        n=sc.nextInt();
        x=new int[n];
        for (i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for (i=0;i<n;i++)
        {
          for (int j=i+1;j<n;j++) 
          {
              if (x[i]==x[j])
              {
                  System.out.println(x[i]);
                  found=1;
                  break;
              }
          }
        }
        // if (found==1)
        // {
        //     break;
        // }
    }
}