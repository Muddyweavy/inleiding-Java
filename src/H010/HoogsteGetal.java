package H010;

import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class HoogsteGetal extends Applet {

    int getal;
    int hoogstegetal;
    int laagstegetal;
    TextField tekstvak;
    Label label;
    String tekst;
    String s;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener( new VakListener() );
        tekst = "";

        label = new Label("Full een getal in" );

        add( label );
        add( tekstvak );
    }

    public void paint(Graphics g) {
        g.drawString(String.valueOf(hoogstegetal), 150, 45 );
        g.drawString(String.valueOf(laagstegetal), 150, 60 );
    }


    class VakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            s = tekstvak.getText();
            getal = Integer.parseInt( s );
            if ( getal > hoogstegetal ) {
                hoogstegetal = getal;
                repaint();
            }
            else if (getal < laagstegetal) {
                laagstegetal = getal;
                repaint();
            }
            repaint();
        }
    }
}