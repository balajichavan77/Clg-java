import java.lang.*;
import java.io.*;
class ary6
{
public static void main(String args[])
{
DataInputStream di=new DataInputStream(System.in);
int n[]=new int[5];int i; String s;
try
{
	for(i=0;i<=4;i++)
	{
		System.out.print("Enter a Number :");
		s=di.readLine();
       n[i]=Integer.parseInt(s);
	}
           System.out.print ("\n Array Elements=\t");
           for(i=0;i<=4;i++)
           {
                System.out.print(n[i]+"\t");
            }
            int odd=0,even=0;
            for(i=0;i<=4;i++)
            {
                 if(n[i]%2==0)
                 even++;
                else
                 odd++;
            }
	System.out.println("\n even values: "+even);
	System.out.println("\n odd value: "+odd);	
}catch(IOException e){}
}
}