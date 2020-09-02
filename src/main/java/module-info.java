module com.example {
  requires static lombok;
  requires org.apache.logging.log4j;
  requires org.apache.logging.log4j.core;

  opens com.example; // Not required, but exposed just for testing.
}
