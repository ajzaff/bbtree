package com.alanjz.bbtree.tools.lexedit.ui.menu.file;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class SaveItem extends JMenuItem {
  public SaveItem() {
    super("Save Lexicon...");
    setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.META_DOWN_MASK));
  }
}
