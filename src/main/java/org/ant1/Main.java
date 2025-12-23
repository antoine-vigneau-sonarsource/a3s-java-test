package org.ant1;

public class Main {
  public static void main(String[] args) {
    Using using = new Using(new Used("id"));

    System.out.println(using.getId());
  }
}
