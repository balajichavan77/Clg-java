import java.io.*;
class ary4
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
                s=di.readLine ();
		n[i]=Integer.parseInt(s);
	}
        System.out.print("\n Reverse Array Elements=\t");
	for(i=4;i>=0;i--)
	{
	System.out.print(n[i]+"\t");	
	}
}catch(IOException e){}
}
}