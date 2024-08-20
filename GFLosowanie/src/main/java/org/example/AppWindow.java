package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

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

    private int playersNumber = 0;
    ArrayList<String> fotos = new ArrayList<>();

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

        for (int i=0; i<19; i++)
        {
            fotos.add("src/main/resources/char" + i + ".jpeg");
        }

        Random random = new Random();

        randomizeCharactersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (onePlayerRadioButton.isSelected()) playersNumber=1;
                    else if (twoPlayersRadioButton.isSelected()) playersNumber=2;
                        else if (threePlayersRadioButton.isSelected()) playersNumber=3;
                            else playersNumber=4;

                int startDelay = 50;  // Początkowe opóźnienie w milisekundach
                int maxDelay = 1500;  // Maksymalne opóźnienie w milisekundach

                for (int i=1; i<=playersNumber; i++)
                {
                    //core's dont work in swing, neet to find solution
                    int randomNumber = random.nextInt(10);
                    randomNumber = randomNumber * (random.nextInt(2) + 1);
                    ImageIcon imageIcon = new ImageIcon(fotos.get(randomNumber));
                    JLabel1.setIcon(imageIcon);

                }

            }
        });
    }
}
