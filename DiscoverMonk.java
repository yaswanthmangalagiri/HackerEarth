import java.util.*;
public class DiscoverMonk
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the N and Q");        
        int N=in.nextInt();
        int Q=in.nextInt();
        Long NA[]=new Long[N];
        Long QA[]=new Long[Q];
        String result=""; 
        for(int x=0;x<N;x++)
        {
            NA[x]=in.nextLong();
        }
        for(int q=0;q<Q;q++)
        {
            QA[q]=in.nextLong();
        }
        for(int i=0;i<Q;i++)
        {
            int count=0;
            for(int j=0;j<N;j++)
            {
            if(QA[i]==NA[j])
            {
                count=1;
                break;
            }
        }
        if(count==1)
        {
            System.out.println("YES");
        }
        else
        {    
            System.out.println("NO");
        }
    }
}
}