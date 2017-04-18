package iterator

import java.util.Iterator

class ShapeIterator(private var shapes: Array[Shape]) extends Iterator[Shape] {

  private var index: Int = -1
  val maxValue = shapes.length - 1

  override def hasNext(): Boolean = if (index >= maxValue) false else true

  override def next(): Shape = {
    index += 1
    shapes(index)
  }

  override def remove(): Unit = {
    index += 1
  }
}