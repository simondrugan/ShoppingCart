import service.Checkout

object ShoppingCartMain {

  def main(args: Array[String]) {

    // enter items to be evaluated
    val itemsToCheckout = List("Apple", "Orange", "Apple", "Orange")

    println(Checkout.run(itemsToCheckout))
  }
}
