import java.util.*;
public class InterestingSeries
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter the N");
        int N=in.nextInt();        
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=2;i<=200;i++)
        {
            int count=0;  System.out.println("HI");
            if(i<al.size())
            {
            for(int j=2;j<=i;j++)
            {                    
                if(i%j==0)
                {                    
                    count++;
                }
            }
            if(count==1)
            {
                al.add(i);
            }
             System.out.println("Size "+al.size());
        }     
    }
    for(int n=0;n<N;n++)
        {
            int num=in.nextInt();
        int PA[]=new int[20000];
        int x=0,y=0;
        for(int i=0;i<=(al.get(al.size()-1));i++)
        {
            System.out.println("HI");
            for(int j=i+1;j<(al.get(al.size()-1));j++)
            {
                int product=1;
                for(int k=j+1;k<(al.get(al.size()-1));k++)
                {
                    product=al.get(k)*al.get(j)*al.get(i);
                for(x=y;x>=y;x--)
                {
                    int dec=0;
                    if(product!=PA[x])
                {
                    PA[y]=product;
                    y++;
                    dec=1;
                }
                if(dec==1)
                {
                    break;
                }
            }}
        }
    }
        for(int i=0;i<N;i++)
        {
            for(int j=i+1;j<N;i++)
            {
                if(PA[i]>PA[j])
                {
                    int temp=PA[i];
                    PA[i]=PA[j];
                    PA[j]=temp;
                }
            }
        }
        System.out.println(PA[num]);
    }
}
}
