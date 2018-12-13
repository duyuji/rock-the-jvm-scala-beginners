package lectures.part2oop

import java.time.Year
import java.time.temporal.TemporalAmount

object OOBasics extends App {

  val person = new Person("Eduardo", 29)
  println(person.age)
  person.greet("João")
  person.greet()
}

// constructor
class Person(name: String, val age: Int) {
  // body
  val x = 2

  println(1 + 3)

  // method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greet(): Unit = println(s"Hi, I am $name")

  // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("Eduardo")
}

/*
  Novel and a Writer

  Writer: first name, surname, year
    - method fullname

  Novel: name, year of release, author
  - authorAge
  - isWrittenBy(author)
  - copy (new year of release) = new instance of Novel

 */

/*

  Counter class
    - receives an int value
    - method current count
    - method to increment/decrement => new Counter
    - overload inc/dec to receive an amount

 */

class Writer(firstName: String, surname: String, val year: Int) {

  def fullname() = {
    s"$firstName $surname"
  }

}

class Novel(name: String, yearOfRelease: Int, author: Writer) {

  def authorAge = {
    Year.now.getValue - author.year
  }

  def isWrittenBy = {
    author.fullname
  }

  def copy(newYearOfRelease: Int) = {
    new Novel(name, newYearOfRelease, author)
  }

}

class Counter(counter: Int) {

  def currentCounter = {
    counter
  }

  def increment = {
    new Counter(counter + 1)
  }

  def decrement = {
    new Counter(counter - 1)
  }

  def increment(amount: Int) = {
    new Counter(counter + amount)
  }

  def decrement(amount: Int) = {
    new Counter(counter - amount)
  }
}

// class parameters are NOT FIELDS