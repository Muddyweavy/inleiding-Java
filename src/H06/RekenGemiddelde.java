package H06;

import java.awt.*;
import java.applet.*;


public class RekenGemiddelde extends Applet {
    double a;
    double b;
    double c;
    int aantal;
    double uitkomst;

    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        aantal = 3;
        uitkomst = (a + b + c) / aantal;
    }

    public void paint(Graphics g) {
        g.drawString("antwoord is: " + uitkomst, 20, 20);
    }
}