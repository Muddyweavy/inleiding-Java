package H08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Teller extends Applet{

    //buttons
    Button knopman;
    Button knopvrouw;
    Button knopjongen;
    Button knopmeisje;

    //textfields
    TextField tekstvak1;
    TextField tekstvak2;
    TextField tekstvak3;
    TextField tekstvak4;

    //tellers
    int teller1;
    int teller2;
    int teller3;
    int teller4;
    int tellerall;
    String man, vrouw, jongen, meisje;

    public void init() {

        //Toevoegen
        tekstvak1 = new TextField("Man ", 40);
        tekstvak2 = new TextField("Vrouw ", 40);
        tekstvak3 = new TextField("Jongen ", 40);
        tekstvak4 = new TextField("meisje ", 40);
        knopman = new Button("Man ");
        knopman.addActionListener( new Knop1Listener() );
        knopvrouw = new Button("Vrouw ");
        knopvrouw.addActionListener( new Knop2Listener() );
        knopjongen = new Button("Jongen");
        knopjongen.addActionListener( new Knop3Listener() );
        knopmeisje = new Button("Meisje ");
        knopmeisje.addActionListener( new Knop4Listener() );

        //visuals
        add(knopman);
        add(knopvrouw);
        add(knopjongen);
        add(knopmeisje);

        //tellers
        teller1=0;
        teller2=0;
        teller3=0;
        teller4=0;
        tellerall=0;
    }

    public void paint(Graphics g) {
        g.drawString("Man " +teller1, 50,60);
        g.drawString("Vrouw " +teller2, 50,80);
        g.drawString("Jongen " +teller3, 50,100);
        g.drawString("Meisje " +teller4, 50,120);
        g.drawString("Totaal " +tellerall, 50,140);
    }

    class Knop1Listener implements ActionListener {

        public void actionPerformed( ActionEvent e ) {
            teller1++;
            man = tekstvak1.getText();
            tellerall++;
            repaint();
        }
    }

    class Knop2Listener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            teller2++;
            vrouw = tekstvak2.getText();
            tellerall++;
            repaint();
        }
    }

    class Knop3Listener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            teller3++;
            jongen = tekstvak3.getText();
            tellerall++;
            repaint();
        }
    }

    class Knop4Listener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            teller4++;
            meisje = tekstvak4.getText();
            tellerall++;
            repaint();
        }
    }
}
