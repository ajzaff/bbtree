package com.alanjz.bbtree.tools.lexedit.ui.menu.file;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class SaveAsItem extends JMenuItem {
  public SaveAsItem() {
    super("Save Lexicon As...");
    setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.META_DOWN_MASK | KeyEvent.SHIFT_DOWN_MASK));
  }
}
