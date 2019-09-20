package Ho5;

import java.awt.*;
import java.applet.*;

public class Variablen extends Applet{
    Color Colouring;
    Color lineart;
    int breedte;
    int hoogte;

    public void init() {
        Colouring = Color.MAGENTA;
        lineart = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        g.drawRect(100, 100, breedte, hoogte);
        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
        g.setColor(Colouring);
        g.fillRect(315, 100, breedte, hoogte);
        g.setColor(lineart);
        g.drawOval(315, 100, breedte, hoogte);
        g.setColor(Colouring);
        g.fillOval(315, 225, breedte, hoogte);
    }
}

