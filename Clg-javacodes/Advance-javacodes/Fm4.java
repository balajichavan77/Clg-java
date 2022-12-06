import java.awt.*;
import java.awt.event.*;
class Fm4 extends Frame
{
    Button  b1=new Button("C");
    Button  b2=new Button("HTML");
    Button  b3=new Button("C++");
	Button  b4=new Button("JAVA");
	Button  b5=new Button("PHP");
	Button  b6=new Button("PYTHON");
	Button  b7=new Button("C#");
	Button  b8=new Button("MySQL");
	Button  b9=new Button("DBMS");
	Button  b10=new Button("RDBMS");
	Button  b11=new Button("ERP");
	Button  b12=new Button("SAD");
	Fm4()
	{
		setSize(400,500);
		setTitle("Balaji");
		setVisible(true);
		addWindowListener (new closeclass());
		add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);
		add(b8);add(b9);add(b10);add(b11);add(b12);
		setLayout(new FlowLayout ());
	}
    public static void main(String arg[])
	{
		new Fm4();
	}
	class closeclass extends WindowAdapter
	{
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}
	}
}