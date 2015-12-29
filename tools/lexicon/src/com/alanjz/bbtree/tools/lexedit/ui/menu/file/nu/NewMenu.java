package com.alanjz.bbtree.tools.lexedit.ui.menu.file.nu;

import javax.swing.*;

public class NewMenu extends JMenu {
  public NewMenu() {
    super("New");
    initUI();
  }
  private void initUI() {
    // add new lexicon
    add(new NewLexiconItem());

    // add new existing item
    add(new NewExistingItem());

    // add separator
    addSeparator();

    // add new entry
    add(new NewEntryItem());
  }
}
