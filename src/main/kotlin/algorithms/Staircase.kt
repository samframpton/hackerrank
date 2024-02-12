package algorithms

fun staircase(n: Int) {
    for (i in 1..n) {
        println(" ".repeat(n - i) + "#".repeat(i))
    }
}
