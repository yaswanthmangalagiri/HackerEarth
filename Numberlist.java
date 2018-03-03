import java.util.*;
public class Numberlist
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter the N");
        int N=in.nextInt();
        String word="";
        int NA[]=new int[N];
        for(int n=0;n<N;n++)
        {
            NA[n]=in.nextInt();
            word+=NA[n];
        }
        System.out.println("The word "+word);
            for(int i=0;i<N;i++)
            {
                int count=0;
                for(int j=i;j<N;j++)
                {
                    count=0;
                   String sub=word.substring(i,j+1);
                   System.out.println("The substring "+sub);
                   
                }
            }
        }
    }
                       