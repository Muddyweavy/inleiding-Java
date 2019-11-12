package H08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Rekenmachine extends Applet{

    //buttons
    Button knop1;
    Button knop2;
    Button knop3;
    Button knop4;

    //Rekencijfers
    double getal1;
    double getal2;
    double uitkomst;
    //textfields
    TextField tekstvak1;
    TextField tekstvak2;


    public void init() {

        //Toevoegen
        tekstvak1 = new TextField("", 10);
        tekstvak2 = new TextField("", 10);
        knop1 = new Button("+");
        knop1.addActionListener( new Knop1Listener() );
        knop2 = new Button("-");
        knop2.addActionListener( new Knop2Listener() );
        knop3 = new Button("*");
        knop3.addActionListener( new Knop3Listener() );
        knop4 = new Button("/");
        knop4.addActionListener( new Knop4Listener() );

        //visuals
        add(tekstvak1);
        add(tekstvak2);
        add(knop1);
        add(knop2);
        add(knop3);
        add(knop4);



    }

    public void paint(Graphics g) {
        g.drawString("antwoord: " + uitkomst, 20, 50);
    }

    class Knop1Listener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String userInput1 = tekstvak1.getText();
            getal1 = Double.parseDouble(userInput1);
            String userInput2 = tekstvak2.getText();
            getal2 = Double.parseDouble(userInput2);
            uitkomst = getal1 + getal2;
            repaint();
        }
    }

    class Knop2Listener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            String userInput1 = tekstvak1.getText();
            getal1 = Double.parseDouble(userInput1);
            String userInput2 = tekstvak2.getText();
            getal2 = Double.parseDouble(userInput2);
            uitkomst = getal1 - getal2;
            repaint();
            repaint();
        }
    }

    class Knop3Listener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            String userInput1 = tekstvak1.getText();
            getal1 = Double.parseDouble(userInput1);
            String userInput2 = tekstvak2.getText();
            getal2 = Double.parseDouble(userInput2);
            uitkomst = getal1 * getal2;
            repaint();
            repaint();
        }
    }

    class Knop4Listener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            String userInput1 = tekstvak1.getText();
            getal1 = Double.parseDouble(userInput1);
            String userInput2 = tekstvak2.getText();
            getal2 = Double.parseDouble(userInput2);
            uitkomst = getal1 / getal2;
            repaint();
            repaint();
        }
    }
}

