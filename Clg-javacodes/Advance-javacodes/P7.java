import java.awt.*;
import java.awt.event.*;
class P7 extends Frame implements ActionListener
{
	Button b1=new Button("1 to 10");
	Button b2=new Button("10 to 1");
	P7()
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
    	new P7();
    }
    public void actionPerformed(ActionEvent ex)
    {
    	int i;
    	if(ex.getSource()==b1)
    	{
    		for(i=1;i<=10;i++)
    			System.out.println(i);
    	}
    	else
    	{
    		for(i=10;i>=1;i--)
    			System.out.println(i);
    	}
    	System.out.println("Execution Successful");
    	System.exit(0);
    }
}



