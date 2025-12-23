package org.ant1;

import java.util.Optional;

public class Used {

  private final String id;

  public Used(String id) {
    this.id = id;
  }

  public Optional<String> getId() {
    if (id == null) return Optional.empty();
    return Optional.of(id);
  }

}
