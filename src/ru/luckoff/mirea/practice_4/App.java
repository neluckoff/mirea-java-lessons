package ru.luckoff.mirea.practice_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    private int score1 = 0;
    private int score2 = 0;

    JButton but1 = new JButton("AC Milan");
    JButton but2 = new JButton("Real Madrid");

    JLabel lab1 = new JLabel("Result: " + score1 + " X " + score2, SwingConstants.CENTER);
    JLabel lab2 = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
    JLabel lab3 = new JLabel("Winner: DRAW", SwingConstants.CENTER);

    public App() {
        super("Football Scorer");
        this.setBounds(200, 200, 500, 500);
        Container pane = this.getContentPane();
        pane.setLayout(new GridLayout(3, 3, 1, 1));
        pane.setBackground(new Color(0, 191, 255));
        pane.add(but1);
        pane.add(but2);
        but1.addActionListener(new ClickBut1());
        but2.addActionListener(new ClickBut2());
        but1.setBackground(new Color(0, 149, 182));
        but2.setBackground(new Color(0, 149, 182));

        pane.add(but1);
        pane.add(but2);
        pane.add(lab1);
        pane.add(lab2);
        pane.add(lab3);
    }

    class ClickBut1 implements ActionListener{
        public void actionPerformed(ActionEvent event){
            score1+=1;
            lab1.setText("Result: " + score1 + " X " + score2);
            lab2.setText("Last Scorer: AC Milan");

            if (score1 > score2) {
                lab3.setText("Winner: AC Milan");
            } else if (score1 < score2) {
                lab3.setText("Winner: Real Madrid");
            } else if (score1 == score2) {
                lab3.setText("Winner: DRAW");
            }
        }
    }

    class ClickBut2 implements ActionListener{
        public void actionPerformed(ActionEvent event){
            score2+=1;
            lab1.setText("Result: " + score1 + " X " + score2);
            lab2.setText("Last Scorer: Real Madrid");

            if (score1 > score2) {
                lab3.setText("Winner: AC Milan");
            } else if (score1 < score2) {
                lab3.setText("Winner: Real Madrid");
            } else if (score1 == score2) {
                lab3.setText("Winner: DRAW");
            }
        }
    }
}
