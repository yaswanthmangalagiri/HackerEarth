import java.util.*;
import java.lang.*;
public class Stress
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);  String time="";
        System.out.println("Enter the no. of Test Cases");
        int n=in.nextInt();double F1,F2;
         for(int i=1;i<=n;i++)
        {
            int t=0;
        System.out.println("Enter the numbers");
        long a=in.nextLong();
long b=in.nextLong();
long c=in.nextLong();
long d=in.nextLong();
long k=in.nextLong();
        while(t>=0)
        {
            System.out.println("Time is: "+t);
            F1=a*Math.pow(t+1,3)+b*Math.pow(t+1,2)+c*Math.pow(t+1,1)+d;
            F2=a*Math.pow(t,3)+b*Math.pow(t,2)+c*Math.pow(t,1)+d;
            System.out.println("F1: "+F1);
            System.out.println("F2: "+F2);
            if((F1>k)&&(F2<=k))
            {
                time+=(t)+"\n";
                 System.out.println("The time for this case: "+i+" is "+time);
                break;
          }
          t++;
       }
    }
  System.out.print("For the Case Time is "+time);
   
}
}

        
        