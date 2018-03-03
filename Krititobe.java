import java.util.*;
public class Krititobe
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter the N ");
        int N=in.nextInt();
        String NA[]=new String[N];
        for(int t=0;t<N;t++)
        {
            NA[t]=in.next();
        }
        int Q=in.nextInt();
        for(int i=0;i<Q;i++)
        {
            int I=in.nextInt();
            int R=in.nextInt();
            String S=in.next();
            int count=0;
            for(int j=I-1;j<R;j++)
            {
                if(S.equals(NA[j]))
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
        
            