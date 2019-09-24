package H06;

import java.awt.*;
import java.applet.*;


public class RekenSeconden extends Applet {
    int a;
    int b;
    int uitkomstuur;
    int c;
    int d;
    int uitkomstdag;
    int uitkomstjaar;

    public void init() {
        a = 60;
        b = 60;
        uitkomstuur = a * b;
        c = 24;
        uitkomstdag = c * uitkomstuur;
        d = 365;
        uitkomstjaar = d * uitkomstdag;
    }

    public void paint(Graphics g) {
        g.drawString("Seconden in een uur: " + uitkomstuur, 20, 20);
        g.drawString("Seconden in een dag: " + uitkomstdag, 20, 30);
        g.drawString("Seconden in een jaar: " + uitkomstjaar, 20, 40);

    }

}