package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Coputing factorial of " + n + " - I first need factorial of " + (n-1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)

      result
    }

//    println(factorial(5))

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // TAIL RECURSION = use recursive call as the LAST expression

    factHelper(n, 1)
  }

//  println(anotherFactorial(20000))

  // WHEN YOU NEED LOOPS, USE _TAIL_ RECURSION.

  /*
    1. Concatenate a string n times
    2. IsPrime function tail recursive
    3. Fibonacci function, tail recursive
   */

  def concatString(n: Int, s: String): String = {
    if (n > 1) s
    else concatString(n - 1, s + s)
  }

  //my prime was previously recursive, in use the same
  def primeNumber(n: Int): Boolean = {
    def testPrime(n: Int, i: Int): Boolean = {
      if (i == n) {
        return true
      } else if (n % i == 0 && (i != 1 || i != n)) {
        return false
      } else {
        return testPrime(n, i + 1)
      }
    }

    return testPrime(n, 2)
  }

  def fibonacci(n: Int): Int = {
    def fibonacciHelper(n: Int, i: Int, accumulator1: Int, accumulator2: Int): Int =
      if (n <= i) accumulator1 + accumulator2
      else fibonacciHelper(n, i + 1, accumulator2, accumulator1 + accumulator2)

    fibonacciHelper(n, 2,0, 1)
  }

  println(fibonacci(6))
}
