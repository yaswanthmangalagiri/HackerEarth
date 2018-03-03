import java.util.*;
public class RandomGenerator
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter the cases ");
        int T=in.nextInt();
        for(int t=0;t<T;t++)
        {
        int N=in.nextInt();
        int K=in.nextInt();
        int P=in.nextInt();
        int NA[]=new int[N];
        for(int i=0;i<N;i++)
        {
            NA[i]=in.nextInt();
        }
        int X=P+1;int decision=1;int count=0;
        while(count<K)
        {      
            System.out.println("X "+X);
        	count=0;
            for(int i=0;i<N;i++)
            {  
                System.out.println("NA[] "+NA[i]);
                if((NA[i]>(X-P))&&(NA[i]<(X+P)))
                {
                    count++;
                    if(count>=K)
                    {
                        decision=0;
                        break;
                    }
                }
                 if(count>=K)
                    {
                        break;
                    }
            }
            
                System.out.println("Count "+count);
            
            X++;
        }
            if(decision==0)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }
    }
}
}
                
            