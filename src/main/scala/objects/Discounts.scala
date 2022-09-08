package objects

object Discounts {
  def apply(totalNumberOfApples: Int, totalNumberOfOranges: Int): Double = {

    val appleDiscount: Double = (totalNumberOfApples / 2) * Apple.price

    val orangeDiscount: Double = (totalNumberOfOranges / 3) * Orange.price

    val totalDiscount: Double = appleDiscount + orangeDiscount

    totalDiscount

  }

}
