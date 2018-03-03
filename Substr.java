import java.util.*;
public class Substr
{      
    public static void main(String args[])
    { 
        Scanner in=new Scanner(System.in);
        System.out.println("Enter N and Strings");
        String result="";
        int N=in.nextInt();
        String NArr[]=new String[N];
        for(int n=0;n<N;n++)
        {
            NArr[n]=in.next();
        }
        int O=in.nextInt(); 
         for(int o=0;o<O;o++)
        {
        	int count=0;
            int L=in.nextInt();
            int R=in.nextInt();
            String sub=in.next();
             System.out.println("Entered Sring "+sub);
            for(int m=L-1;m<R;m++)
            {
                int start=NArr[m].indexOf(sub);
                 System.out.println("Start "+start);
                int end=NArr[m].indexOf(sub.charAt(sub.length()-1));
                 System.out.println("End "+end);
                 if((start!=-1)&&(end!=-1))
                 {
                String test=NArr[m].substring(start,end+1);
                System.out.println("SubStrings "+test);
                if(test.equals(sub));
                {
                    count++;
                }
            }
            }
            result+=count+"\n";
        }
        System.out.println(result);
    }
}