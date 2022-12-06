import java.awt.*;
import java.awt.event.*;
class Fm3 extends Frame
{
  Button  b1=new Button("Ok");
  Button  b2=new Button("Cancel");
    Button  b3=new Button("Submit");
	Button  b4=new Button("Don't save");
	Fm3()
	{
		setSize(400,500);
		setTitle("Frame");
		setVisible(true);
		addWindowListener (new closeclass());
		add (b1);add(b2);add(b3);add(b4);
		setLayout(new FlowLayout ());
	}
    public static void main(String arg[])
	{
		new Fm3();
	}
	class closeclass extends WindowAdapter
	{
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}
	}
}