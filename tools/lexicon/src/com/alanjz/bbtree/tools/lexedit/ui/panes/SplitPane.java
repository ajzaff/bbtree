package com.alanjz.bbtree.tools.lexedit.ui.panes;

import com.alanjz.bbtree.tools.lexedit.ui.panes.properties.PropertiesPanel;
import com.alanjz.bbtree.tools.lexedit.ui.panes.words.WordsPanel;

import javax.swing.*;

public class SplitPane extends JSplitPane {
  public SplitPane() {
    super(JSplitPane.HORIZONTAL_SPLIT, new WordsPanel(), new PropertiesPanel());
  }
}
