package com.alanjz.bbtree.tools.lexedit.ui.panel.words;

import javax.swing.*;
import javax.swing.table.*;

public class LexemeTable extends JTable {

  private TableRowSorter<DefaultTableModel> rowSorter;

  public LexemeTable() {
    super();
    setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    setTableHeader(null);
    setFocusable(false);
    initModel();
    initUI();
  }

  public TableRowSorter<DefaultTableModel> getTableRowSorter() {
    return rowSorter;
  }

  private void initModel() {
    DefaultTableModel tableModel = new DefaultTableModel() {
      @Override
      public boolean isCellEditable(int row, int col) {
        return false;
      }
    };
    tableModel.addColumn("Lexemes");
    setModel(tableModel);
    rowSorter = new TableRowSorter<>(tableModel);
    setRowSorter(rowSorter);
  }

  private void initUI() {
  }

  public void reset() {
    clearSelection();
  }
}
