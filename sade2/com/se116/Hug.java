package com.se116;

import java.awt.*;
import java.io.*;
import java.util.concurrent.ThreadPoolExecutor;
import javax.swing.*;

public class Hug extends JFrame {
    public Hug() {
        initUI();
    }

    private void initUI() {

        add(new Board());
               
        setResizable(false);
        pack();
        setTitle("Hug");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public static void main(String[] args) {
            new User();
            String filepath = "resources/music.wav";
            musicStuff musicObject = new musicStuff();
            musicObject.playMusic(filepath);
            JFrame ex = new Hug();
            ex.setVisible(true);
    }



}
