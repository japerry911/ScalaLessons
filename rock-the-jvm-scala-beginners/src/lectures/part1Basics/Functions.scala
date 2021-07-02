package lectures.part1Basics

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
}
