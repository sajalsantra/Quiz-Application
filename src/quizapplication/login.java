package quizapplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener {

    JButton next, exit;
    JTextField inputName;

    login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 500, 480);
        add(image);

        JLabel heading = new JLabel("Quiz Cloud");
        heading.setBounds(670, 60, 300, 45);
        heading.setFont(new Font("", Font.BOLD, 40));
        add(heading);

        JLabel name = new JLabel("ENTER YOUR NAME ");
        name.setBounds(710, 140, 300, 45);
        name.setFont(new Font("", Font.PLAIN, 15));
        add(name);

        inputName = new JTextField();
        inputName.setBounds(685, 180, 200, 25);
        inputName.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        add(inputName);

        next = new JButton("Next");
        next.setBounds(685, 240, 80, 30);
        next.setBackground(new Color(53, 183, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        exit = new JButton("Exit");
        exit.setBounds(805, 240, 80, 30);
        exit.setBackground(new Color(53, 183, 255));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);

        setVisible(true);
        setSize(1050, 500);
        setLocation(275, 150);

    }

    public void actionPerformed(ActionEvent click){
        if(click.getSource()==next){
            String name = inputName.getText();
            setVisible(false);
            new welcomeRules(name);
        }else if(click.getSource()==exit){
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new login();
    }
}
