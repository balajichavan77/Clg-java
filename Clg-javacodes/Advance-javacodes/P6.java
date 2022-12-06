import java.awt.*;
import java.awt.event.*;
class P6 extends Frame implements ActionListener
{
	Button b1=new Button("Ok");
	Button b2=new Button("Cancel");
	P6()
	{
		setSize(400,400);
		setTitle("Numeric series");
		setVisible(true);
		setLayout(new FlowLayout());
		add(b1);add(b2);
		b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public static void main(String arg[])
    {
    	new P6();
    }
    public void actionPerformed(ActionEvent ex)
    {
    	System.out.print("Button");
    	System.exit(0);
    }
}