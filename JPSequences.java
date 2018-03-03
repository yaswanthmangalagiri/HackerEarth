import java.util.*;
public class InterestingSeries
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter the N");
        int N=in.nextInt();  
        int NA=new int[3];
        int M=in.nextInt();  
        for(int i=0;i<N;i++)
        {
            NA[i]=in.nextInt();
        }
        for(int i=0;i<N;i++)
        {       
            int size=2;
            if(NA[i]<M)
            {
                count++;
            } 
            sum+=NA[i];
            int sumsize=2;
            for(int j=i+1;j<N;j++)
            {
                if(sumsize<=size)
                {
                    sum+=NA[j];
                    size++;
                }
                else
                {
                    break;
                }
            }
        }
    }
}