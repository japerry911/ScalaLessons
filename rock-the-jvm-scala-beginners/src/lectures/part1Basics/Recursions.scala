package lectures.part1Basics

import scala.annotation.tailrec

object Recursions extends App {
  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)
      result
    }

  println(factorial(10))
//  println(factorial(5000))  // StackOverflow error

  def anotherFactorial(n: Int): BigInt = {
    // TAIL RECURSION = use recursive call as the last expression
    @tailrec
    def factorialHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factorialHelper(x - 1, accumulator * x)

    factorialHelper(n, 1)
  }

  /*
  anotherFactorial(10) = factorialHelper(10, 1)
  = factorialHelper(9, 10 * 1)
  = factorialHelper(8, 10 * 9 * 1)
  = factorialHelper(7, 10 * 9 * 8 * 1)
  = factorialHelper(6, 10 * 9 * 8 * 7 * 1)
  = ...
  = factorialHelper(2, 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 1)
  = factorialHelper(1, 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1)
  = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1
   */

  println(anotherFactorial(50000))

  // When you need loops, use TAIL_RECURSION

  /*
  Exercises:
    1.) Concatenate a String n times
    2.) isPrime function that is tail recursive
    3.) Fibonacci function that is tail recursive
   */
}
