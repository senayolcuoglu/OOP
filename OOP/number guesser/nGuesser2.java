import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.Random;

public class nGuesser2 extends JFrame implements ActionListener{

    private JFrame frame;
    private JButton button;
    private JTextField guessNum;
    private JLabel label;
    private int randomNumber;
    private int myGuess;
    private int turn=1;

    public nGuesser2(){
        frame = new JFrame("NUMBER GUESSER!");

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());

        label = new JLabel();

        guessNum = new JTextField(4);

        button = new JButton("Guess");
        button.addActionListener(this);

        frame.add(label);
        frame.add(guessNum);
        frame.add(button);
        frame.setVisible(true);

        randomNumber = (int) (Math.random()*100+1); 
        myGuess = (int) Integer.parseInt(guessNum.getText());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

}
