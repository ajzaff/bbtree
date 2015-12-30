package com.alanjz.bbtree.tools.lexedit.ui.menu.file.nu;

import com.alanjz.bbtree.tools.lexedit.AppState;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

public class NewLexiconItem extends JMenuItem implements ActionListener {
  public NewLexiconItem() {
    super("Lexicon...");
    setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.META_DOWN_MASK));
    addActionListener(this);
  }
  @Override
  public void actionPerformed(ActionEvent e) {
    FileDialog fileDialog = new FileDialog(AppState.FRAME, "New Lexicon", FileDialog.SAVE);
    fileDialog.setFilenameFilter((File dir, String name) -> name.endsWith(".json"));
    fileDialog.setFile("lexicon.json");
    fileDialog.setVisible(true);
    String fileName = fileDialog.getFile();
    String directory = fileDialog.getDirectory();
    if(fileName != null) {
      AppState.setLexiconFile(directory, fileName);
    }
  }
}
