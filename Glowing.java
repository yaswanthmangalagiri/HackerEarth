import java.util.*;
public class Glowing
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the cases");        
        int T=in.nextInt();
        String result=""; 
        for(int x=1;x<=T;x++)
        {
            String S=in.next();
            ArrayList<Integer> li=new ArrayList<Integer>();
             ArrayList<Integer> lb=new ArrayList<Integer>();
            int K=in.nextInt();  
            for(int i=0;i<S.length();i++)
            {
                if(S.charAt(i)=='1')
                {
                    li.add(i+1);
                }
            }    
            for(int k=1;k<=K;k++)
            {
                    for(int i=0;i<li.size();i++)
                    {
                        lb.add((li.get(i))*k);
                    }
            }
             for(int k=0;k<lb.size();k++)
            {
                System.out.println("The list "+lb.get(k));
                int count=0;
                    for(int i=0;i<lb.size();i++)
                    {
                        if(lb.get(k)==lb.get(i))
                        {
                            count++;
                            if(count>1)
                            {
                                System.out.println("Remove "+lb.get(i));
                                lb.remove(i); 
                                i--;
                            }                
                        }   
                    }
                }
                int bulb[]=new int[lb.size()];
                for(int k=0;k<lb.size();k++)
                {
                    bulb[k]=lb.get(k);
                }
                Arrays.sort(bulb);
            result+=bulb[K-1]+"\n";
        }
        System.out.println(result);
    }
}