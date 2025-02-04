package com.acme.basic;

import java.util.logging.Logger;

public class HelloWorld {

  void sayHello() {
    Logger log = Logger.getLogger("HelloWorld");

    log.info("Hello World");
  }

  void notCovered() {
    Logger log = Logger.getLogger("This method is not covered by unit tests");

    log.info("This is a test");
  }

}
