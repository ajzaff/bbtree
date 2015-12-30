package com.alanjz.bbtree.tools.lexedit.ui.menu;

import com.alanjz.bbtree.tools.lexedit.ui.menu.file.FileMenu;
import com.alanjz.bbtree.tools.lexedit.ui.menu.lexicon.LexiconMenu;

import javax.swing.*;

public class MenuBar extends JMenuBar {
  public MenuBar() {
    initUI();
  }
  private void initUI() {
    // file menu
    add(new FileMenu());

    // lexeme menu
    add(new LexiconMenu());
  }
}
