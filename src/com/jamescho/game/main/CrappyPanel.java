package com.jamescho.game.main;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cortman on 2/19/17.
 */
class CrappyPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLUE);
        g.fillRect(0,0,100,100);

        g.setColor(Color.GREEN);
        g.drawRect(50,50,100,100);

        g.setColor(Color.RED);
        g.drawString("Hello World!", 200, 200);

        g.setColor(Color.black);
        g.fillOval(250,40,100,30);
    }
}
