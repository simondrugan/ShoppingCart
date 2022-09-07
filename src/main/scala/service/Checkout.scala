package service

import objects.{Apple, Orange}

object Checkout {

  def run(itemsToCheckout: List[String]): String = {

    var totalPrice: Double = 0.0

    for(item <- itemsToCheckout) {
      val itemLowerCase = item.toLowerCase()

      itemLowerCase match {
        case "orange" =>
          totalPrice += Orange.price
        case "apple" =>
          totalPrice += Apple.price
      }
    }

    val convertPriceToPounds: Double = totalPrice/100

    val finalPrice: String = (f"£$convertPriceToPounds%.2f")

    finalPrice
  }

}
