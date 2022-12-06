import java.lang.*;
import java.util.*;
import java.awt.*;
import java.applet.*;
class watch extends Thread{
    Random rg = new Random();
    Thread th;
    watch()
    {
        start();
    }
    public void run ()
    {
        try
        {
            for(;;)
            {
                int R = rg.nextInt(256);
                int G = rg.nextInt(256);
                int B = rg.nextInt(256);
                Color c = new Color(R,G,B);
                setForground(c);

                Date time = new Date();
                System.out.println(time.getHours() +":" +time.getMinutes()+":"+time.getSeconds());
                sleep(1000);
            }
        } catch (Exception ex){}
    }
}
class clock
{
    public static void main(String arg[])
    {
        new watch();
        try
         {

               for(; ;) 
                   {
                   System.out.print("");
                   Thread.sleep(1000); 
                   }          
        } catch (Exception ex) {}
    }
}