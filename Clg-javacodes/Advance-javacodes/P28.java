import java.awt.*;
import java.awt.event.*;
class P28 extends Frame implements ActionListener
{
    TextArea ta=new TextArea(50,50);
    MenuBar mb=new MenuBar();
    Menu fmenu=new Menu("File");
    MenuItem mi1=new MenuItem("New");
    MenuItem mi2=new MenuItem("Save");
    MenuItem mi3=new MenuItem("Exit");
    P28()
    {
        setSize(400,400);
        setTitle("Notpad");
        setVisible(true);
        setLayout(new FlowLayout());
        addWindowListener (new closeclass());

        fmenu.add(mi1);fmenu.add(mi2);fmenu.add(mi3);
        mb.add(fmenu);
        setMenuBar(mb);add(ta);

        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
    }
    public static void main(String arg[])
    {
        new P28();
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==mi1)
        ta.setText("First Item is Clicked");
        else if(e.getSource()==mi2)
        ta.setText("Second Item is Clicked");
        else
        System.exit(0);
    }
    class closeclass extends WindowAdapter
    {
        public void windowClosing (WindowEvent ex)
        {
            System.exit(0);	
        }
    }
    
}