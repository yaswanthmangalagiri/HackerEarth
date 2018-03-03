import java.util.*;
public class MonkQueries
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        ArrayList<Integer> st = new ArrayList<Integer>();     
        System.out.println("Enter cases");
        int x=in.nextInt();
        for(int j=0;j<x;j++)
        {
             int n=in.nextInt();
             if(n==1)
             {
                 int m=in.nextInt();
                 st.add(m);
                }
             else if(n==2)
             {
                 int re=0;
                 int m=in.nextInt();
                 for(int i=0;i<st.size();i++)
                 {
                     if(st.get(i)==m)
                     {
                         st.remove(i);
                         re=1;
                        }  
                        if(re==1)
                        {                          
                         break;
                        }
                 }
                 if(re==0)
                        {                          
                         System.out.println("-1");
                        }
                    }           
                else if(n==3)
             {
                    int max=st.get(0);              
                 for(int i=0;i<st.size();i++)
                 {
                    
                     if(st.get(i)>max)
                     {
                         max=st.get(i);
                        }
                    }
                    System.out.println(max);
                }
                else 
             {
                int min=st.get(0);
                for(int i=0;i<st.size();i++)
                 {
                   
                     if(st.get(i)<min)
                     {
                         min=st.get(i);
                        }
                    }
                    System.out.println(min);
                }
            }
        }
    }
                
                
        