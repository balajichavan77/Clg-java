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
			for(int i=1;i<=30;i++)
			{
				System.out.println("Hello");
			   ob.sleep(1000);
			}   
		}catch(InterruptedException ex){}
	}
}
class s3
{
	public static void main(String arg[])
	{
		new Th1();
	}
}