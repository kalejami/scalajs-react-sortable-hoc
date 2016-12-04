package org.rebeam.sortable

import scala.collection.mutable.ListBuffer

/**
  * A change in index of an item generated by dragging
  *
  * @param oldIndex The item's old index
  * @param newIndex The item's new index
  */
case class IndexChange(oldIndex: Int, newIndex: Int) {
  def updatedList[A](l: List[A]) = {
      val lb = ListBuffer(l: _*)
      val e = lb.remove(oldIndex)
      lb.insert(newIndex, e)
      lb.toList
  }
}
