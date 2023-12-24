package Spring_2022.Q4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    public static void main(String[] args) {
        JFrame frame =new JFrame("My App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        //Your Code Here
        //Answer to the question no A
        JButton one=new JButton("1");
        JButton two=new JButton("2");
        JButton three=new JButton("3");
        JButton four=new JButton("4");

        frame.setLayout(new GridLayout(2,2));


        frame.add(one);
        frame.add(two);
        frame.add(three);
        frame.add(four);

        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                two.setText("2");
                three.setText("3");
            }
        });

        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                two.setText("3");
                three.setText("2");
            }
        });
        frame.setVisible(true);

    }
}
