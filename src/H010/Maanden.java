package H010;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Maanden extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int cijfer;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het cijfer en druk op enter");
        tekstvak.addActionListener(new TekstvakListener());
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            cijfer = Integer.parseInt(s);
            switch (cijfer) {
                case 1:
                    tekst = "Januari 31";
                    break;
                case 2:
                    tekst = "Februari 28";
                    break;
                case 3:
                    tekst = "Maart 31";
                    break;
                case 4:
                    tekst = "April 30";
                    break;
                case 5:
                    tekst = "Mei 31";
                    break;
                case 6:
                    tekst = "Juni 30";
                    break;
                case 7:
                    tekst = "juli 31";
                    break;
                case 8:
                    tekst = "augustus 31";
                    break;
                case 9:
                    tekst = "september 30";
                    break;
                case 10:
                    tekst = "oktober 31";
                    break;
                case 11:
                    tekst = "november 30";
                    break;
                case 12:
                    tekst = "december 31";
                    break;
                default:
                    tekst = "Kies een cijfer tussen 1 en 12";
                    break;
            }
            repaint();
        }
    }
}