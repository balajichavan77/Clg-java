import java.lang.*;
import java.io.*;
class snd2
{
public static void main(String args[])
{
DataInputStream di=new DataInputStream(System.in);
String s;char ch;
try
{
   System.out.println("Enter one Character=");
   s=di.readLine();
   ch=s.charAt(0);
       //if(ch>65 && ch<90)
      if(ch>='A' && ch<='Z')
	  {
	      System.out.println("Alphabet Entered="+ch);
	      System.out.println("\n\t\topposite case="+(char)(ch+32));
	  }  
		else if(ch>='a' && ch<='z')
		{
		  System.out.println("Alphabet Entered="+ch);
		  System.out.println("\n\t\topposite case="+(char)(ch-32));
		}
        else 
             System.out.println("\t Enter it's successfully=yes");
             System.out.println("\n\t\ YES");			
	}catch(IOException ex){}
}
}	