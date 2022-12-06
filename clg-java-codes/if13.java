import java.lang.*;
import java.io.*;
class if13
{
	public static void main(String args[])
	{
		DataInputStream di=new DataInputStream(System.in);
		String s;int n,ch;
		try
		{
			System.out.print("Enter a Number=");
			s=di.readLine();
			n=Integer.parseInt(s);
			System.out.print("\t1.Square\n\t2.Square root\n\t3.Cube");
			s=di.readLine();
			ch=Integer.parseInt(s);
			switch(ch)
			{
				case 1:
				System.out.print("Square="+(n*n));
				break;
				case 2:
				System.out.print("Square root="+Math.sqrt(n));
				break;
				case 3:
				System.out.print("Cube="+(n*n*n));
				break;
				default:
				System.out.print("WRONG CHOICE");
			}
        }catch(IOException ex){}
    }
}