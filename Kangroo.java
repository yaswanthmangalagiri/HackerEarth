import java.util.*;
public class Kangroo
{      
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Test cases");
         int T=in.nextInt();
         String result="";  
        for(int t=1;t<=T;t++)
        {
            int count=0;
            Long A=in.nextLong();
            long B=in.nextLong();
            long M=in.nextLong();
            for(long i=A;i<=B;i++)
            {
                if(i%M==0)
                {
                    count++;
                }
            }
            result+=count+"\n";
        }
        System.out.println("The result "+result);
    }
}