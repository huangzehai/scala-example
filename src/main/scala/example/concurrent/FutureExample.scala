package example.concurrent

import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

object FutureExample {

  def main(args: Array[String]): Unit = {
    val fut = Future {
      Thread.sleep(10000)
      21 + 21
    }

    val x = Await.result(fut, 15.seconds)
    println(x)

  }
}
