package algorithms

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    val result = arrayOf(0, 0)
    for (i in a.indices) {
        if (a[i] > b[i]) {
            result[0]++
        } else if (b[i] > a[i]) {
            result[1]++
        }
    }
    return result
}
