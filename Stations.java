import java.util.*;
public class Stations
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the cases");
        int T=in.nextInt();
        String S="";
        for(int t=1;t<=T;t++)
        {
            int N=in.nextInt();
            String stations[]=new String[N];
            String deci="";
            ArrayList<Integer> li=new ArrayList<Integer>();
            char ch[]=new char[N];
            int counter[]=new int[N];
            for(int i=0;i<N;i++)
            {
                stations[i]=in.next();
                ch[i]=stations[i].charAt(0);
                System.out.println("The Chars: "+ch[i]);
            }
            for(int j=0;j<N;j++)
            {
                    int count=0;
                for(int l=0;l<N;l++)
                {
                    if(ch[j]==(ch[l]))
                    {
                        counter[j]+=1;
                    }
                }
                li.add(counter[j]);
            }
            for(int z=0;z<li.size();z++)
            {
                    if(li.get(z)>2)
                    {
                        deci="NO";
                        break;
                    }
                    else
                    {
                         deci="NO";
                    }
                }
              
            S+=deci+"\n";
        }
         System.out.println("The Decision: "+S);
        }
    }
  