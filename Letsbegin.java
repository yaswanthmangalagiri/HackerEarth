import java.util.*;
public class Letsbegin
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter the cases");
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int N=in.nextInt();
        int count=0;
        while(N>0)
        {
                if((N>=7)&&(N-7!=1)||(N-7==0))
                {
                    N-=7;                    
                 System.out.println("Added 7");
                count++;
                }            
                else if((N>=5)&&(N-5!=1)||(N-5==0))
                {
                    N-=5;
                System.out.println("Added 5");
                count++;
            }
               else if((N>=3)&&(N-3!=1)||(N-3==0))
                {
                    N-=3;                
                System.out.println("Added 3");
                count++;
            }
              else if((N>=2)&&(N-2!=1)||(N-2==0))
                {
                    N-=2;
                System.out.println("Added 2");
                count++;
            }
        }
        System.out.println("Min counts "+count);
    }
        
    }
}

        