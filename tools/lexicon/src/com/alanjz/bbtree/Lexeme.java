package com.alanjz.bbtree;

public class Lexeme {
  private String word;
  public Lexeme(String word) {
    this.word = word;
  }
  public String getWord() {
    return word;
  }
  @Override
  public String toString() {
    return getWord();
  }
}
