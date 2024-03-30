package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen {
    private JButton CUSTOMERButton;
    private JButton ADMINButton;
    private JPanel auctionPanel;
    JFrame auctionF = new JFrame();
    public MainScreen(){
        auctionF.setContentPane(auctionPanel);
        auctionF.pack();
        auctionF.setVisible(true);
        System.out.println("mainscrworking");
        CUSTOMERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Customer();
                System.out.println("cust scrworking");
            }

        });

        ADMINButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Admin();
                System.out.println("admin scrworking");
            }
        });
    }
}