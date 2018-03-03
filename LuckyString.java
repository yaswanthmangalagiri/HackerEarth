import java.util.*;
public class LuckyString
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the cases");        
        int T=in.nextInt();
        for(int x=0;x<T;x++)
        {
            int N=in.nextInt();
            String NA=""; int decision=0;int decision2=0;
            for(int i=4;i<=1000000;i++)
            {
                String num=Integer.toString(i); 
                for(int j=0;j<num.length();j++)
                {                    
                if((num.charAt(j)=='4')||(num.charAt(j)=='5'))
                {
                    decision=1;
                }
                else
                {   
                    decision=0;
                    break;
                }
            }
            if(decision==1)
            {                
                    NA+=Integer.valueOf(num);                 
            }
                if(NA.length()>=N)
                {
                    decision2=1;
                    break;
                }
            
            if(decision2==1)
            {
                break;
            }
        }
        if(NA.charAt(N-1)=='4')
        {
            System.out.println("Hacker");
        }
        else
        {
            System.out.println("Earth");
        }
    }
}

}      