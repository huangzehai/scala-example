package example.action

import example.model.Staff

/**
  * Worker mixin.
  */
trait WorkerAction {
  this: Staff =>
  def greeting: String = s"My name is $name"
}
