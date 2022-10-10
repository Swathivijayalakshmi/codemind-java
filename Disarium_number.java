import java.util.Scanner;
class disariumNumber 
 
{  
   
      
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
        int num , sum = 0, r = 0, temp; 
			num=sc.nextInt();
        int len =(int) Math.log10(num)+1;  
          
         
        temp = num;  
          
         
        while(num > 0)
        {  
            r = num%10;  
            sum = sum + (int)Math.pow(r,len);  
            num = num/10;  
            len--;  
        }  
          
          
        if(sum == temp)  
            System.out.println( "True");  
        else  
            System.out.println("False");  
    }  
}  