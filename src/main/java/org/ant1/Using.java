package org.ant1;

public class Using {

  private final String id;

  public Using(Used used) {
    this.id = used.getId().get();
  }

  public String getId() {
    return id;
  }
}
