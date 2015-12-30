package com.alanjz.bbtree.tools.lexedit.ui.menu.file;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class OpenItem extends JMenuItem {
  public OpenItem() {
    super("Open Lexicon...");
    setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.META_DOWN_MASK));
  }
}
