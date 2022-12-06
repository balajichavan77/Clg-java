class Th implements Runnable
{
	Thread ob;
	Th()
	{
		ob=new Thread(this);
		ob.start();
	}
	public void run()
	{
		try
		{
			for(char i='A';i<='E';i++)
			{
				System.out.println("\t"+i);
			   ob.sleep(1000);
			}   
		}catch(InterruptedException ex){}
	}
}
class P5
{
	public static void main(String arg[])
	{
		new Th();
		try
		{
		 for(char i='Z';i>='V';i--)
			{
				System.out.println(i);
			   Thread.sleep(1000);
			}   
		}catch(InterruptedException ex){}
	}
}