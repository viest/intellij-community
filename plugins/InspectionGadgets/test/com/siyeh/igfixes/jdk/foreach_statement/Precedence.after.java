package com.siyeh.igfixes.jdk.foreach_statement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class Precedence {

  void x(Collection c) {
      for (Iterator iterator = (c = new ArrayList()).iterator(); iterator.hasNext(); ) {
          Object n = iterator.next();

      }
  }

}