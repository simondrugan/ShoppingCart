package service

import objects.{Apple, Discounts, Orange}

object Checkout {

  def run(itemsToCheckout: List[String]): String = {

    // initialise counters
    var sumOfItemPrices: Double = 0.0
    var totalNumberOfApples: Int = 0
    var totalNumberOfOranges: Int = 0

    // loop around all strings in the list provided
    for(item <- itemsToCheckout) {
      // make the code not case sensitive
      val itemLowerCase = item.toLowerCase()

      // match the items in the list to the correct object
      itemLowerCase match {
        case "orange" =>
          sumOfItemPrices += Orange.price
          totalNumberOfOranges += 1
        case "apple" =>
          sumOfItemPrices += Apple.price
          totalNumberOfApples += 1
      }
    }

    // calculate the total discount using the item counters
    val totalDiscount = Discounts.apply(totalNumberOfApples, totalNumberOfOranges)

    // find the total price by subtracting all discounts
    val totalPrice: Double = (sumOfItemPrices - totalDiscount) / 100

    // correctly format the final price
    val finalPrice: String = (f"£$totalPrice%.2f")

    // return the final price
    finalPrice
  }

}
