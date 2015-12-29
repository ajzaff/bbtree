package com.alanjz.bbtree.tools.lexedit.ui;

import com.alanjz.bbtree.tools.lexedit.ui.menu.MenuBar;
import com.alanjz.bbtree.tools.lexedit.ui.panel.words.WordsPanel;

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

    // set layout
    setLayout(new GridLayout(1, 2, 20, 20));

    // add words panel
    add(new WordsPanel());

    // add dummy
    // TODO: properties panel
    add(new JPanel());

    // set up FRAME
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setSize(new Dimension(1000, 600));
    setLocationRelativeTo(null);
  }
}
