import java.util.Scanner;
class disariumNumber 
 
{  
      
    public static int calculateLength(int n)
    {  
        int length = 0;  
    
	    length=(int)Math.log10(n)+1;
        return length;  
    }  
      
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
        int num , sum = 0, rem = 0, temp; 
			num=sc.nextInt();
        int len = calculateLength(num);  
          
         
        temp = num;  
          
         
        while(num > 0)
        {  
            rem = num%10;  
            sum = sum + (int)Math.pow(rem,len);  
            num = num/10;  
            len--;  
        }  
          
          
        if(sum == temp)  
            System.out.println( "True");  
        else  
            System.out.println("False");  
    }  
}  