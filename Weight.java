import java.util.*;
public class Weight
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the cases");int T=in.nextInt();
        String result=""; 
        for(int x=1;x<=T;x++)
        {
            int K=in.nextInt();
            String S=in.next();
            int count=0;
            for(int i=0;i<S.length();i++)
            {
                for(int j=i;j<S.length();j++)
                {
                    int w=0;
                    S.substring(i,j+1);
                    System.out.println(S.substring(i,j+1));
                    for(int l=i;l<=j;l++)
                    {
                        if(S.charAt(l)=='a')
                        {
                            w+=1;
                        }
                        else if(S.charAt(l)=='b')
                        {    
                            w+=2;
                        }
                        else if(S.charAt(l)=='c')
                        {   
                            w+=3;
                        }
                        else if(S.charAt(l)=='d')
                        {
                            w+=4;
                        }
                        else if(S.charAt(l)=='e')
                        {
                            w+=5;
                        }
                        else if(S.charAt(l)=='f')
                        {
                            w+=6;
                        }
                        else if(S.charAt(l)=='g')
                        {
                            w+=7;
                        }
                        else if(S.charAt(l)=='h')
                        {
                            w+=8;
                        }
                        else if(S.charAt(l)=='i')
                        {   
                            w+=9;
                        }
                        else if(S.charAt(l)=='j')
                        {
                            w+=10;
                        }
                        else if(S.charAt(l)=='k')
                        {
                            w+=11;
                        }
                        else if(S.charAt(l)=='l')
                        {
                            w+=12;
                        }
                        else if(S.charAt(l)=='m')
                        {
                            w+=13;
                        }
                        else if(S.charAt(l)=='n')
                        {
                            w+=14;
                        }
                        else if(S.charAt(l)=='o')
                        {
                            w+=15;
                        }
                        else if(S.charAt(l)=='p')
                        {
                            w+=16;
                        }
                        else if(S.charAt(l)=='q')
                        {
                            w+=17;
                        }
                        else if(S.charAt(l)=='r')
                        {
                            w+=18;
                        }
                        else if(S.charAt(l)=='s')
                        {
                            w+=19;
                        }
                        else if(S.charAt(l)=='t')
                        {
                            w+=20;
                        }
                        else if(S.charAt(l)=='u')
                        {
                            w+=21;
                        }
                        else if(S.charAt(l)=='v')
                        {
                            w+=22;
                        }
                        else if(S.charAt(l)=='w')
                        {
                            w+=23;
                        }
                        else if(S.charAt(l)=='x')
                        {
                            w+=24;
                        }
                        else if(S.charAt(l)=='y')
                        {
                            w+=25;
                        }
                        else if(S.charAt(l)=='z')
                        {
                            w+=26;
                        }
                    }
                        if(w==K)
                        {
                            count++;
                        }
                    }    
                }
                result+=count;
            }
            System.out.println(result);
        }
    }
            