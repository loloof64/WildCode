package fr.wildcodeschool.idetest;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;

public class Start {
    public static void main(String... args) throws IOException {
        System.out.println(ProcessHandle.current().pid());

        JFrame jf = new JFrame("Gotcha!");
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.add(new JLabel(new ImageIcon(new URL("https://images.homify.com/c_fill,f_auto,q_auto:eco,w_440/v1440331177/p/photo/image/602449/01.jpg"))));
        jf.pack();
        jf.setVisible(true);
    }
}

