import java.io.*;
class A16
{
	public static void main(String args[])
	{
		DataInputStream di=new DataInputStream(System.in);
		String s,pname;int rate,qty;double amt,disc,tax,netamt;
		try
		{
			System.out.print("Enter a product Name=");
			s=di.readLine();
			System.out.print("Enter a rate values=");
			s=di.readLine();
			rate=Integer.parseInt(s);
			System.out.print("Enter a qty values=");
			s=di.readLine();
			qty=Integer.parseInt(s);
			System.out.print("Amount="+(rate*qty));
			amt=rate*qty;
			disc=(amt*4.3)/100;
			tax=(amt*5.8)/100;
			netamt=(amt-disc)+tax;
			System.out.print("NetAmount="+(netamt));
		}catch(IOException ex){}
	}
}