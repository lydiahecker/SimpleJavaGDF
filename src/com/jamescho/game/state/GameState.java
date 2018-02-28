package com.jamescho.game.state;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class GameState extends State {

    String wut = "";

    @Override
    public void init() {

    }

    @Override
    public void update() {

    }

    @Override
    public void render(Graphics g) {
        g.drawString(wut, 200, 200);


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
