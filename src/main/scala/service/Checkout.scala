package service

import objects.{Apple, Discounts, Orange}

object Checkout {

  def run(itemsToCheckout: List[String]): String = {

    var sumOfItemPrices: Double = 0.0
    var totalNumberOfApples: Int = 0
    var totalNumberOfOranges: Int = 0

    for(item <- itemsToCheckout) {
      val itemLowerCase = item.toLowerCase()

      itemLowerCase match {
        case "orange" =>
          sumOfItemPrices += Orange.price
          totalNumberOfOranges += 1
        case "apple" =>
          sumOfItemPrices += Apple.price
          totalNumberOfApples += 1
      }
    }

    val totalDiscount = Discounts.apply(totalNumberOfApples, totalNumberOfOranges)

    val totalPrice: Double = (sumOfItemPrices - totalDiscount) / 100

    val finalPrice: String = (f"£$totalPrice%.2f")

    finalPrice
  }

}
