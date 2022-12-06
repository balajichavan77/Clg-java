import java.awt.*;
class P17 extends Frame implements Runnable
{
    Thread th;
    P17()
    {
        setSize(500,500);
        setTitle("screen saver");
        setVisible(true);
        setLayout(new FlowLayout());
        th=new Thread (this);
        th.start();
    }
    public static void main(String[] args) {
        new P17();
    }
    public void run()
    {
        try
        {
            for(;;)
            {
                int r=(int)(Math.random()*255);
                int g=(int)(Math.random()*255);
                int b=(int)(Math.random()*255);
                setBackground(new Color(r,g,b));
                th.sleep(1000);
            }
        }catch(InterruptedException ex){}
    }
}