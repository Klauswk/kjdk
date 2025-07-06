module jdk.jdb { 
  requires jdk.internal.le;
  //exports com.sun.tools.example.debug.expr;
  //exports com.sun.tools.example.debug.tty;
  requires transitive jdk.jdi;
}
