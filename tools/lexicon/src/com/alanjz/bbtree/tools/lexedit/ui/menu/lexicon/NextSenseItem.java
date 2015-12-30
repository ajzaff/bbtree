package com.alanjz.bbtree.tools.lexedit.ui.menu.lexicon;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class NextSenseItem extends JMenuItem {
  public NextSenseItem() {
    super("Next Sense");
    setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, KeyEvent.META_DOWN_MASK));
  }
}