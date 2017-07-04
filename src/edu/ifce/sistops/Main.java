package edu.ifce.sistops;

import edu.ifce.sistops.ui.Gui;
import java.awt.GridLayout;
import javax.swing.JFrame;

public class Main {

  public static void main(String... args) {
    JFrame jf = new JFrame("Sistemas Operacionais");
    jf.setLayout(new GridLayout());
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.add(new Gui());
    jf.setSize(640,480);
    jf.setVisible(true);
  }
}
