package JavaChallenges;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Grafiek extends Applet {
    Button knop1;
    Button knop2;
    Button knop3;
    TextField tekstvak;
    TextField tekstvak2;
    TextField tekstvak3;
    Label label;
    Label label2;
    Label label3;
    int GewichtH;
    int GewichtV;
    int GewichtJ;
    String s1;
    String s2;
    String s3;



    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak2 = new TextField("", 20);
        tekstvak3 = new TextField("", 20);
        knop1 = new Button();
        knop1.setLabel( "toon" );
        label = new Label("Vul gewicht in");
        KnopListener kl = new KnopListener();
        knop1.addActionListener(kl);
        add(tekstvak);
        add(label);
        add(tekstvak);
        add(tekstvak2);
        add(tekstvak3);
        add(knop1);
        GewichtJ = 100;
        GewichtV = 100;
        GewichtH = 100;
    }

    public void paint(Graphics g) {
        g.drawLine(50, 200, 50, 300);
        g.drawLine(50, 300, 250, 300);
        g.setColor(Color.yellow);
        g.fillRect(70, 300-GewichtV, 30, GewichtV);
        g.setColor(Color.blue);
        g.fillRect(120, 300-GewichtJ, 30, GewichtJ);
        g.setColor(Color.red);
        g.fillRect(170, 300-GewichtH, 30, GewichtH);
        g.setColor(Color.black);
        g.drawRect(70, 300-GewichtV, 30, GewichtV);
        g.drawRect(120, 300-GewichtJ, 30, GewichtJ);
        g.drawRect(170, 300-GewichtH, 30, GewichtH);
        g.drawLine(45, 300, 55, 300);
        g.drawLine(45, 280, 55, 280);
        g.drawLine(45, 260, 55, 260);
        g.drawLine(45, 240, 55, 240);
        g.drawLine(45, 220, 55, 220);
        g.drawString("Valerie",450,62);
        g.drawString("Jeroen",650,62);
        g.drawString("Hans",850,62);
        g.drawString("20",30,280);
        g.drawString("40",30,260);
        g.drawString("60",30,240);
        g.drawString("80",30,220);
        g.drawString("100",30,200);
        g.drawString("0",30,300);
        g.drawString("Valerie",70,310);
        g.drawString("Jeroen",120,310);
        g.drawString("Hans",170,310);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s1 = tekstvak.getText();
            GewichtV = Integer.parseInt(s1);
            String s2 = tekstvak2.getText();
            GewichtJ = Integer.parseInt(s2);
            String s3 = tekstvak3.getText();
            GewichtH = Integer.parseInt ( s3 );
            repaint();
        }
    }
}

