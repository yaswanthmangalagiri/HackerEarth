import java.util.*;
public class GeekyAlice
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);   
        System.out.println("Enter the cases");
        int T=in.nextInt();
        for(int x=0;x<T;x++)
        {
            float finalsum=0;
            float N=in.nextFloat();
            float M=in.nextFloat();
            for(float i=N;i<=M;i++)
            {
                float num=i;float fact=0;
                if(num>0)
                {
                   fact=1; 
                }
                while(num!=0)
                {                    
                    fact*=num;
                    num--;
                }            
                System.out.println("Factorial "+fact);
                float div=fact;
                float rem=0;float sum=0;
                while(div!=0)
                {            
                    rem=div%10;
                    div=div/10;
                    sum+=rem;
                }
                finalsum+=sum;
            }        
            System.out.println("Final: "+finalsum);
        }
    }    
}