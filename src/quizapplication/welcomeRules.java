package quizapplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class welcomeRules extends JFrame implements  ActionListener{
    JButton next, back;
    String name;

    welcomeRules(String name){
        this.name = name;

        getContentPane().setBackground(new Color(204, 219, 216));
        setLayout(null);

        JLabel heading = new JLabel("Welcome "+name +" to Quiz Cloud");
        heading.setBounds(375, 75, 550, 30);
        heading.setFont(new Font("", Font.BOLD, 22));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(100, 70, 850, 320);
        rules.setFont(new Font("", Font.PLAIN, 16));
        rules.setText(
                "<html>"+
                        "<b>Read The Following Rules CareFully:</b>"+"<br><br>"+
                        "1. The participant shall have a quota of 10 (FIVE) questions in total."+"<br>"+
                        "2. The participant shall get 20 SECONDS to answer each question and shall be awarded 5 POINTS for a CORRECT answer."+"<br>"+
                        "3. If the participant gives a WRONG answer, the QUIZ MASTER shall give the CORRECT answer."+"<br>"+
                        "4. If the participant passes the question, there shall be no points awarded, and the next question will be given."+"<br>"+
                        "5. The participant can NOT DISCUSS with anyone else and must answer on their own."+"<br>"+
                        "6. If the participant FAILS to answer a question, they can PASS it, and no points will be awarded."+"<br>"+
                        "7. There shall be NO NEGATIVE markings for a WRONG answer."+"<br>"+
                        "<html>");
        add(rules);

        back = new JButton("Back");
        back.setBounds(310, 430, 80, 30);
        back.setBackground(new Color(53, 183, 255));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        next = new JButton("Next");
        next.setBounds(625, 430, 80, 30);
        next.setBackground(new Color(53, 183, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        setVisible(true);
        setSize(1050, 600);
        setLocation(275, 110);
    }

    public void actionPerformed(ActionEvent click){
        if(click.getSource()==next){
            setVisible(false);
            new quizQuestion(name);
        }else if(click.getSource()==back){
            setVisible(false);
            new login();
        }
    }
    public static void main(String[] args) {
        new welcomeRules("User");
    }
}
