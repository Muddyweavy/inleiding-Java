package H06;

import java.awt.*;
import java.applet.*;


public class Reken extends Applet {
    int a;
    int b;
    int uitkomst;

    public void init() {
        a = 100;
        b = 2;
        uitkomst = a * b;
    }

    public void paint(Graphics g) {
        g.drawString("antwoord is: " + uitkomst, 20, 20);
    }
}