import java.lang.*;
import java.io.*;
class if14
{
	public static void main(String args[])
	{
		DataInputStream di=new DataInputStream(System.in);
		String s;int n,ch;double m;
		try
		{
			System.out.print("Enter a one integer Number=");
			s=di.readLine();
			n=Integer.parseInt(s);
			System.out.print("Enter a one double Number=");
			s=di.readLine();
			m=Double.parseDouble(s);
			System.out.print("\tA.Addition\n\tB.Subtraction\n\tC.Multiplication\n\tD.Division");
			s=di.readLine();
			ch=Integer.parseInt(s);
			switch(ch)
			{
				case'A':
				System.out.print("Addition="+(n+m));
				break;
				case'B':
				System.out.print("Subtraction="+(n-m));
				break;
				case'C':
				System.out.print("Multiplication="+(n*m));
				break;
				case'D':
				System.out.print("Division="+(n/m));
				break;
				default:
				System.out.print("Invalid choice");
			}
		}catch(IOException ex){}
	}
}