//Using object:
class Th1 extends Thread
{
	Th1()
	{
		start();
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("\t"+i);
			sleep(1000);	
            }			
		}catch(Exception ex){}
	}
}
class P3
{
	public static void main(String arg[])
	{
		new Th1();
		try
		{
			for(int i=10;i>=1;i--)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}catch(Exception ex){}
	}
}