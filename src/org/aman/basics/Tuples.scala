package org.aman.basics

object Tuples {

  def tupleator(x1: Any, x2: Any, x3: Any) = (x1, x2, x3)

  def run {
    val t = tupleator("Hello", 1, 2.3)
    println("Tuple: " + t)
    println("Item 1: " + t._1)
    println("Item 2: " + t._2)
    println("Item 3: " + t._3)

    val (t1, t2, t3) = tupleator("World", '!', 0x22)
    println(t1 + " " + t2 + " " + t3)

    val newTuple = 1 -> 2
    println(newTuple)

    val newTuple2 = Tuple2(1, 2)
    println(newTuple2)

    val newTuple3 = Pair(1, 2)
    println(newTuple3)
  }

}