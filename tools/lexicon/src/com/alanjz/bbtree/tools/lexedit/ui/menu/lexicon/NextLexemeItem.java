package com.alanjz.bbtree.tools.lexedit.ui.menu.lexicon;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class NextLexemeItem extends JMenuItem {
  public NextLexemeItem() {
    super("Next Lexeme");
    setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0));
  }
}
