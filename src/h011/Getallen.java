package h011;

import java.awt.*;
import java.applet.*;


public class Getallen extends Applet {


    public void init() {}

    public void paint(Graphics g) {
        int teller = 1;
        int y = 0;

        while(teller < 11) {
            y += 20;
            g.drawString("",20,20);
            g.drawString("" + teller, 30, y );
            teller++;
        }
    }
}