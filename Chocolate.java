import java.util.*;
public class Chocolate
{      
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Test cases");
         int T=in.nextInt();
         String result="";
         for(int t=0;t<T;t++)
         {
              System.out.println("Enter the String");
             String C=in.next();
              System.out.println("Length "+C.length());
             int i=0;int count=0;
             while((i+3)<=C.length())
             {
                 String box=C.substring(i,i+3);
                  System.out.println("BOX "+box); 
                 if((box.equals("SSS"))||(box.equals("CCC")))
                 {
                     i++;
                 }
                 else
                 {
                     count++;
                     System.out.println("Count "+count); 
                     i+=3;                     
                    }
                }
                 System.out.println("Count after"+count); 
                int eat=C.length()-count*3;
                result+=eat+"\n";
            }
            System.out.println(result);            
        }
    }