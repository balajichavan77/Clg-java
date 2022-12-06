import java.lang.*;
import java.io.*;
class for5
{
  public static void main(String args[])
  {
    DataInputStream di=new DataInputStream(System.in);
	String s; int i,n,f=0;
	try
	{
	  System.out.print("Enter one values:");
	  s=di.readLine();
	  n=Integer.parseInt(s);
	  for(i=1;i<=n;i++)
	  {
	     if(n%i==1)
		 {
		   f=1;
		   break;
		  }
        }
         if(f==0)
          {
           System.out.print("prime number");
          }
           else
             {
               System.out.print("Non prime number");
             }
          }catch(IOException ex){}
      }
 }