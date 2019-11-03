package h011;

import java.awt.*;
import java.applet.*;


public class Tafeldrie extends Applet {

    public void init() {}

    int teller = 1;
    int y = 0;
    int uitkomst = 3 * teller;

    public void paint(Graphics g) {

        while(teller < 11) {
            y += 20;
            g.drawString(": ", 20, 10);
            g.drawString(""  + uitkomst, 30, y );
            teller++;
        }
    }
}