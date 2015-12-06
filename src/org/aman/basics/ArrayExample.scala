package org.aman.basics

object ArrayExample {
  def run {
    val array: Array[String] = new Array(5)
    //array = new Array(2)
    array(0) = "Hello"
    println(array)
  }

}