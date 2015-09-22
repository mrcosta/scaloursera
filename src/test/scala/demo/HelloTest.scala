package demo

import org.scalatest.FunSuite

/**
 * Created by mcosta on 9/22/15.
 */
class HelloTest extends FunSuite {
  test("sayHello method works correctly") {
    val hello = new Hello
    assert(hello.sayHello("Scala") == "Hello, Scala!")
  }
}
