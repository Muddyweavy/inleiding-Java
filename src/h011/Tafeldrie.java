package h011;

import java.awt.*;
import java.applet.*;


public class Tafeldrie extends Applet {


    public void init() {}

    public void paint(Graphics g) {
        int teller = 3;
        int y = 0;

        while(teller < 31) {
            y += 20;
            g.drawString("",20,20);
            g.drawString("" + teller, 30, y );
            teller++;
            teller++;
            teller++;
        }
    }
}