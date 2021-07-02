package lectures.part1Basics

import scala.annotation.tailrec

object Functions extends App {
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }
  println(aFunction("hello", 3))

  def aParameterLessFunction(): Int = 42
  println(aParameterLessFunction())
  println(aParameterLessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString else aString + aRepeatedFunction(aString, n - 1)
  }
  println(aRepeatedFunction("Chippy", 10))

  // When you need Loops, use Recursion

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)
  println(aFunctionWithSideEffects("Test"))

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(1, n)
  }
  println(aBigFunction(10))

  /*
  Exercises:
    1.) A greeting function (name, age) => "Hi, my name is $name and I am $age years old"
    2.) Factorial function (n) => 1 * 2 * 3 * ... * n
    3.) Fibonacci function
      f(1) = 1
      f(2) = 1
      f(n) = f(n - 1) + f(n - 2)
    4.) Function that tests if a number is prime
   */

  // 1.)
  def greetings(name: String, age: Int): Unit =
    println("Hi, my name is " + name + " and I am " + age + " years old")
  greetings("Jack", 100)

  // 2.)
  def factorial(n: Int): Int = if (n <= 1) n else n * factorial(n - 1)
  println(factorial(10) + " == 3,628,800")

  // 3.)
  def fibonacci(n: Int): Int =
    if (n <= 2) 1 else fibonacci(n - 1) + fibonacci(n - 2)
  println(fibonacci(10) + " == 55")

  // 4.)
  // class version
  def isPrime2(n: Int): Boolean = {
    @tailrec
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) false
      else if (n % t == 0) false
      else isPrimeUntil(t - 1)
    isPrimeUntil(n / 2)
  }

  // my version
  def isPrime(n: Int): Boolean = {
    @tailrec
    def checkPrime(n: Int, i: Int): Boolean =
      if (i >= n) true else if (n % i == 0) false else checkPrime(n, i + 1)

    if (n <= 1) false else checkPrime(n, 2)
  }
  println("1 is Prime: False == " + isPrime(1))
  println("17 is Prime: True == " + isPrime(17))
  println("100 is Prime: False == " + isPrime(100))
}
