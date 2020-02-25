package H012;

import java.awt.*;
import java.applet.*;

public class ButtonArray extends Applet {
    double[] array;

    public void init() {
        array = new double[10];
        array[0] = 100;
        array[1] = 200;
        array[2] = 300;
        array[3] = 400;
        array[4] = 500;
        array[5] = 600;
        array[6] = 700;
        array[7] = 800;
        array[8] = 900;
        array[9] = 1000;
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < array.length; teller ++)
            g.drawString("" + array[teller], 50, 20 * teller + 20);
    }
}