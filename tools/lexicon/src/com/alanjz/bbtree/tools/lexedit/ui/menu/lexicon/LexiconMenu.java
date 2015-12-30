package com.alanjz.bbtree.tools.lexedit.ui.menu.lexicon;

import javax.swing.*;

public class LexiconMenu extends JMenu {
  public LexiconMenu() {
    super("Lexicon");
    initUI();
  }

  private void initUI() {
    add(new PreviousLexemeItem());
    add(new PreviousSenseItem());
    addSeparator();
    add(new NextLexemeItem());
    add(new NextSenseItem());
    addSeparator();
    add(new NewSenseItem());
    addSeparator();
    add(new RemoveSenseItem());
  }
}
