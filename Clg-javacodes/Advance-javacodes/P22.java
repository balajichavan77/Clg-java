import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class P22 extends Frame implements ActionListener
{
    CheckboxGroup cbg=new CheckboxGroup();
    Checkbox cb1=new Checkbox("F",cbg,false);
    Checkbox cb2=new Checkbox("M",cbg,false);
    Button b1=new Button("Close");
    Label lb1=new Label("Select Gender");
    P22()
    {
        setSize(400,400);
        setTitle("RadioButton");
        setVisible(true);
        setLayout(new FlowLayout());
        add(lb1);add(cb1);add(cb2);add(b1);
        b1.addActionListener(this);
        cb1.addMouseListener(new Eventclass());
        cb2.addMouseListener(new Eventclass());
        addWindowListener (new closeclass());
    }
    public static void main(String arg[])
    {
        new P22();
    }
    public void actionPerformed(ActionEvent ae)
    {
        System.exit(0);
    }
    class Eventclass extends MouseAdapter
    {
        public void mouseClicked(MouseEvent ex)
        {
            JOptionPane.showMessageDialog(new JFrame(),"cb1="+cb1.getState()+"cb2="+cb2.getState());
        }
    }
    class closeclass extends WindowAdapter
    {
        public void windowClosing (WindowEvent ex)
        {
            System.exit(0);	
        }
    }
}