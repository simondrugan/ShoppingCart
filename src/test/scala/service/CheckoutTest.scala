package service

import objects.{Apple, Orange}
import org.scalatest.funsuite.AnyFunSuite

class CheckoutTest extends AnyFunSuite{

  test("that an apple has a price of 60 pence") {
    val applePrice = Apple.price
    assert(applePrice === 60)
  }

  test("that an orange has a price of 25 pence") {
    val orangePrice = Orange.price
    assert(orangePrice === 25)
  }

  test("that checkout can add prices of an apple and orange") {
    val itemsToCheckout = List("Apple", "Orange")
    val testTotalPrice = Checkout.run(itemsToCheckout)
    assert(testTotalPrice == "£0.85")
  }

}
