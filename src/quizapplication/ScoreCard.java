package quizapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScoreCard extends JFrame implements ActionListener {
    ScoreCard(String name, int score) {
        getContentPane().setBackground(new Color(204, 219, 216));
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, -130, 1050, 350);
        add(image);

        JLabel heading = new JLabel("Thank You " + name + " for playing Simple Minds");
        heading.setBounds(300, 270, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);

        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(420, 320, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(lblscore);

        JButton submit = new JButton("Play Again");
        submit.setBounds(450, 370, 120, 30);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        setVisible(true);
        setSize(1050, 600);
        setLocation(275, 110);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new login();
    }
    public static void main(String[] args) {
        new ScoreCard("User", 0);
    }
}
