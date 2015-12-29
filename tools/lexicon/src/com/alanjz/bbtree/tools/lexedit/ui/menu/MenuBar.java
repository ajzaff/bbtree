package com.alanjz.bbtree.tools.lexedit.ui.menu;

import com.alanjz.bbtree.tools.lexedit.ui.menu.file.FileMenu;

import javax.swing.*;

public class MenuBar extends JMenuBar {
  public MenuBar() {
    initUI();
  }
  private void initUI() {
    // file menu
    add(new FileMenu());
  }
}
