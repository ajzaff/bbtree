package com.alanjz.bbtree.tools.lexedit;

import com.alanjz.bbtree.tools.lexedit.ui.Frame;

import javax.swing.*;

public class LexiconEditor {

  public LexiconEditor() {
    AppState.FRAME = new Frame("BBTree Lexicon Editor");
    AppState.FRAME.setVisible(true);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(LexiconEditor::new);
  }
}
