package org.aman.basics

object MethodNames {
  def joiner(strings: List[String], separator: String = " "): String = {
    strings.mkString(separator)
  }

  def run {
    println(joiner(List("Programming", "Scala", "example of", "default method parameter value")))
    println(joiner(List("now using", "custom separator"), "*"))
  }

}