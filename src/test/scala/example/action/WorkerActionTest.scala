package example.action

import example.model.Staff
import org.scalatest.FlatSpec

class WorkerActionTest extends FlatSpec {
  "The greeting from Tom '" should " be ''My name is Tom" in {
    val staff = new Staff("Tom") with WorkerAction
    assert(staff.greeting equals "My name is Tom")
  }

}
