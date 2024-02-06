package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.decode("#E5FFCC"));
        setLayout(null);
        
        JLabel heading = new JLabel("Rules Of The ONLINE QUIZ");
        heading.setBounds(180, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. Participation in the quiz is free and open to all persons above 18 years old. " + "<br><br>" +
                "2. The quiz consists in a multiple choice questionnaire on the fundamental rights of the child. " + "<br><br>" +
                "3. The persons who have given incomplete or inaccurate personal and contact details will be disqualified for the draw, as will be the "
                    + "persons who refuse that their personal details – which are necessary for the game – be collected, kept and used." + "<br><br>" +
                "4. Participation in the quiz implies that participants accept the integrality of these rules. "
                    + "Non-compliance with the rules results in the automatic cancellation of the participation in the quiz and of the candidacy for the prize." + "<br><br>" +
                "5. You have 50-50 lifeline option. You can choose only for one time this option. " + "<br><br>" +
                "6. You have to answer 10 questions and for each questions you have 15 seconds only... " + "<br><br>" +
                 
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(250, 50);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}