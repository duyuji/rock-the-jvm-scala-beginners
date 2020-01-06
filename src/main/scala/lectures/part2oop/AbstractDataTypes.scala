package lectures.part2oop

object AbstractDataTypes extends App {

  // abstract
  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"
    def eat: Unit = println("crunch, crunch")
  }

  //traits
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  trait ColdBlooded
  class Crocodile extends Animal with Carnivore {
    val creatureType: String = "croc"
    def eat: Unit = "nomnomnom"
    def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  // trais vs abstract class
  // 1 - trais do not have constructor parameters
  // 2 - multiple traits may be inherited by the same class
  // 3 - traits = behavior, abstract class = "thing"
}
