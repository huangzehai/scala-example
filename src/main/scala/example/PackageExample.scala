package example

package a {

  class A {
    def f(): Unit = {
      val c = new C
    }
  }


  class C {

  }

  package b {

    private[b] class B {
      private[b] def fb(): Unit = {

      }
    }

  }

}
