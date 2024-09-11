/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz1.project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author danielhernandez
 */
public class Project1 {
    
    public static void main(String[] args) {
        
        double salesTaxRate = 0.04;
        double countySalesTax = 0.02;
        
        JFrame frame = new JFrame("Frame");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setSize(300, 150);
        
        JPanel panel = new JPanel();
        
        JLabel label = new JLabel("Total Sales For The Month: ");
        
        JTextField field = new JTextField(10);
        
        JButton button = new JButton("Go");
        
        JLabel resultLabel = new JLabel("Result: ");
        JLabel resultLabel2 = new JLabel("Result2: ");
        
        button.addActionListener(new ActionListener()
        {
                public void actionPerformed(ActionEvent e)
                {
                    String input = field.getText();
                    
                    try
                    {
                        double number = Double.parseDouble(input);
                        
                        double totalCountySalesTax = number * countySalesTax;
                        
                        double totalStateSalesTax = number * salesTaxRate;
                        
                        double totalSalesTax = totalStateSalesTax + totalCountySalesTax;
                        
                        resultLabel.setText("Amount of County Sales Tax: " + totalCountySalesTax);
                                                
                        JOptionPane.showMessageDialog(null, "Amount of State Sales Tax: " + totalStateSalesTax);
                        
                        JOptionPane.showMessageDialog(null, "Amount of Total Sales Tax: " + totalSalesTax);
                        
           
                    }
                    catch(Exception x)
                    {
                        resultLabel.setText("Please enter a valid number");
                    }
                }
        
        }
        );
        
        panel.add(label);
        panel.add(field);
        panel.add(button);
        panel.add(resultLabel);
        
        frame.add(panel);
        
        frame.setVisible(true);
    }
    
}
