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
    1.) Concatenate a String n times, tail recursive
    2.) isPrime function that is tail recursive
    3.) Fibonacci function that is tail recursive
   */

  // 1.)
  @tailrec
  def concatenateNTimes(aString: String, n: Int, returnString: String = ""): String =
    if (n == 1) returnString
    else concatenateNTimes(aString, n - 1, aString + returnString)

  println(concatenateNTimes("Skylord", 10))

  // 2.)
  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailRec(t - 1, n % t != 0 && isStillPrime)
    }

    isPrimeTailRec(n / 2, isStillPrime = true)
  }

  println(isPrime(2003))  // True
  println(isPrime(629))  // False

  // 3.)
  def fibonacci(n: Int): Int = {
    @tailrec
    def fiboTailRec(i: Int, last: Int, nextToLast: Int): Int =
      if (i >= n) last
      else fiboTailRec(i + 1, last + nextToLast, last)
    if (n <= 2) 1
    else fiboTailRec(2, 1, 1)
  }

  println(fibonacci(8))  // 21
}
