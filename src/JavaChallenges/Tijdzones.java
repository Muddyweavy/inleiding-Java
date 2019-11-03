package JavaChallenges;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Tijdzones extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int cijfer;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een uur in en druk op enter");
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
                    tekst = "Tijd in london: 24:00 " +
                            "Tijd in Tokyo 8:00 " +
                            "Tijd in New York: 19:00 " +
                            "Tijd in new sydney: 10:00 ";
                    break;
                case 2:
                    tekst = "Tijd in london: 1:00 " +
                            "Tijd in Tokyo 9:00 " +
                            "Tijd in New York: 20:00 " +
                            "Tijd in new sydney: 11:00 ";
                    break;
                case 3:
                    tekst = "Tijd in london: 2:00 " +
                            "Tijd in Tokyo 10:00 " +
                            "Tijd in New York: 21:00 " +
                            "Tijd in new sydney: 12:00 ";
                    break;
                case 4:
                    tekst = "Tijd in london: 3:00 " +
                            "Tijd in Tokyo 11:00 " +
                            "Tijd in New York: 22:00 " +
                            "Tijd in new sydney: 13:00 ";
                    break;
                case 5:
                    tekst = "Tijd in london: 4:00 " +
                            "Tijd in Tokyo 12:00 " +
                            "Tijd in New York: 23:00 " +
                            "Tijd in new sydney: 14:00 ";
                    break;
                case 6:
                    tekst = "Tijd in london: 5:00 " +
                            "Tijd in Tokyo 13:00 " +
                            "Tijd in New York: 24:00 " +
                            "Tijd in new sydney: 15:00 ";
                    break;
                case 7:
                    tekst = "Tijd in london: 6:00 " +
                            "Tijd in Tokyo 14:00 " +
                            "Tijd in New York: 1:00 " +
                            "Tijd in new sydney: 16:00 ";
                    break;
                case 8:
                    tekst = "Tijd in london: 7:00  " +
                            "Tijd in Tokyo 15:00 " +
                            "Tijd in New York: 2:00 " +
                            "Tijd in new sydney: 17:00 ";
                    break;
                case 9:
                    tekst = "Tijd in london: 8:00 " +
                            "Tijd in Tokyo 16:00 " +
                            "Tijd in New York: 3:00 " +
                            "Tijd in new sydney: 18:00 ";
                    break;
                case 10:
                    tekst = "Tijd in london: 9:00 " +
                            "Tijd in Tokyo 17:00 " +
                            "Tijd in New York: 4:00 " +
                            "Tijd in new sydney: 19:00 ";
                    break;
                case 11:
                    tekst = "Tijd in london: 10:00 " +
                            "Tijd in Tokyo 18:00 " +
                            "Tijd in New York: 5:00 " +
                            "Tijd in new sydney: 20:00 ";
                    break;
                case 12:
                    tekst = "Tijd in london: 11:00 " +
                            "Tijd in Tokyo 19:00 " +
                            "Tijd in New York: 6:00 " +
                            "Tijd in new sydney: 21:00 ";
                    break;
                case 13:
                    tekst = "Tijd in london: 12:00 " +
                            "Tijd in Tokyo 18:00 " +
                            "Tijd in New York: 5:00 " +
                            "Tijd in new sydney: 20:00 ";
                    break;
                case 14:
                    tekst = "Tijd in london: 13:00 " +
                            "Tijd in Tokyo 19:00 " +
                            "Tijd in New York: 6:00 " +
                            "Tijd in new sydney: 21:00 ";
                    break;
                case 15:
                    tekst = "Tijd in london: 14:00 " +
                            "Tijd in Tokyo 20:00 " +
                            "Tijd in New York: 7:00 " +
                            "Tijd in new sydney: 22:00 ";
                    break;
                case 16:
                    tekst = "Tijd in london: 15:00 " +
                            "Tijd in Tokyo 21:00 " +
                            "Tijd in New York: 8:00 " +
                            "Tijd in new sydney: 23:00 ";
                    break;
                case 17:
                    tekst = "Tijd in london: 16:00 " +
                            "Tijd in Tokyo 22:00 " +
                            "Tijd in New York: 9:00 " +
                            "Tijd in new sydney: 24:00 ";
                    break;
                case 18:
                    tekst = "Tijd in london: 17:00 " +
                            "Tijd in Tokyo 23:00 " +
                            "Tijd in New York: 10:00 " +
                            "Tijd in new sydney: 1:00 ";
                    break;
                case 19:
                    tekst = "Tijd in london: 18:00 " +
                            "Tijd in Tokyo 24:00 " +
                            "Tijd in New York: 11:00 " +
                            "Tijd in new sydney: 2:00 ";
                    break;
                case 20:
                    tekst = "Tijd in london: 19:00 " +
                            "Tijd in Tokyo 1:00 " +
                            "Tijd in New York: 12:00 " +
                            "Tijd in new sydney: 3:00 ";
                    break;
                case 21:
                    tekst = "Tijd in london: 20:00 " +
                            "Tijd in Tokyo 2:00 " +
                            "Tijd in New York: 13:00 " +
                            "Tijd in new sydney: 4:00 ";
                    break;
                case 22:
                    tekst = "Tijd in london: 21:00 " +
                            "Tijd in Tokyo 3:00 " +
                            "Tijd in New York: 14:00 " +
                            "Tijd in new sydney: 5:00 ";
                    break;
                case 23:
                    tekst = "Tijd in london: 22:00 " +
                            "Tijd in Tokyo 4:00 " +
                            "Tijd in New York: 15:00 " +
                            "Tijd in new sydney: 6:00 ";
                    break;
                case 24:
                    tekst = "Tijd in london: 23:00 " +
                            "Tijd in Tokyo 5:00 " +
                            "Tijd in New York: 16:00 " +
                            "Tijd in new sydney: 7:00 ";
                    break;
                default:
                    tekst = "Ongeldige tijd";
                    break;
            }
            repaint();
        }
    }
}