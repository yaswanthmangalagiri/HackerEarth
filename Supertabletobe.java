import java.util.*;
public class Supertabletobe
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter the cases");
        long T=in.nextLong();
        String result="";
        System.out.println("Enter the N,M & K");
        for(long t=0;t<T;t++)
        {  
        long N=in.nextLong();
        long M=in.nextLong();
        long K=in.nextLong();
        long table[]=new long[2*K];
        long k=0;
        for(long i=1;i<=K;i++)
        {
            table[k]=N*i;
            k++;
            table[k]=M*i;
            k++;
        }
        long countz=0;
        for(long i=0;i<2*K;i++)
        {
                long count=0;
            System.out.println("The table: "+table[i]);
            for(long l=0;l<2*K;l++)
            {
                if(table[i]==table[l])
                {
                    count++;
                    if(count==2)
                    {
                        table[l]=0;
                        countz++;
                    }
                }
            }
        }
        long supertable[]=new long[2*K-countz];long z=0;
        for(long i=0;i<2*K;i++)
        {
            if(z!=(2*K-countz))
            {
            if(table[i]!=0)
            {
                supertable[z]=table[i];
                System.out.prlongln("The Z "+z);
                z++;
            }
        }
        }
        Arrays.sort(supertable);
        for(long p=0;p<2*K-countz;p++)
        {
            System.out.println("The supertable "+supertable[p]);
        }
        
        result+=supertable[K-1]+"\n";
    }
    System.out.println("Result"+result);
}
}