package org.aman.basics

object Semicolons {
  def equalsign = {
    val reallySuperLongValueNameThatGoesOnForeverSoYouNeedANewLine =
      "wow that was a long value name"
    println(reallySuperLongValueNameThatGoesOnForeverSoYouNeedANewLine)
  }

  def equalsign2(s: String) = {
    println("equalsign2: " + s)
  }

  def commas(s1: String,
    s2: String) = {
    println("comma: " + s1 + ", " + s2)
  }

  def run {
    equalsign
    equalsign2("some text")
    commas("text1", "text2")
  }

}