package com.alanjz.bbtree.tools.lexedit.ui;

import com.alanjz.bbtree.tools.lexedit.ui.menu.MenuBar;
import com.alanjz.bbtree.tools.lexedit.ui.panes.SplitPane;
import com.alanjz.bbtree.tools.lexedit.ui.panes.words.WordsPanel;

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

    // add split panel
    add(new SplitPane());

    // set up FRAME
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setSize(new Dimension(1000, 600));
    setLocationRelativeTo(null);
  }
}
