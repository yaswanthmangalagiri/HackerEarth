import java.util.*;
public class Magic
{
    public static void main(String arg[]) 
    {
        Scanner in=new Scanner(System.in);
        String result="";
        System.out.println("Enter the cases");
        int T=in.nextInt();
        for(int t=1;t<=T;t++)
        {
            int tap=in.nextInt();
            StringBuffer num=new StringBuffer("1");int x=0;
            for(int i=0;i<tap;i++)
            {
                for(int j=0;j<num.length();j=x+j)
                {
                 
                if(num.charAt(j)=='0')
                {
                    num.replace(j,j+1,"01");
                   System.out.println("String "+num);
                    x=2;
                }
                else 
                {
                   num.replace(j,j+1,"0");
                   System.out.println("String "+num);
                   x=1;
                }
                }
        }
                char ch[]=new char[num.length()];
                System.out.println("The String length: "+num.length());
                num.getChars(0,num.length(),ch,0);
                int count0=0;int count1=0;
                for(int l=0;l<num.length();l++)
                {
                    System.out.println("The Char "+ch[l]);
                    if(ch[l]=='0')
                    {
                        count0++;
                    }
                    else
                    {
                        count1++;
                    }
                }
             result+=count1+" "+count0+"\n";
            }
            System.out.println(result);
        }
    }