package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        setBounds(300, 150, 750, 550);
        getContentPane().setBackground(Color.decode("#E5FFCC"));
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score1.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(10, 150, 300, 280);
        add(image);
        
        JLabel heading = new JLabel("Thankyou " + name + " for playing this Quiz");
        heading.setBounds(100, 30, 500, 50);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);
        
        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(400, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.BOLD, 26));
        add(lblscore);
        
        JButton submit = new JButton("Play Again");
        submit.setBounds(438, 270, 120, 30);
        submit.setBackground(new Color(64, 64, 64));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}