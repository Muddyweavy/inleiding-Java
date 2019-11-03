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

    //textfields
    TextField tekstvak1;
    TextField tekstvak2;
    TextField tekstvak3;
    TextField tekstvak4;

    public void init() {

        //Toevoegen
        tekstvak1 = new TextField("+", 40);
        tekstvak2 = new TextField("-", 40);
        tekstvak3 = new TextField("*", 40);
        tekstvak4 = new TextField("/", 40);
        knop1 = new Button("+");
        knop1.addActionListener( new Knop1Listener() );
        knop2 = new Button("-");
        knop2.addActionListener( new Knop2Listener() );
        knop3 = new Button("*");
        knop3.addActionListener( new Knop3Listener() );
        knop4 = new Button("/");
        knop4.addActionListener( new Knop4Listener() );

        //visuals
        add(knop1);
        add(knop2);
        add(knop3);
        add(knop4);

        //tellers


    }

    public void paint(Graphics g) {

    }

    class Knop1Listener implements ActionListener {

        public void actionPerformed( ActionEvent e ) {
            repaint();
        }
    }

    class Knop2Listener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            repaint();
        }
    }

    class Knop3Listener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            repaint();
        }
    }

    class Knop4Listener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            repaint();
        }
    }
}

