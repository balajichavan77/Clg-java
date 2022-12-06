import java.lang.*;
import java.io.*;
class ary5
{
public static void main(String args[])
{
DataInputStream di=new DataInputStream(System.in);
int n[]=new int[5];int i,sum=0; String s;
try
{
	for(i=0;i<=4;i++)
	{
		System.out.print("Enter a Number :");
        s=di.readLine();
		n[i]=Integer.parseInt(s);
	}
         System.out.print("\n Array elements=\t");
         sum=0;
	for(i=0;i<=4;i++)
	{
         System.out.print(n[i]+"\t");
	sum=sum+n[i];	
	}
	System.out.print("\nsum of the elements="+sum);
}catch(IOException e){}
}
}