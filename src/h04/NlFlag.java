package h04;

import java.awt.*;
import java.applet.*;

public class NlFlag extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRect(20, 20, 10, 200);
        g.drawRect(30, 20, 100, 30);
        g.drawRect(30, 50, 100, 30);
        g.drawRect(30, 80, 100, 30);
        g.setColor(Color.red);
        g.fillRect(30, 20, 100, 30);
        g.setColor(Color.blue);
        g.fillRect(30, 80, 100, 30);

    }
}
