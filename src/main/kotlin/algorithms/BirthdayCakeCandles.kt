package algorithms

fun birthdayCakeCandles(candles: Array<Int>): Int {
    val max = candles.max()
    return candles.count { it == max }
}
