package com;

import javax.swing.*;
import java.awt.*;


public class Start extends JFrame {
    JPanel shapePanel = new JPanel();
    JPanel animationPanel = new JPanel();
    JPanel shapePropertyPanel = new JPanel();
    JPanel animationPropertyPanel = new JPanel();
    JPanel downPanel = new JPanel();
    JPanel mainPanel = new JPanel();


    public Start() throws HeadlessException {
        shapePanel.setBackground(Color.yellow);
        animationPanel.setBackground(Color.red);
        shapePanel.setBorder(BorderFactory.createLineBorder(Color.black));
        animationPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        animationPropertyPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        shapePropertyPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        mainPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        mainPanel.setBackground(Color.gray);
        Button circle = new Button("Circle");
        Button rictangle = new Button("Recangle");
        Button line = new Button("Line");
        Button image = new Button("Image");
        Button play = new Button("PLAY");
        Button grow=new Button("Grow");
        Button move=new Button("Move");
        Button chaneImage=new Button("Change Image");
        play.setBackground(Color.green);
        shapePanel.setLayout(new BoxLayout(shapePanel, BoxLayout.Y_AXIS));
        animationPanel.setLayout(new BoxLayout(animationPanel, BoxLayout.Y_AXIS));
        shapePanel.add(circle);
        shapePanel.add(rictangle);
        shapePanel.add(line);
        shapePanel.add(image);
        shapePanel.add(play);
        animationPanel.add(move);
        animationPanel.add(grow);
        animationPanel.add(chaneImage);

        shapePanel.setPreferredSize(new Dimension(100, 200));
        animationPanel.setPreferredSize(new Dimension(100, 200));
        downPanel.setPreferredSize(new Dimension(100, 300));
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setName("Paint");
        this.add(shapePanel, BorderLayout.EAST);
        this.add(animationPanel, BorderLayout.WEST);
        this.add(downPanel, BorderLayout.SOUTH);
        downPanel.add(shapePropertyPanel, new FlowLayout(FlowLayout.RIGHT));
        downPanel.add(animationPropertyPanel, new FlowLayout(FlowLayout.LEFT));
        shapePropertyPanel.setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width / 2 - 20, 300));
        animationPropertyPanel.setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width / 2 - 20, 300));
        this.add(mainPanel, BorderLayout.CENTER);

    }
}
