import java.util.*;
public class Substrcheck
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter the cases & Array");
        int T=in.nextInt();
        String result="";
        for(int t=0;t<T;t++)
        {
            int sum=0;
            String ref="AaBbCc";
            String check=in.next();
            for(int i=0;i<check.length();i++)
            {
                int count=0;
                for(int j=i;j<check.length();j++)
                {
                    count=0;
                   String sub=check.substring(i,j+1);
                   System.out.println("The substring "+sub);
                   int decision=1;
                   for(int m=0;m<sub.length();m++)
                   {
                       for(int k=0;k<ref.length();k++)
                       {
                           if(sub.charAt(m)==ref.charAt(k))
                           {
                               count++;
                               System.out.println("The count "+count);
                            }
                        }
                    }                    
                        if(count!=sub.length())
                        {
                            count=0;
                            System.out.println("The count "+count);
                                break;
                            }  
                            else
                            {
                    sum+=1;
                }
                }  
            }
            result+=sum+"\n";
        }
        System.out.println("Result "+result);
    }
}