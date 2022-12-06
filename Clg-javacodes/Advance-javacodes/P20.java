import java.awt.*;
import java.awt.event.*;
class P20 extends Frame implements ActionListener
{
    Label lb1=new Label("Enter City Name");
    Checkbox cb1=new Checkbox("Bold");
    Checkbox cb2=new Checkbox("Italic");
    Button b1=new Button("Close");
    TextField tf1=new TextField(40);
    P20()
    {
        setSize(400,400);
        setTitle("frame4");
        setVisible(true);
        setLayout(new FlowLayout());
        add(lb1);add(tf1);
        add(cb1);add(cb2);
        
        
        
        add(b1);
        b1.addActionListener (this);
        addWindowListener(new closeclass());
        cb1.addMouseListener(new Eventclass());
        cb2.addMouseListener(new Eventclass());
    }
    public static void main(String arg[])
    {
        new P20();
    }
     public void actionPerformed (ActionEvent ae)
        {

         System.exit(0);
        }
    class Eventclass extends MouseAdapter
    {
        public void mouseClicked(MouseEvent a)
        {
            int mode=0;
            if(cb1.getState())
            mode=mode + Font.BOLD;
            if(cb2.getState())
            mode=mode + Font.ITALIC;   
            
            
            tf1.setFont(new Font("",mode,15));   
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