package Ho5;

import java.awt.*;
import java.applet.*;

public class VariablenGrafiek extends Applet {
    int GewichtH;
    int GewichtH2;
    int GewichtV;
    int GewichtV2;
    int GewichtJ;
    int GewichtJ2;



    public void init() {
        GewichtJ = 200;
        GewichtJ2 = 100;
        GewichtV = 80;
        GewichtV2 = 220;
        GewichtH = 160;
        GewichtH2 = 140;
    }

    public void paint(Graphics g) {
        g.drawLine(50, 100, 50, 300);
        g.drawLine(50, 300, 250, 300);
        g.setColor(Color.yellow);
        g.fillRect(70, GewichtV2, 30, GewichtV);
        g.setColor(Color.blue);
        g.fillRect(120, GewichtJ2, 30, GewichtJ);
        g.setColor(Color.red);
        g.fillRect(170, GewichtH2, 30, GewichtH);
        g.setColor(Color.black);
        g.drawRect(70, GewichtV2, 30, GewichtV);
        g.drawRect(120, GewichtJ2, 30, GewichtJ);
        g.drawRect(170, GewichtH2, 30, GewichtH);
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