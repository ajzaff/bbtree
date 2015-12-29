package com.alanjz.bbtree.tools.lexedit.ui.menu.file;

import com.alanjz.bbtree.tools.lexedit.ui.menu.ExitItem;
import com.alanjz.bbtree.tools.lexedit.ui.menu.file.nu.NewMenu;

import javax.swing.*;

public class FileMenu extends JMenu {
  public FileMenu() {
    super("File");
    initUI();
  }
  private void initUI() {
    // add new menu
    add(new NewMenu());

    // add open item
    add(new OpenItem());

    // add close
    add(new CloseItem());

    // add separator
    addSeparator();

    // add save
    add(new SaveItem());

    // add save as
    add(new SaveAsItem());

    // add separator
    addSeparator();

    // add exit item
    add(new ExitItem());
  }
}
