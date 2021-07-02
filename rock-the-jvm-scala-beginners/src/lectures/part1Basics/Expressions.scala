package lectures.part1Basics

object Expressions extends App {
  val x: Int = 1 + 2  // Expression
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable: Int = 2
  println(aVariable)
  aVariable += 3  // += -= *= /=
  println(aVariable)

  // Instructions vs Expressions
  // Instruction - something you tell computer to do
  // Expression - something that has value and/or type

  // IF expression
  val aCondition: Boolean = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)

  var i: Int = 0
  while (i < 10) {
    println(i)
    i += 1
  }
  // NEVER WRITE THIS AGAIN ^

  // Everything in Scala is an Expression

  val aWeirdValue = (aVariable = 3)  // Unit == void
  println(aWeirdValue)

  // Code Blocks
  val aCodeBlock: String = {
    val y: Int = 2
    val z: Int = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  //  val anotherValue  = z + 1
  // Not within block, fails

  /*
  Takeaways:
    - Basic expressions - operators
    - If in Scala is an expression
    - Code Blocks in Scala are expressions
      - the value of the block is the value of the last expression
    - Expressions vs Instructions
      - instructions are executed (think Java), expressions are evaluated (Scala)
      - In Scala, we'll think in terms of expressions
   */

  // Exercises

  // 1. Difference between "hello world" and println("hello world")
  // - "hello world" - string side effect
  // - println("hello world") - unit

  // 2. What's value of this Code Block - Boolean
  val someValue: Boolean = {
    2 < 3
  }

  // 3. And this - Int
  val someOtherValue: Int = {
    if (someValue) 239 else 986
    42
  }
}
