import java.io.*;
class A15
{
	public static void main(String args[])
	{
		DataInputStream di=new DataInputStream(System.in);
		String temp,pname; int rate,qty; double amt,tax,disc,netamt;
        try
        {
			System.out.print("Enter a product name=");
			pname=di.readLine();
			System.out.print("Enter a rate & qty=");
			temp=di.readLine(); temp=di.readLine();
			rate=Integer.parseInt(temp);
			qty=Integer.parseInt(temp);
			amt=rate*qty;
			if(amt>1000)
			{
				tax=(amt*5.8)/100;
				System.out.print("Tax="+(tax));
				disc=(amt*4.3)/100;
				System.out.print("Discount="+(disc));
				netamt=(amt-disc)+tax;
				System.out.print("Net Amount="+(netamt));
		    }
			else
			  System.out.print("Net Amount="+(amt));
		}catch(IOException ex){}		
	}
}