package com.codebind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Graph {
    private JButton Redraw;
    private JPanel PanelGraph;
    private JPanel ChartFrame;

    public Graph() { //constructor to set up UI, Listeners
        Redraw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


   protected void CartesianPlane(Graphics  g2) { //Drawing the cartesian plane
        super.paintComponent(g);
        int centeX = getWidth
    }

}