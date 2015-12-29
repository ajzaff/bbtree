package com.alanjz.bbtree.tools.lexedit.ui.panel.words;

import javax.swing.*;
import java.awt.*;

public class WordsPanel extends JPanel {

  private FilterBar filterBar;
  private LexemeTable lexemeTable;

  public WordsPanel() {
    super();
    initUI();
    reset();
  }

  private void reset() {
    setEnabled(false);
    lexemeTable.reset();
  }

  private void initUI() {
    // set layout
    setLayout(new GridBagLayout());

    lexemeTable = new LexemeTable();
    filterBar = new FilterBar(lexemeTable);

    // add filter bar
    add(filterBar, new GridBagConstraints() {{
      this.fill = GridBagConstraints.HORIZONTAL;
      this.weightx = .8;
      this.weighty = 0;
      this.gridx = 0;
      this.gridy = 0;
    }});

    // add scroll pane
    add(new ScrollPane(lexemeTable), new GridBagConstraints() {{
      this.fill = GridBagConstraints.BOTH;
      this.weightx = .8;
      this.weighty = 1;
      this.gridx = 0;
      this.gridy = 1;
    }});
  }
}
