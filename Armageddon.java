import java.util.*;
public class Armageddon
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
         System.out.println("Enter the cases");
        int T=in.nextInt();
        for(int t=0;t<T;t++)
        {
            int count=0;
            String str=in.next();int n=1;
            for(int i=0;i<str.length();i++)
            {
                String test="";
                test+=str.charAt(i);
                for(int j=i;j<str.length();j++)
                {                    
                    StringBuffer sb=new StringBuffer(str);
                    if(test.length()!=n)
                    {
                        test+=sb.charAt(j);
                    }
                    else                        
                    {
                        if(Integer.valueOf(test)%6==0)
                        {
                            System.out.println("The integer "+Integer.valueOf(test));
                            sb=new StringBuffer();
                            count++;
                        }
                    }                       
                }
                    n++;
                                 System.out.println("Test "+test+" "+count);
                }

            }
        }
    }
