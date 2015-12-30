package com.alanjz.bbtree.tools.lexedit.ui.panes.words;

import com.alanjz.bbtree.tools.lexedit.ui.StyleDefaults;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FilterBar extends JTextField implements DocumentListener, FocusListener {

  private final LexemeTable lexemeTable;
  private boolean changed = false;

  public FilterBar(LexemeTable lexemeTable) {
    super();
    this.lexemeTable = lexemeTable;
    clear();
    initListeners();
    initUI();
  }

  private void initListeners() {
    getDocument().addDocumentListener(this);
    addFocusListener(this);
  }

  private void initUI() {
  }

  private void clear() {
    setText("Start typing regex to filter lexemes...");
    setFont(StyleDefaults.Fields.PLACEHOLDER_FONT);
    setForeground(StyleDefaults.Fields.PLACEHOLDER_COLOR);
    changed = false;
  }
  @Override
  public void focusGained(FocusEvent e) {
    if(! changed) {
      setText("");
    }
  }

  @Override
  public void focusLost(FocusEvent e) {
    if(! changed || getText().isEmpty()) {
      changed = false;
      clear();
    }
  }

  private void filterTable() {
    if(! changed) {
      return;
    }

    RowFilter<DefaultTableModel, Integer> rf = null;
    //If current expression doesn't parse, don't update.
    try {
      rf = RowFilter.regexFilter(getText(), 0);
    } catch (java.util.regex.PatternSyntaxException e) {
      return;
    }
    lexemeTable.getTableRowSorter().setRowFilter(rf);
  }

  @Override
  public void insertUpdate(DocumentEvent e) {
    textUpdate();
  }

  @Override
  public void removeUpdate(DocumentEvent e) {
    textUpdate();
  }

  @Override
  public void changedUpdate(DocumentEvent e) {
    textUpdate();
  }

  private void textUpdate() {
    setForeground(StyleDefaults.Fields.CONTENT_COLOR);
    setFont(StyleDefaults.Fields.CONTENT_FONT);
    changed = true;
    filterTable();
  }
}
