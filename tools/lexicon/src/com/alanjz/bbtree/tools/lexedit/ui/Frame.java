package com.alanjz.bbtree.tools.lexedit.ui;

import com.alanjz.bbtree.tools.lexedit.ui.menu.MenuBar;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
  public Frame(String title) {
    super(title);
    initUI();
  }
  private void initUI() {
    // menu bar
    setJMenuBar(new MenuBar());

    // set up FRAME
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setSize(new Dimension(1000, 600));
    setLocationRelativeTo(null);
  }
}
