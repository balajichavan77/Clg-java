import java.awt.*;
import java.awt.event.*;
class P24 extends Frame implements ActionListener
{
  Button b1=new Button("Exit");
  Label lb1=new Label("Enter Your Name:");
  TextField tf1=new TextField(40);
  CheckboxGroup cbg=new CheckboxGroup();
  Checkbox cb1=new Checkbox("R",cbg,false);
  Checkbox cb2=new Checkbox("G",cbg,false);
  Checkbox cb3=new Checkbox("B",cbg,false);
  P24()
    {
      setSize(500,500);
      setTitle("MGM's College of Cs & IT Nanded");
      setVisible(true);
      setLayout(new FlowLayout());

      add(lb1);add(tf1);add(cb1);add(cb2);add(cb3);add(b1);
      b1.addActionListener (this);
      addWindowListener(new closeclass());
      cb1.addMouseListener(new Eventclass());
      cb2.addMouseListener(new Eventclass());
      cb3.addMouseListener(new Eventclass());
    }
    public static void main(String ae[])
    {
        new P24();
    }
    public void actionPerformed (ActionEvent ae)
    {

        System.exit(0);
    }
    class Eventclass extends MouseAdapter
    {
        public void mouseClicked(MouseEvent a)
        {
            if(cb1.getState())
            tf1.setForeground(Color.RED);
            if(cb2.getState())
            tf1.setForeground(Color.GREEN);
            if(cb3.getState())
            tf1.setForeground(Color.BLUE);
        }
    }
    class closeclass extends WindowAdapter
    {
        public void windowClosing(WindowEvent ex)
        {
            System.exit(0);
        }
    }
}