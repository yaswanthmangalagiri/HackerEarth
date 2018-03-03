import java.util.*;
public class Googlysumtobe
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter the N");
        int N=in.nextInt();
        int NA[]=new int[N];
        for(int n=0;n<N;n++)
        {
            NA[n]=in.nextInt();
        }
        int count=0;
        for(int i=0;i<N;i++)
        {
            int sum[]=new int[3];
            System.out.println("NA[i] "+NA[i]);
            for(int j=0;j<i;j++)
            {
                int k=0;
                int diff=NA[i]-NA[j];
                System.out.println("Diff "+diff);
                sum[k]=NA[j];
                System.out.println("NA[] "+NA[j]);
                j++;k++;
                while((NA[j]<=diff)&&(k<=2))
                {
                     diff=NA[i]-NA[j];
                    System.out.println("Diff "+diff);
                    j++;      
                    sum[k]=NA[j];
                    System.out.println("NA[] "+NA[j]);
                    k++;                                 
                }
                int add=0; 
                for(int l=0;l<3;l++)
                {
                    add+=sum[l];
                }
                if(add==NA[i])
                {
                    count++;
                }
            }
        }
        System.out.println("Count "+count);
    }
}