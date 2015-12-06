package org.aman.basics

object OptionSomeNone {

  def run1 {
    val stateCapitals = Map(
      "Alabama" -> "Montgomery",
      "Alaska" -> "Juneau",
      "Wyoming" -> "Cheyenne")

    println("Get the capitals wrapped in Options: ")
    println("Alabama: " + stateCapitals.get("Alabama"))
    println("Wyoming: " + stateCapitals.get("Wyoming"))
    println("Unknown: " + stateCapitals.get("Unknown"))

    println("Get the capitals themselves out of the Options:")
    println("Alaska: " + stateCapitals.get("Alaska").get)
    println("Wyoming: " + stateCapitals.get("Wyoming").getOrElse("Oops!"))
    println("Unknown: " + stateCapitals.get("Unknown").getOrElse("Oops2!"))

  }

}