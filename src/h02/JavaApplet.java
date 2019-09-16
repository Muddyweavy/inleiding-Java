import java.awt.*;
import java.applet.*;

public class JavaApplet extends Applet{

    public void init() {
        setBackground(Color.white);
    }


    public void paint (Graphics g){
        g.setColor(Color.blue);
        g.drawString("Benjamin",20,20);
        g.setColor(Color.red);
        g.drawString("Luiken",20,30);
    }

}
