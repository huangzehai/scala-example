package example

import org.scalatest.{FlatSpec, Matchers}
import org.scalatest.concurrent.Eventually

class SetSpec extends FlatSpec with Eventually with Matchers {

  "An empty set" should "have size 0" in {
    assert(Set.empty.size == 0)
  }

  it should "produce NoSuchElementException when head is invoked" in {
    assertThrows[NoSuchElementException] {
      Set.empty.head
    }
  }

  it should "be 3" in {
    val xs = 1 to 3
    val it = xs.iterator
    eventually { it.next() shouldBe 3}
  }

}
