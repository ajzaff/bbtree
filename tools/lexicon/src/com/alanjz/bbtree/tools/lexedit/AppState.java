package com.alanjz.bbtree.tools.lexedit;

import com.alanjz.bbtree.tools.lexedit.ui.Frame;

import java.io.File;
import java.io.IOException;

public final class AppState {

  public static final String APP_NAME = "BBTree Lexicon Editor";
  public static Frame FRAME;
  private static File LEXICON_FILE;

  public static File getLexiconFile() {
    return LEXICON_FILE;
  }

  public static void setLexiconFile(String directory, String fileName) {
    File file = new File(directory + fileName);
    try {
      if(file.exists() || file.createNewFile()) {
        LEXICON_FILE = file;
        FRAME.setTitle(APP_NAME + " [" + getLexiconFile() + "]");
      }
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }
}
