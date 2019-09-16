package h04;

import java.awt.*;
import java.applet.*;

public class Grafiek extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(50, 100, 50, 300);
        g.drawLine(50, 300, 250, 300);
        g.drawRect(70, 220, 30, 80);
        g.drawRect(120, 100, 30, 200);
        g.drawRect(170, 140, 30, 160);
        g.setColor(Color.yellow);
        g.fillRect(70, 220, 30, 80);
        g.setColor(Color.blue);
        g.fillRect(120, 100, 30, 200);
        g.setColor(Color.red);
        g.fillRect(170, 140, 30, 160);
        g.setColor(Color.black);
        g.drawLine(45, 300, 55, 300);
        g.drawLine(45, 260, 55, 260);
        g.drawLine(45, 220, 55, 220);
        g.drawLine(45, 180, 55, 180);
        g.drawLine(45, 140, 55, 140);
        g.drawString("20",30,260);
        g.drawString("40",30,220);
        g.drawString("60",30,180);
        g.drawString("80",30,140);
        g.drawString("100",30,100);
        g.drawString("0",30,300);
        g.drawString("Valerie",70,310);
        g.drawString("Jeroen",120,310);
        g.drawString("Hans",170,310);

    }
}