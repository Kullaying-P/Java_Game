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
/**
 * Monster
 */
public class Monster extends JFrame {
    public Monster(Novice novice) {
        super("Ragnarok");
        Container c = getContentPane();
        c.setLayout(new GridLayout(4,1));
        JPanel m2 = new JPanel();
        m2.setLayout(new FlowLayout());
        JLabel textMonster = new JLabel("Select Monster To Attack");
        m2.add(textMonster);
        ImageIcon logo = new ImageIcon("Logo.png");
        ImageIcon poring = new ImageIcon("Poring.gif");
        ImageIcon thiefbug = new ImageIcon("Thiefbug.gif");
        JLabel logoImage = new JLabel(logo);
        JLabel monster1 = new JLabel(poring);
        JLabel monster2 = new JLabel(thiefbug);

        JPanel m1 = new JPanel();
        m1.setLayout(new FlowLayout());
        m1.add(logoImage);

        JPanel m3 = new JPanel();
        m3.setLayout(new GridLayout(1,2));
        m3.add(monster1);
        m3.add(monster2);

        JPanel m4 = new JPanel();
        m4.setLayout(new GridLayout(1,2));
        JButton setMonster1 = new JButton("Poring");
        JButton setMonster2 = new JButton("ThiefBug");
        JPanel buttonMonster1 = new JPanel();
        JPanel buttonMonster2 = new JPanel();
        buttonMonster1.add(setMonster1);
        buttonMonster2.add(setMonster2);
        m4.add(buttonMonster1);
        m4.add(buttonMonster2);

        c.add(m1);
        c.add(m2);
        c.add(m3);
        c.add(m4);
        setMonster1.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                new Fighting(new Poring(),novice);
                dispose();
            }
        });
        setMonster2.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                new Fighting(new Thiefbug(),novice);
                dispose();
            }
        });
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     
}