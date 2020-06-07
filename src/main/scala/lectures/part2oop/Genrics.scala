package lectures.part2oop

object Genrics extends App {
  class Mylist[+A] {
    // use the type A
    def add[B >: A](element: B) : Mylist[B] = ???
  }

  class MyMap[Key, Value]

  val listOfIntergers = new Mylist[Int]
  val listOfStrings = new Mylist[String]

  // generic methods
  object Mylist {
    def empty[A]: Mylist[A] = ???
  }
  val emptyListOfIntergers = Mylist.empty[Int]

  // varience problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // 1. yes List[Cat] extends List[Animal] = COVARIANCE
  class CovariantList[+A]
  val animal:Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  // animalList.add(new Dog) ??? HARD QUESTION => we return a list of animal

  // 2. NO = INVARIANCE
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  // 3. Hell, no! CONTRAVARIANCE
  class ContravariantList[-A]
  val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal]

  // bounded types
  class Cage[A <: Animal](animal: A)
  val cage = new Cage(new Dog)

  class Car
  //val newCage = new Cage(new Car)


  // expand MyList to be generic

}