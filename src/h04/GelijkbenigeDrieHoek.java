package h04;

import java.awt.*;
import java.applet.*;

public class GelijkbenigeDrieHoek extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(50, 120, 250, 120);
        g.drawLine(150, 30, 50, 120);
        g.drawLine(150, 30, 250, 120);
    }
}
