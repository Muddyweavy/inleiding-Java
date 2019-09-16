package h04;

import java.awt.*;
import java.applet.*;

public class Shapes extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(10, 20, 210, 20);
        g.drawRect(10, 40, 200, 50);
        g.drawOval(440, 40, 200, 50);
        g.setColor(Color.pink);
        g.fillRect(220, 40, 200, 50);
        g.fillArc(440, 40, 200, 50, 90, 45);
        g.setColor(Color.black);
        g.drawOval(220, 40, 200, 50);
        g.drawRoundRect(10, 120, 200, 50, 30, 30);
        g.drawOval(220, 120, 200, 50);
        g.setColor(Color.pink);
        g.fillOval(220, 120, 200, 50);
        g.setColor(Color.black);
        g.drawOval(420, 120, 100, 100);


    }
}
