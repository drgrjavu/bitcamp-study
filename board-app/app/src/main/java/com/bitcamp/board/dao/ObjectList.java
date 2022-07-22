package com.bitcamp.board.dao;

public class ObjectList {
  private static final int DEFAULT_SIZE = 3;

  private int length; 
  private Object[] list; 
  public ObjectList() {
    this.list = new Object[DEFAULT_SIZE];
  }

  ObjectList(int initCapacity) {
    this.list = new Object[initCapacity];
  }
  public Object[] toArray() {
    Object[] arr = new Object[this.length];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = this.list[i];
    }
    return arr;
  }

  public Object get(int index) {
    if (index < 0 || index >= this.length) {
      return null;
    }
    return list[index];
  }



}




