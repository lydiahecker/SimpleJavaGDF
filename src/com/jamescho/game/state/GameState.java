package com.jamescho.game.state;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class GameState extends State {

    String wut = "";
    int press = 0;
    int bodyTop = 100;
    int bodyLeft = 200;
    int headSize = 60;
    int bodyMiddle = bodyLeft + headSize/2;
    int bodyBottom = bodyTop+headSize+100;
    @Override
    public void init() {

    }

    @Override
    public void update() {

    }

    @Override
    public void render(Graphics g) {
        g.drawString(wut, 200, 200);
        press = 6;
        if (press == 1){
            drawHead(g);
        } else if (press == 2){
            drawHead(g);
            drawBody(g);
        } else if (press == 3){
            drawHead(g);
            drawBody(g);
            drawRightArm(g);
        } else if (press == 4){
            drawHead(g);
            drawBody(g);
            drawRightArm(g);
            drawLeftArm(g);
        } else if (press == 5){
            drawHead(g);
            drawBody(g);
            drawRightArm(g);
            drawLeftArm(g);
            drawRightLeg(g);
        } else if (press == 6){
            drawHead(g);
            drawBody(g);
            drawRightArm(g);
            drawLeftArm(g);
            drawRightLeg(g);
            drawLeftLeg(g);
        } else {
            System.out.println("No");
        }

    }

    private void drawHead(Graphics g){
        g.drawOval(bodyLeft, bodyTop, headSize, headSize);
    }

    private void drawBody(Graphics g){
        g.drawLine(bodyMiddle, bodyTop+headSize, bodyMiddle, bodyBottom);
    }

    private void drawRightArm(Graphics g){
        g.drawLine(bodyMiddle, bodyTop+headSize+30, bodyMiddle+headSize, bodyBottom);
    }

    private void drawLeftArm(Graphics g){
        g.drawLine(bodyMiddle, bodyTop+headSize+30, bodyMiddle-headSize, bodyBottom);
    }

    private void drawRightLeg(Graphics g){
        g.drawLine(bodyMiddle, bodyBottom, bodyMiddle+30, bodyBottom + 160);
    }

    private void drawLeftLeg(Graphics g){
        g.drawLine(bodyMiddle, bodyBottom, bodyMiddle-30, bodyBottom + 160);
    }

    @Override
    public void onClick(MouseEvent e) {

    }

    @Override
    public void onKeyPress(KeyEvent e) {



    }

    @Override
    public void onKeyRelease(KeyEvent e) {
        String key = Character.toString(e.getKeyChar());
        wut += key;

    }

}
