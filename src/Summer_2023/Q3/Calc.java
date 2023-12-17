package Summer_2023.Q3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc extends JFrame implements ActionListener {
    JTextField N1;
    JTextField N2;
    JTextField Result;
    JButton add;
    JButton subtract;
    JLabel n1;
    JLabel n2;
    JLabel result;


    Calc(){
        setSize(400,500);
        //setLocale(null);
        setLayout(null);
        addComponent();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void addComponent(){

        N1=new JTextField();
        N2=new JTextField();
        n1=new JLabel();
        n2=new JLabel();
        Result=new JTextField();
        N1.setBounds(20,20,150,50);
        n1.setBounds(20,20,150,50);
        N2.setBounds(200,20,150,50);
        Result.setBounds(120,120,200,50);

        add=new JButton("Addition");
        subtract=new JButton("Subtract");
        add.setBounds(20,220,150,50);
        subtract.setBounds(200,220,150,50);

        add.addActionListener(this);
        subtract.addActionListener(this);


        add(N1);
        add(N2);
        add(Result);
        add(add);
        add(subtract);
    }

    @Override
    public void actionPerformed(ActionEvent e){
            int n1=Integer.parseInt(N1.getText());
            int n2=Integer.parseInt(N2.getText());
            int result=0;
        if(e.getSource()==add){
             result=n1+n2;
        } else if (e.getSource()==subtract) {
            result=n1-n2;
        }
            Result.setText(String.valueOf(result));
    }

}
class Main{
    public static void main(String[] args) {
        new Calc();
    }
}
