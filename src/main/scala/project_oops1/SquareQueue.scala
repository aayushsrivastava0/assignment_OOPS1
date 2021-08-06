package project_oops1

import scala.collection.mutable.ListBuffer

class SquareQueue(queue: ListBuffer[Int]) extends Queue {

  override def enqueue(elementToBePushed: Int): Unit = {

    queue += (elementToBePushed * elementToBePushed)
  }

}

import scala.collection.mutable.ListBuffer

class DoubleQueue(queue : ListBuffer[Int]) extends Queue {

  override def enqueue(elementToBePushed: Int): Unit = {

    queue += (elementToBePushed * 2)
  }

}
