module com.example {
  requires static lombok;
  requires org.apache.logging.log4j;
  requires org.apache.logging.log4j.core;

  opens com.example; // Most likely not required, but exposing just for testing.
  exports com.example; // Most likely not required, but exposing just for testing.
}
