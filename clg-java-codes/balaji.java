import java.io.*;
class balaji
{
  public static void main(String arg[])
  {
    DataInputStream di=new DataInputStream(System.in);
	String temp,pname; int amt,rate,qty; double disc,stax;
	try
	{
	System.out.print("Enter a product name=");
	pname=di.readLine();
	System.out.print("Enter a rate,qty=");
	temp=di.readLine();  temp=di.readLine();
	rate=Integer.parseInt(temp);
	qty=Integer.parseInt(temp);
	System.out.print("Amount="+(rate*qty));
	disc=(amt-stax)/100;
	System.out.print(stax=+stax);
	netamt=amt+stax-disc;
	}catch(IOException ex){}
  }
}