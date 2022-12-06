import java.awt.*;
import java.awt.event.*;
class P26 extends Frame implements ItemListener,ActionListener{
    Label lb1=new Label("Select Course");
    Label lb2=new Label("Duration");
    Label lb3=new Label("Fees");
    Choice ch1=new Choice();
    TextField tf2=new TextField(30);
    TextField tf3=new TextField(30);
    Button b1=new Button("Close");
    P26()
    {
        setSize(400,400);
        setTitle("Drop-Down List");
        setVisible(true);
        setLayout(new FlowLayout());

        addWindowListener (new closeclass());
        add(lb1);add(ch1);add(lb2);add(tf2);add(lb3);add(tf3);add(b1);
        ch1.addItemListener(this);
        b1.addActionListener(this);

        ch1.add("Diploma");ch1.add("UG");ch1.add("PG");
    }
    public static void main(String ar[])
    {
        new P26();
    }
    public void actionPerformed(ActionEvent ae)
    {
        System.exit(0);
    }
    public void itemStateChanged(ItemEvent a)
    {
        if(ch1.getSelectedIndex()==0)
        {
            tf2.setText("Two Years");
            tf3.setText("15000");
        }
        if(ch1.getSelectedIndex()==1)
        {
            tf2.setText("Three Years");
            tf3.setText("17500");
        }
        if(ch1.getSelectedIndex()==2)
        {
            tf2.setText("Two Years");
            tf3.setText("60000");
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