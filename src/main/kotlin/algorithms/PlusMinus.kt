package algorithms

import java.text.DecimalFormat

fun plusMinus(arr: Array<Int>) {
    val f = DecimalFormat("0.000000")
    println(f.format(arr.count { it > 0 }.toFloat() / arr.size))
    println(f.format(arr.count { it < 0 }.toFloat() / arr.size))
    println(f.format(arr.count { it == 0 }.toFloat() / arr.size))
}
