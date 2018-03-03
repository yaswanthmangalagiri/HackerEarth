import java.util.*;
public class Operation
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter the no. of Test Cases");
        int x=in.nextInt();   
        long count=0; String operations="";
    for(int i=1;i<=x;i++)
        {
            count=0; long diff=0;
            long m=1,n=1;  
            System.out.println("Enter the numbers");
            long a=in.nextLong();
            long b=in.nextLong();         
    if(a>b)
            {
            diff=a-b;
        }
        else if(a<b)
        {
        diff=b-a;
         long k=0;
            k=a;
            a=b;
            b=k;
    }
            while((n<=b)&&(diff>=1))
            {                
                 n=n+m;
                 count++;
                }         
                System.out.print("Count: "+count);
                while(((m+n)<=a)||((m+n)<=b))
                {
                m=m+n;
                count++;
                 
        }
        System.out.print("Count2: "+count);
            operations+=count+"\n";
        }     
        System.out.println("THe result "+operations);
    }
}
