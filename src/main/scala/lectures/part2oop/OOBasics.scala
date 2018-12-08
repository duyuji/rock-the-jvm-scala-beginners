package lectures.part2oop

object OOBasics extends App {

  val person = new Person("Eduardo", 29)
  println(person.age)
  person.greet("João")
}

// constructor
class Person(name: String, val age: Int) {
  // body
  val x = 2

  println(1 + 3)

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")
}

// class parameters are NOT FIELDS