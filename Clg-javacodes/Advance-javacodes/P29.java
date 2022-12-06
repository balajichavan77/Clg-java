import java.awt.*;
import java.awt.event.*;
class P29 extends Frame implements ActionListener
{
    TextArea ta=new TextArea(100,100);
    MenuBar mb=new MenuBar();
    Menu fmenu1=new Menu("Color");
    Menu fmenu2=new Menu("Size");
    Menu fmenu3=new Menu("Font");

    MenuItem mi1=new MenuItem("R");
    MenuItem mi2=new MenuItem("G");
    MenuItem mi3=new MenuItem("B");

    MenuItem mi4=new MenuItem("20");
    MenuItem mi5=new MenuItem("30");
    MenuItem mi6=new MenuItem("40");

    MenuItem mi7=new MenuItem("Bold");
    MenuItem mi8=new MenuItem("Italic");
    MenuItem mi9=new MenuItem("Plain");
    P29()
    {
        setSize(400,400);
        setTitle("Notpad");
        setVisible(true);
        setLayout(new FlowLayout());
        addWindowListener (new closeclass());

        fmenu1.add(mi1);fmenu1.add(mi2);fmenu1.add(mi3);
        mb.add(fmenu1);

        fmenu2.add(mi4);fmenu2.add(mi5);fmenu2.add(mi6);
        mb.add(fmenu2);

        fmenu3.add(mi7);fmenu3.add(mi8);fmenu3.add(mi9);
        mb.add(fmenu3);
        setMenuBar(mb);add(ta);

        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);

        mi4.addActionListener(this);
        mi5.addActionListener(this);
        mi6.addActionListener(this);

        mi7.addActionListener(this);
        mi8.addActionListener(this);
    }
    public static void main(String arg[])
    {
        new P29();
    }
    public void actionPerformed(ActionEvent e)
    {
        int mode=0;
        if(e.getSource()==mi1)
        ta.setForeground(Color.RED);

        if(e.getSource()==mi2)
        ta.setForeground(Color.GREEN);

        if(e.getSource()==mi3)
        ta.setForeground(Color.BLUE);
        
        
        ta.setFont(new Font("",mode,20));
        ta.setFont(new Font("",mode,30));
        ta.setFont(new Font("",mode,40));

        if(e.getSource()==mi7)
        ta.setFont("Bold");
        
    }
    class closeclass extends WindowAdapter
    {
        public void windowClosing(WindowEvent ex)
        {
            System.exit(0);
        }
    }
}