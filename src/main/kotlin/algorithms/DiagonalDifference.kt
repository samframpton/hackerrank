package algorithms

import kotlin.math.abs

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var d1 = 0
    var d2 = 0
    for (i in arr.indices) {
        d1 += arr[i][i]
        d2 += arr[i][arr.size - 1 - i]
    }
    return abs(d1 - d2)
}
