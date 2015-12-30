package com.alanjz.bbtree.tools.lexedit.ui.menu.file;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class CloseItem extends JMenuItem {
  public CloseItem() {
    super("Close");
    setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, KeyEvent.META_DOWN_MASK));
  }
}
