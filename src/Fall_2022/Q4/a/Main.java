package Fall_2022.Q4.a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main   {
    public static void main(String[] args) {
        JFrame fr= new JFrame();

        fr.setSize(300,300);
        JLabel label=new JLabel();
        JButton button= new JButton("click");
        fr.setLayout(new FlowLayout());
        fr.add(label);
        fr.add(button);
        button.addActionListener(new ActionListener() {
            int count=0;
            @Override
            public void actionPerformed(ActionEvent e) {

                count++;
                if(count==1){
                    label.setText("3..");
                }if(count==2){
                    label.setText("2..");
                }if(count==3){
                    label.setText("1..");
                }if(count>=4){
                    label.setText("Go..");
                }
            }
        });
        fr.setVisible(true);
    }
}
