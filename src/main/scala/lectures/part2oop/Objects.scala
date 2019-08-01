package lectures.part2oop

object Objects extends App {

  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("static")

  object Person {
    // "static"/"class" - level functionality
    val N_EYES = 2
    def canFly = false
  }
  class Person {
    // instance-level functionality
  }
  // COMPANION

  println(Person.N_EYES)
  println(Person.canFly)

  // Scala object = SINGLETON INSTACE
  val mary = Person
  val john = Person
  println(mary == john)
}
