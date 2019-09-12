package h04;

        import java.awt.*;
        import java.applet.*;

public class JavaDrawing extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawRect(120, 120, 100, 100);
        g.drawRect(130, 190, 20, 30);
        g.drawLine(120, 120, 170, 70);
        g.drawLine(170, 70, 220, 120);
        g.drawRoundRect(170, 150, 40, 40, 10, 10);
    }
}
