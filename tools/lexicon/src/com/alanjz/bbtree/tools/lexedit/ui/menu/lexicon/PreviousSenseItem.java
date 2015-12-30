package com.alanjz.bbtree.tools.lexedit.ui.menu.lexicon;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class PreviousSenseItem extends JMenuItem {
  public PreviousSenseItem() {
    super("Previous Sense");
    setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, KeyEvent.META_DOWN_MASK));
  }
}