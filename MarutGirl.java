import java.util.*;
public class MarutGirl
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        int countgirl=0;
        System.out.println("Enter N");
        int N=in.nextInt();
        ArrayList<Integer> num=new ArrayList<Integer>();
            for(int i=0;i<N;i++)
            {
                int no=in.nextInt();  
                num.add(no);
            }    
            System.out.println("Enter the Query");
            int Q=in.nextInt();
             int count=0;
            System.out.println("Enter the Num"); 
            ArrayList<Integer> li=new ArrayList<Integer>();
            int l=0;
            while((in.hasNext())&&(l!=Q+1))
            {
               if(in.hasNextInt())
               {
                   int i=in.nextInt();
                   li.add(i);               
                   for(int k=0;k<li.size();k++)
                        {
                            for(int j=0;j<N;j++)
                            {
                            if(li.get(k)==num.get(j))
                            {
                                count++;
                                System.out.println("Count "+count); 
                                if(count==N)
                                {
                                    countgirl++;
                                }
                            }
                        }     
                    }                    
                }     
                System.out.println("Result "+countgirl);    
                    l++;count=0;
        }           
    }   
}
/*1 2 3 4 5
3
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4*/
                