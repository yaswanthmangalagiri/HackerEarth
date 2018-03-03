import java.util.*;
public class Triplestobe
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);  
        System.out.println("Enter the N & K");
        int N=in.nextInt();
        int K=in.nextInt();
        int NA[]=new int[N];
        for(int i=0;i<N;i++)
        {
            NA[i]=in.nextInt();
        }
        int count=0;int decision=0;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j+1<N;j++)
            {
                    int sum=NA[i]+NA[j]+NA[j+1];
                    li.add(sum);
                    for(int k=0;k<li.size();k++)
                    {
                        if(sum!=li.get(k))
                        {
                            decision=1;
                        }
                    }
                    if(decision==1)
                    {
                        int product=NA[i]*NA[j]*NA[j+1];
                if(product<=K)
                {
                    count++;
                }
            }
            }
            }        
        System.out.println(count);
    }
}