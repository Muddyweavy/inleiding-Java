package H010;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Schikkeljaar extends Applet {

    TextField tekstvakmaand;
    TextField tekstvakjaar;
    Label label;
    string aantaldagen;
    int cijfer;

    public void init() {
        tekstvakmaand = new TextField("", 20);
        tekstvakjaar = new TextField("", 20);
        label = new Label("Vul een maandnummer en jaar in en druk op enter");
        tekstvakjaar.addActionListener(new TekstvakListener());
        tekst = "";
        add(label);
        add(tekstvakmaand);
        add(tekstvakjaar);
    }

    public void paint(Graphics g) {
        g.drawString(aantaldagen, 50, 60);
    }

    class TekstvakListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int maand = Integer.parseInt(tekstvakmaand.getText());
            int jaartal = Integer.parseInt(tekstvakjaar.getText());

            s = tekstvakmaand.getText();
            cijfer = Integer.parseInt(s);
            switch (cijfer) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 10:
                case 12:
                    aantaldagen = 31; break;
                case 4:
                case 6:
                case 9:
                case 11:
                    aantaldagen = 30; break;
                case 2:
                    if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) || jaartal % 400 == 0 ) {
                        aantaldagen = 28;
                    } else {
                        aantaldagen = 29;
                    } break;
                }
            repaint();
        }
    }
}