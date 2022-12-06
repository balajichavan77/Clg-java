class Th1 implements Runnable
{
	Thread ob;
	Th1()
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
class s4
{
	public static void main(String arg[])
	{
		new Th1();
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