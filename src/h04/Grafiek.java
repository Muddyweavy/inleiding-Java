package h04;

import java.awt.*;
import java.applet.*;

public class Grafiek extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(50, 100, 50, 300);
        g.drawLine(50, 300, 250, 300);
        g.drawRect(70, 250, 30, 50);
        g.drawRect(120, 250, 30, 50);
        g.drawRect(170, 250, 30, 50);
    }
}