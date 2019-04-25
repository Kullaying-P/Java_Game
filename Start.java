import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * Start
 */
public class Start extends JFrame {
    public Start() {
        super("Ragnarok");
        Container c = getContentPane();
        c.setLayout(new GridLayout(4,1));
      
        JPanel s2 = new JPanel();
        s2.setLayout(new FlowLayout());
        JLabel name = new JLabel("Enter Name : ");
        JTextField enter = new JTextField(25);
        s2.add(name);
        s2.add(enter);
       
        ImageIcon male = new ImageIcon("Male.gif");
        ImageIcon female = new ImageIcon("Female.gif");
        ImageIcon logo = new ImageIcon("Logo.png");
        JLabel maleImage = new JLabel(male);
        JLabel femaleImage = new JLabel(female);
        JLabel logoImage = new JLabel(logo);
       
        JPanel s1 = new JPanel();
        s1.setLayout(new FlowLayout());
        s1.add(logoImage);
       
        JPanel s3 = new JPanel();
        s3.setLayout(new GridLayout(1,2));
        s3.add(maleImage);
        s3.add(femaleImage);
       
        JPanel s4 = new JPanel();
        s4.setLayout(new GridLayout(1,2));
        JButton setMale = new JButton("Play as Male");
        JButton setFemale = new JButton("Play as Female");
        JPanel buttonMale = new JPanel();
        JPanel buttonFemale = new JPanel();
        buttonMale.add(setMale);
        buttonFemale.add(setFemale);
        s4.add(buttonMale);
        s4.add(buttonFemale);
       
        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s4);
        setFemale.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                new Monster(new NoviceFemale(enter.getText()));
                dispose();
            }
        });
        setMale.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                new Monster(new NoviceMale(enter.getText()));
                dispose();
            }
        });
        setSize(600,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
