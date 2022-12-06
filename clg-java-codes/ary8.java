import java.io.*;
class ary8
{
	public static void main(String args[])
	{
		DataInputStream di=new DataInputStream(System.in);
		int n[][]=new int[5][5],i,j;String s;
		try
		{
			for(i=0;i<=4;i++)
			{
				for(j=0;j<=4;j++)
				{
					System.out.print("Enter a Value:");
		             s=di.readLine();
                    n[i][j]=Integer.parseInt(s);
				}
			}
			for(i=0;i<=4;i++)
            {
				for(j=0;j<=4;j++)
				{
					System.out.print(n[i][j]+"\t");
				}
				System.out.print("\n");
			}				
		}catch (IOException ex){}
	}
}