package objects

object Discounts {
  def apply(totalNumberOfApples: Int): Double = {

    val appleDiscount: Double = (totalNumberOfApples / 2) * Apple.price

    appleDiscount

  }

}
