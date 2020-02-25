package H08;

        import java.awt.*;
        import java.applet.*;
        import java.awt.event.ActionListener;
        import java.awt.event.ActionEvent;

public class Knoppen extends Applet {
    Button knop1;
    Button knop2;
    TextField tekstvak;
    String userInput;


    public void init() {
        tekstvak = new TextField("", 20);
        knop1 = new Button();
        knop1.setLabel("ok");
        knop2 = new Button();
        knop2.setLabel("Reset");
        userInput = "Vul wat tekst in het tekstvak en druk op enter of ok";

        // in beeld brengen
        add(tekstvak);
        add(knop1);
        add(knop2);

        // Listener
        tekstvak.addActionListener(new Knop1Listener());
        knop1.addActionListener(new Knop1Listener());
        knop2.addActionListener(new Knop2Listener());
    }

    public void paint(Graphics g) {
        g.drawString(userInput, 20, 50);


    }

    class Knop1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            userInput = tekstvak.getText();
            repaint();

        }
    }
    class Knop2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText(" ");
            userInput = "HA de tekst is weg";
            repaint();
        }
    }
}
