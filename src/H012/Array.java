package H012;

import java.awt.*;
import java.applet.*;

public class Array extends Applet {
    double[] array;
    int uitkomst;

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
        uitkomst = (int) ((array[0] + array[1] + array[2] + array[3] + array[4] + array[5] + array[6] + array[7] + array[8] + array[9]) / 10);
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < array.length; teller ++)
            g.drawString("" + array[teller], 50, 20 * teller + 20);
            g.drawString("gemiddelde =" + uitkomst, 90, 20);
        }
    }