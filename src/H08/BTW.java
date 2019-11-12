package H08;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextField;

public class BTW extends Applet {
    Button knop1;
    TextField tekstvak;
    double prijs;
    double uitkomst;


    public void init() {
        tekstvak = new TextField("", 10);
        knop1 = new Button();
        knop1.setLabel("Bereken");
        prijs = 0;
        uitkomst = 0;

        // in beeld brengen
        add(tekstvak);
        add(knop1);

        // Listener
        knop1.addActionListener(new Knop1Listener());

        //rekenmachine



    }

    public void paint(Graphics g) {
        g.drawString(prijs + "+ 21% btw =" + uitkomst, 20, 50);



    }

    class Knop1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInput = tekstvak.getText();
            prijs = Double.parseDouble(userInput);
            uitkomst = prijs / 100 * 21 + prijs;
            repaint();
        }

    }

}
