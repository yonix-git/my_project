/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package even.niar;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author user
 */
public class myClass {
    
    JFrame frame = new JFrame("my frame");
    JList<String> list = new JList<>();
    DefaultListModel<String> model = new DefaultListModel<>();
    JLabel label = new JLabel();
    JPanel panel = new JPanel();
    JSplitPane splitPane = new JSplitPane();
    
    public myClass(){
        
        list.setModel(model);
        
        model.addElement("aaaaaaaaaaaaaaaaaaa");
        model.addElement("bbbbbbbbbbbbbbbbbb");
        model.addElement("ddddbbdd");
        
        //splitPane.setLeftComponent(new JScrollPane(list));
        panel.setBackground(Color.red);
        //splitPane.setRightComponent(new JScrollPane(panel));
        panel.setBounds(10, 10, 200, 200);
        panel.setBackground(Color.red);
        label.add(list);
        panel.add(label);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(panel);
        
        //panel.add(splitPane);
        
    }
}
