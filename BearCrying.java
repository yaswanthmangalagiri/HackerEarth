import java.util.*;
public class BearCrying
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the String");        
        String T=in.next();int countsemi=0;int countunder=0;
        for(int x=0;x<T.length();x++)
        {
            int decision=0;
            if(T.charAt(x)==';')
            {
                countsemi++;
                 System.out.println("The ; "+countsemi);
            }
            if(T.charAt(x)=='_')
            {
                for(int i=x+1;i<T.length();i++)
                {
                    if(T.charAt(i)==';')
                    {
                        countunder++;
                        decision=1;
                        break;
                    }
                    else
                    {
                        countunder++;
                         System.out.println("The underscore "+countunder);
                    }
                }
            }       
            if(decision==1)
            {
                break;
            }
        }
        if(countunder<=1)
        {
            System.out.println("The ways "+(countsemi*(countunder))%1000000007);
        }
        else 
        {
            System.out.println("The ways "+(countsemi*(countunder+1))%1000000007);
        }
    }
}