package quizapplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class quizQuestion extends JFrame implements ActionListener {

    String [][]questions = new String[10][5];
    String [][]answers = new String[10][2];
    String [][]userAnswers = new String[10][1];
    JButton submit, next;
    JLabel qno, question, textTime;
    JRadioButton op1, op2, op3, op4;
    ButtonGroup groupOption;
    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;

    quizQuestion(){

        getContentPane().setBackground(new Color(204, 219, 216));
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, -130, 1050, 350);
        add(image);

        qno = new JLabel();
        qno.setBounds(100, 280, 50, 30);
        qno.setFont(new Font("",Font.BOLD, 20));
        add(qno);

        question = new JLabel();
        question.setBounds(140, 280, 800, 30);
        question.setFont(new Font("",Font.PLAIN, 20));
        add(question);

        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";

        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";

        op1 = new JRadioButton();
        op1.setBounds(180, 320, 280, 30);
        op1.setBackground(new Color(204, 219, 216));
        op1.setFont(new Font("Dialog", Font.PLAIN, 18));
        add(op1);

        op2 = new JRadioButton();
        op2.setBounds(180, 350, 280, 30);
        op2.setBackground(new Color(204, 219, 216));
        op2.setFont(new Font("Dialog", Font.PLAIN, 18));
        add(op2);

        op3 = new JRadioButton();
        op3.setBounds(180, 380, 280, 30);
        op3.setBackground(new Color(204, 219, 216));
        op3.setFont(new Font("Dialog", Font.PLAIN, 18));
        add(op3);

        op4 = new JRadioButton();
        op4.setBounds(180, 410, 280, 30);
        op4.setBackground(new Color(204, 219, 216));
        op4.setFont(new Font("Dialog", Font.PLAIN, 18));
        add(op4);

        groupOption = new ButtonGroup();
        groupOption.add(op1);
        groupOption.add(op2);
        groupOption.add(op3);
        groupOption.add(op4);

        next = new JButton("Next");
        next.setBounds(780, 470, 90, 30);
        next.setBackground(new Color(53, 183, 255));
        next.addActionListener(this);
        add(next);

        submit = new JButton("Submit");
        submit.setBounds(780, 470, 90, 30);
        submit.setBackground(new Color(53, 183, 255));
        submit.addActionListener(this);
        submit.setVisible(false);
        submit.setEnabled(false);
        add(submit);

        start(count);

        setVisible(true);
        setSize(1050, 600);
        setLocation(275, 110);
    }

    public void  start(int count){
        qno.setText(""+(count+1)+". ");
        question.setText(questions[count][0]);
        op1.setText(questions[count][1]);
        op1.setActionCommand(questions[count][1]);
        op2.setText(questions[count][2]);
        op2.setActionCommand(questions[count][2]);
        op3.setText(questions[count][3]);
        op3.setActionCommand(questions[count][3]);
        op4.setText(questions[count][4]);
        op4.setActionCommand(questions[count][4]);

        groupOption.clearSelection();
    }

    public void  paint(Graphics g){
        super.paint(g);
        String textTime = "Time Left: ";
        String time = timer+"";
        g.setColor(Color.BLACK);
        g.setFont(new Font("", Font.BOLD, 18));
        if(timer>0){
            g.drawString(textTime, 745, 290);
            g.drawString(time, 838, 290);
        }else{
            g.drawString("Times Up!", 750, 290);
        }
        timer--;
        try{
            Thread.sleep(1000);
            repaint();
        }catch (Exception e){
            e.printStackTrace();
        }

        if(ans_given == 1){
            ans_given = 0;
            timer = 15;
        }else if(timer<0){
            timer = 15;
            if(groupOption.getSelection()==null){
                userAnswers[count][0]="";
            }else{
                userAnswers[count][0]=groupOption.getSelection().getActionCommand();
            }
            count++;
            start(count);
        }

    }

    public void  actionPerformed(ActionEvent click){
        if(click.getSource()==next){
            repaint();
            ans_given =1;
            if(groupOption.getSelection()==null){
                userAnswers[count][0]="";
            }else{
                userAnswers[count][0]=groupOption.getSelection().getActionCommand();
            }

        }else if(click.getSource()==submit){

        }
        if(count==8){
            next.setVisible(false);
            next.setEnabled(false);
            submit.setVisible(true);
            submit.setEnabled(true);
        }
        count++;
        start(count);
    }
    public static void main(String[] args) {
        new quizQuestion();
    }

}
