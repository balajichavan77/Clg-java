import java.awt.*;
import java.util.*;
import java.awt.event.*;
class P10 extends Frame implements ActionListener,Runnable
{
	Button b1=new Button("start");
	Label lb1=new Label("D & T");
	Thread th;
	P10()
	{
		setSize(400,400);
		setTitle("Clock");
		setVisible(true);
		setLayout(new FlowLayout());
		add(lb1);add(b1);
		th=new Thread(this);
		b1.addActionListener(this);
	}
	public static void main(String arg[])
	{
		new P10();
	}
	public void actionPerformed(ActionEvent we)
	{
		th.start();
	}
	public void run()
	{
		try
		{
		for(;;)
		{
			lb1.setText(""+new Date());
			th.sleep(1000);
		}
	  }catch(InterruptedException ex){}
	}
}