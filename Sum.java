import java.util.Scanner;
import java.lang.*;
public class Sum
{      
    public static void main(String args[]) throws NumberFormatException
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Test cases");
         int T=in.nextInt();
         String result="";
         for(int t=1;t<=T;t++)
        {
            int a=in.nextInt();
            int b=in.nextInt();
            int sum=a+b;
            String A=Integer.toString(a);
            String B=Integer.toString(b);
            int a2=0; int b2=0;
            String sA="";
             for(int i=0;i<A.length();i++)
             {
                 if(A.charAt(i)=='5')
                 {
                    sA=A.replace('5','6');                   
                    }
                 else if(A.charAt(i)=='6')
                 {
                    sA=A.replace('6','5');
                    }
                    a2=Integer.valueOf(sA);   
            }
             String sB="";
            for(int i=0;i<B.length();i++)
             {
                 if(B.charAt(i)=='5')
                 {
                   sB=B.replace('5','6');                   
                    }
                 else if(A.charAt(i)=='6')
                 {
                      sB=B.replace('6','5');
                    }
                   b2=Integer.valueOf(sB);
            }
                        int sum2=a2+b2;
            result+=sum+" "+sum2+"\n";
            }
            System.out.println("The result: "+result);
        }
    }
            