import java.util.*;
import java.io.*;
public class Reverse
{      
    public static void main(String args[]) throws IOException
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Test cases");
        int N=in.nextInt();  String S[]=new String[30];  
        String revst="";String show="";
        for(int t=1;t<=N;t++)
        {
            System.out.println("Enter the array");
            S[t-1]=in.next();
            char ch[]=new char[S[t-1].length()];
            char rev[]=new char[S[t-1].length()];
            S[t-1].getChars(0,S[t-1].length(),ch,0);
            for(int i=S[t-1].length()-1;i>=0;i--)
            {
                int k=S[t-1].length()-1;               
                rev[k-i]=ch[i];                
            }            
            revst=new String(rev);   
            show+=revst+"\n";
        }
        System.out.println("Reverse array "+show);
        }       
    }
    


        