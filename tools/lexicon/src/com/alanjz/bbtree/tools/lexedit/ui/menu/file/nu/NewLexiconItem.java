package com.alanjz.bbtree.tools.lexedit.ui.menu.file.nu;

import com.alanjz.bbtree.tools.lexedit.AppState;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class NewLexiconItem extends JMenuItem implements ActionListener {
  public NewLexiconItem() {
    super("Lexicon...");
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
