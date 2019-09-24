package H06;

import java.awt.*;
import java.applet.*;


public class RekenNegatiefen extends Applet {
    int a;
    int b;
    int uitkomst;

    public void init() {
        a = 2147483647;
        b = 2147483647;
        uitkomst = a + b;
    }

    public void paint(Graphics g) {
        g.drawString("antwoord is: " + uitkomst, 20, 20);
    }
}