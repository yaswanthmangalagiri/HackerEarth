import java.util.*;
public class InterestingCoins
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the cases");        
        int T=in.nextInt();
        for(int x=0;x<T;x++)
        {
            int size=in.nextInt();
            int arrforinc[]=new int[size];
            int arrfordec[]=new int[size];
            int test[]=new int[size];
            for(int i=0;i<size;i++)
            {
                arrforinc[i]=in.nextInt();
                test[i]=arrforinc[i];
                arrfordec[i]=arrforinc[i];
            }
            Arrays.sort(test);
            Arrays.sort(arrforinc);
             Arrays.sort(arrfordec);
            for(int i=size-1;i>=1;i--)
            {                
                System.out.println("i "+i);
                while((arrforinc[i]-arrforinc[i-1])>=0)
                {
                    if(arrforinc[i-1]==arrforinc[i]+1)
                    {
                        System.out.println("The arrforinc[i] "+arrforinc[i]);
                        break;
                    }
                    else
                    {
                        arrforinc[i-1]+=1;
                        System.out.println("The arrforinc "+arrforinc[i-1]);
                    }
                }  
            }
            int inc=arrforinc[0]-test[0];
            System.out.println("The min "+inc);
             for(int i=size-1;i>=1;i--)
            {                
                System.out.println("i "+i);
                while((arrfordec[i]-arrfordec[i-1])>=0)
                {
                    if(arrfordec[i-1]==arrfordec[i]+1)
                    {
                        System.out.println("The arrfordec[i] "+arrfordec[i]);
                        break;
                    }
                    else
                    {
                        if(arrfordec[i-1]==1)
                        {
                            break;
                        }
                        else
                        {
                            arrfordec[i-1]-=1;
                        }
                        System.out.println("The arrfordec "+arrfordec[i-1]);
                    }
                }  
            }
            int dec=arrforinc[0]-test[0];
            System.out.println("The min "+dec);
        }
    }
}
        