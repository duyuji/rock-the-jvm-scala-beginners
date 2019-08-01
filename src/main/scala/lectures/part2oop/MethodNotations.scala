package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"$name, what the heck?!"
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"

    def +(nickname: String ) = new Person(s"$name ($nickname)", favoriteMovie)
    def unary_+ = new Person(name, favoriteMovie, age + 1)
    def learns(something: String): String = s"$name learns $something"
    def learnsSacala: String = learns("Scala")
    def apply(quantity: Int):String = s"$name watched $favoriteMovie $quantity times"
  }

  val mary = new Person("Mary", "Inceptions")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent
  // infix notation = operator notation (syntactic sugar)

  // "operators" in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary + tom)
  println(mary .+(tom))

  println(1 + 2)
  println(1.+ (2))

  // ALL OPERATORS ARE METHODS.
  // Akka actors have ! ?

  //prefix notation
  val x = -1 // equivalent with 1.unary_-
  val y = 1.unary_-
  // unary_ prefix only works with - + ~ !

  println(!mary)
  println(mary.unary_!)

  //postfix notation
  println(mary.isAlive)
  println(mary isAlive)

  // apply
  println(mary.apply())
  println(mary()) //equivalent

  println(mary + "the rockstar" name)
  println(+mary age)
  println(mary learnsSacala)
  println(mary(2))
}
