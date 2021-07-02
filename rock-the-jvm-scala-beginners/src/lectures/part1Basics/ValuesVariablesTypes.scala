package lectures.part1Basics

object ValuesVariablesTypes extends App {
  val x: Int = 42
  println(x)

  // vals are immutable
  // types of vals are optional, compiler can infer type
  val y = 42
  println(y)

  val aString: String = "Hello"
  println(aString)

  val aBoolean: Boolean = true  // false
  println(aBoolean)

  val aChar: Char = 'a'
  println(aChar)

  val aInt: Int = 123
  println(aInt)

  val aShort: Short = 4613
  println(aShort)

  val aLong: Long = 1234567890L
  println(aLong)

  val aFloat: Float = 2.0f
  println(aFloat)

  val aDouble: Double = 3.14
  println(aDouble)

  // Variables || can be reassigned/mutable
  var aVariable: Int = 4
  println(aVariable)
  aVariable = 5  // side effects
  println(aVariable)

  /*
  Takeaways:
    - prefer vals over vars
    - all vals and vars have types
    - compiler automatically infers types when omitted
    - learned how to use basic types
      - boolean
      - int, long, double
      - string
   */
}
