//Using Object:

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
			for(int i=1;i<=30;i++)
			{
				System.out.println("child Thread");
			sleep(1000);	
            }			
		}catch(Exception ex){}
	}
}
class P2
{
	public static void main(String arg[])
	{
		new Th1();
		try
		{
			for(int i=1;i<=30;i++)
			{
				System.out.println("Main Thread");
				Thread.sleep(2000);
			}
		}catch(Exception ex){}
	}
}