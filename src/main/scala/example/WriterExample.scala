package example

import java.io.{File, PrintWriter}

object WriterExample {
  def main(args: Array[String]): Unit = {
    withPrintWriter(
      new File("data.txt"),
      writer => writer.println(new java.util.Date())
    )


    assert(1==1)

  }

  def withPrintWriter(file: File, op: PrintWriter => Unit) = {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }


}
