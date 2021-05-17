import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DesktopApp extends JFrame implements ActionListener{

    JButton Enkriptim;
    JButton Dekriptim;
    JTextField teksti;
    JTextField tBook;
    JTextField tekstiEnkriptuar;
    JTextField tBookiEnkriptuar;
    JTextField tekstiDekriptuar;
    JTextField tBookiDekriptuar;
    DesktopApp(){
        JLabel t = new JLabel("Shkruani Tekstin:");
        t.setBounds(75,65,300,40);
        teksti = new JTextField();
        teksti.setBounds(75, 100, 300, 40);
        JLabel tB = new JLabel("Shkruani Librin:");
        tB.setBounds(75,135,300,40);
        tBook = new JTextField();
        tBook.setBounds(75, 165, 300, 40);

        Enkriptim = new JButton("Enkripto");
        Enkriptim.setBounds(150,210,150,40);
        Enkriptim.addActionListener(this);
        JLabel tE = new JLabel("Teksti i Enkriptuar:");
        tE.setBounds(75,250,300,40);
        tekstiEnkriptuar = new JTextField();
        tekstiEnkriptuar.setBounds(75, 280, 300, 40);
        JLabel tBE = new JLabel("Libri i Enkriptuar:");
        tBE.setBounds(75,320,300,40);
        tBookiEnkriptuar = new JTextField();
        tBookiEnkriptuar.setBounds(75, 350, 300, 40);


        Dekriptim = new JButton("Dekripto");
        Dekriptim.setBounds(150,400,150,40);
        Dekriptim.addActionListener(this);
        JLabel tD = new JLabel("Teksti i Dekriptuar:");
        tD.setBounds(75,440,300,40);
        tekstiDekriptuar = new JTextField();
        tekstiDekriptuar.setBounds(75, 470, 300, 40);
        JLabel tBD = new JLabel("Libri i Dekriptuar:");
        tBD.setBounds(75,500,300,40);
        tBookiDekriptuar = new JTextField();
        tBookiDekriptuar.setBounds(75, 530, 300, 40);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Window App");
        this.setSize(700,700);
        this.setVisible(true);
        this.setLayout(null);
        this.add(t);
        this.add(tB);
        this.add(teksti);
        this.add(tBook);
        this.add(Enkriptim);
        this.add(tekstiEnkriptuar);
        this.add(tBookiEnkriptuar);
        this.add(tE);
        this.add(tBE);
        this.add(Dekriptim);
        this.add(tekstiDekriptuar);
        this.add(tBookiDekriptuar);
        this.add(tD);
        this.add(tBD);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Enkriptim){
            Enkriptimi Enkripto = new Enkriptimi();
            Enkripto.Encrypt(teksti.toString(), tBook.toString());

        }
        if(e.getSource()==Dekriptim){
        	

        }
    }
}