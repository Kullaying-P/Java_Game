import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Fighting
 */

public class Fighting extends JFrame {
    public Fighting(MonsterStatus monster,Novice novice) {
        super("Ragnarok");
        Container c = getContentPane();
        c.setLayout(new GridLayout(3,1));
        
        ImageIcon novicePic = new ImageIcon(novice.getPicture());
        ImageIcon monsterPic = new ImageIcon(monster.getPicture());
        ImageIcon logo = new ImageIcon("Logo.png");
        JLabel noviceImage = new JLabel(novicePic);
        JLabel monsterImage = new JLabel(monsterPic);
        JLabel logoImage = new JLabel(logo);
    
        JPanel y1 = new JPanel();
        y1.setLayout(new FlowLayout());
        y1.add(logoImage);

        JPanel y2 = new JPanel();
        y2.setLayout(new GridLayout(1,4));
        JPanel g1 = new JPanel();
        g1.setLayout(new FlowLayout());
        g1.add(noviceImage);

        JPanel g2 = new JPanel();
        g2.setLayout(new BoxLayout(g2, BoxLayout.Y_AXIS));
        JLabel noviceName = new JLabel("Name : " + novice.getName());
        JLabel noviceGender = new JLabel("Gender : " + novice.getGender());
        JLabel noviceHp = new JLabel("Hp : " + novice.getHp());
        JLabel noviceExp = new JLabel("Exp : " + novice.getExp());
        JLabel noviceLevel = new JLabel("Level : " + novice.getLevel());
        g2.add(noviceName);
        g2.add(noviceGender);
        g2.add(noviceHp);
        g2.add(noviceExp);
        g2.add(noviceLevel);

        JPanel g3 = new JPanel();
        g3.setLayout(new FlowLayout());
        g3.add(monsterImage);

        JPanel g4 = new JPanel();
        g4.setLayout(new BoxLayout(g4, BoxLayout.Y_AXIS));
        JLabel monsterName = new JLabel("Name : " + monster.getName());
        JLabel monsterHp = new JLabel("Hp : " + monster.getHp());
        g4.add(monsterName);
        g4.add(monsterHp);
       
        y2.add(g1);
        y2.add(g2);
        y2.add(g3);
        y2.add(g4);

        JPanel y3 = new JPanel();
        y3.setLayout(new FlowLayout());
        JButton setAttack = new JButton("Attack");
        JPanel buttonAttack = new JPanel();
        buttonAttack.add(setAttack);
        y3.add(buttonAttack);

        c.add(y1);
        c.add(y2);
        c.add(y3);
        setAttack.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                novice.getDamage();
                monster.getDamage();
                if(monster.getHp() == 0){
                    JOptionPane.showMessageDialog(c, "You Win!!");
                    dispose();
                    new Monster(novice);
                }
                if(novice.getHp() == 0){
                    JOptionPane.showMessageDialog(c, "You Lose!!");
                    novice.revive();
                }
                noviceHp.setText("Hp : " + novice.getHp());
                noviceExp.setText("Exp : " + novice.getExp());
                noviceLevel.setText("Level : " + novice.getLevel());
                monsterHp.setText("Hp : " + monster.getHp());
            }
        });
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}