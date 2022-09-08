package objects

object Discounts {
  def apply(totalNumberOfApples: Int, totalNumberOfOranges: Int): Double = {

    //calculate the total discount depending on the number of items purchased
    val appleDiscount: Double = (totalNumberOfApples / 2) * Apple.price
    val orangeDiscount: Double = (totalNumberOfOranges / 3) * Orange.price
    val totalDiscount: Double = appleDiscount + orangeDiscount

    // return the total discount
    totalDiscount

  }

}
