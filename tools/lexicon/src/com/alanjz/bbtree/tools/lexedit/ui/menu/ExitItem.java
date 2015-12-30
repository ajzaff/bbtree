package com.alanjz.bbtree.tools.lexedit.ui.menu;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class ExitItem extends JMenuItem {
  public ExitItem() {
    super("Exit");
    setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.META_DOWN_MASK));
  }
}
