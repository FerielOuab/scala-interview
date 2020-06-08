package com.particeep.test

object WhatsWrong1 {

  trait Interface {
    val city: String
    override def toString = s"Ici c'est $city !"
  }

  case object Supporter extends Interface {

    override val city = "Paris"
  }

  println(Supporter.city) //What does this print ?
  println(Supporter.toString) //What does this print and why ? How to fix it ?
}
