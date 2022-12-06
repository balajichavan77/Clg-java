import java.awt.*;
import java.awt.event.*;
class Fm2 extends Frame
{
	Fm2()
	{
		setSize(400,500);
		setTitle("Frame");
		setVisible(true);
		addWindowListener (new closeclass());
	}
    public static void main(String arg[])
	{
		new Fm2();
	}
	class closeclass extends WindowAdapter
	{
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}
	}
}