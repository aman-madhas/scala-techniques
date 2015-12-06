package org.aman.basics

object InferringTypeInformation {

  // below line will not compile
  // must declare return type
  // def upCase(s:String)={
  def upCase(s: String): String = {
    if (s.length == 0)
      return s
    else
      s.toUpperCase()
  }

  def run {
    println(upCase("helloWorLD!"));
  }

}