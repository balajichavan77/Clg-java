import java.awt.*;
import java.awt.event.*;
class Fm5 extends Frame
{
    Button  b1=new Button("ok");
    Button  b2=new Button("save");
    Button  b3=new Button("don't save");
	Button  b4=new Button("cancel");
	Button  b5=new Button("submit");
	Button  b6=new Button("press");
	Button  b7=new Button("back");
	Button  b8=new Button("new page");
	Button  b9=new Button("preview page");
	Fm5()
	{
		setSize(400,500);
		setTitle("Google Form");
		setVisible(true);
		addWindowListener (new closeclass());
		add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);
		add(b8);add(b9);
		setLayout(new FlowLayout ());
	}
    public static void main(String arg[])
	{
		new Fm5();
	}
	class closeclass extends WindowAdapter
	{
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}
	}
}