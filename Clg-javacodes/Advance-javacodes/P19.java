import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class P19 extends Frame implements ActionListener
{
    Checkbox cb1=new Checkbox("SSC");
    Checkbox cb2=new Checkbox("HSC");
    P19()
    {
        setSize(400,400);
        setTitle("Frame");
        setLayout(new FlowLayout());
        setVisible(true);
        add(cb1);add(cb2);
        addWindowListener(new closeclass());
        cb1.addMouseListener(new Eventclass());
        cb2.addMouseListener(new Eventclass());
    }
    public static void main(String args[])
    {
        new P19();
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
        public void windowClosing(WindowEvent ex)
        {
            System.exit(0);
        }
    }
}