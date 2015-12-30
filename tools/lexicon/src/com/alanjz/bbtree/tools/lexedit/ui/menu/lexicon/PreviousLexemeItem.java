package com.alanjz.bbtree.tools.lexedit.ui.menu.lexicon;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class PreviousLexemeItem extends JMenuItem {
  public PreviousLexemeItem() {
    super("Previous Lexeme");
    setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0));
  }
}
