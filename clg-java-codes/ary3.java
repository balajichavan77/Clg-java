import java.io.*;
class ary3
{
	public static void main(String args[])
	{
		DataInputStream di=new DataInputStream(System.in);
		int n[]=new int[5];int i,min; String s;
		try
		{
			for(i=0;i<=4;i++)
			{
				System.out.print("Enter one value:");
				s=di.readLine();
				n[i]=Integer.parseInt(s);
			}
			System.out.print("\nArray Element=\t");
			for(i=0;i<=4;i++)
			{
				System.out.print(n[i]+"\t");
			}
			min=n[0];
			for(i=0;i<=4;i++)
			{
				if(n[i]<min)
					min=n[1];
			}
			System.out.print("\n smalllest Value="+min);
		}catch (IOException ex){}
	}	
}