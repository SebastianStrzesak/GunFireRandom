package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppWindow {
    private JRadioButton onePlayerRadioButton;
    private JRadioButton twoPlayersRadioButton;
    private JRadioButton threePlayersRadioButton;
    private JRadioButton fourthPlayerRadioButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JLabel JLabel1;
    private JLabel JLabel2;
    private JLabel JLabel3;
    private JLabel JLabel4;
    private JButton randomizeCharactersButton;
    private JPanel mainPanel;

    

    public AppWindow(){
        JFrame frame = new JFrame("RANDOMIZER");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon imageIcon = new ImageIcon("src/main/resources/q1.jpeg");
        JLabel1.setIcon(imageIcon);
        JLabel2.setIcon(imageIcon);
        JLabel3.setIcon(imageIcon);
        JLabel4.setIcon(imageIcon);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        randomizeCharactersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {

            }
        });
    }
}
