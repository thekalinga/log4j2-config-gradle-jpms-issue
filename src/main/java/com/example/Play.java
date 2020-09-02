package com.example;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Play {
  public static void main(String[] args) {
    log.debug("DEBUG MSG");
    log.error("ERROR MSG");
  }
}
