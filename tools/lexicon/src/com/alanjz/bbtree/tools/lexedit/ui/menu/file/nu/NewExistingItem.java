package com.alanjz.bbtree.tools.lexedit.ui.menu.file.nu;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class NewExistingItem extends JMenuItem {
  public NewExistingItem() {
    super("Lexicon from Existing Sources...");
    setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.META_DOWN_MASK | KeyEvent.ALT_DOWN_MASK));
  }
}
