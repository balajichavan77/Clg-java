import java.awt.*;
import java.awt.event.*;
class P25 extends Frame implements ItemListener,ActionListener{
    Label lb1=new Label("Select The Product");
    Label lb2=new Label("Selected Product");
    Choice ch1=new Choice();
    TextField tf1=new TextField(30);
    Button b1=new Button("Close");
    P25()
    {
        setSize(400,400);
        setTitle("Drop-Down List");
        setVisible(true);
        setLayout(new FlowLayout());

        addWindowListener (new closeclass());
        add(lb1);add(ch1);add(lb2);add(tf1);add(b1);
        ch1.addItemListener(this);
        b1.addActionListener(this);

        ch1.add("PenDrive");ch1.add("Keyboard");ch1.add("HDD");ch1.add("Computer");
    }
    public static void main(String ar[])
    {
        new P25();
    }
    public void actionPerformed(ActionEvent ae)
    {
        System.exit(0);
    }
    public void itemStateChanged(ItemEvent a)
    {
        tf1.setText(" "+ch1.getSelectedItem());
    }
    class closeclass extends WindowAdapter
    {
        public void windowClosing(WindowEvent ex)
        {
            System.exit(0);
        }
    }
}