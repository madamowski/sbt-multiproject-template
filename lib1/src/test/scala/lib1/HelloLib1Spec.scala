package lib1

import org.scalatest.{Matchers, FlatSpec}

class HelloLib1Spec extends FlatSpec with Matchers {

  it should "return value" in {
    HelloLib1.hello() should be ("Hello from Lib1")
  }

  "This" should "throw Exception" in {
    val x = null
    a [NullPointerException] should be thrownBy {
      x.toString;
    }
  }

}
