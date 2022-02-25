package work;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow {

    public static void main(String[] args) {

        JFrame jFrame = new JFrame("My Window");
        jFrame.setSize(500,500);
        jFrame.setLayout(new FlowLayout());

        JButton jButton = new JButton("Click Me !!");
        jButton.addActionListener(e ->{
            JOptionPane.showMessageDialog(null, "Hey,Button Click");
        });
        jFrame.add(jButton);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);


    }
}
