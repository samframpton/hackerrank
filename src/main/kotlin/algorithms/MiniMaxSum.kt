package algorithms

fun miniMaxSum(arr: Array<Int>) {
    val sum = arr.sumOf { it.toLong() }
    println("${sum - arr.max()} ${sum - arr.min()}")
}
