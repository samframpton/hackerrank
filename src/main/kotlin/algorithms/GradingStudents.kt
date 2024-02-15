package algorithms

fun gradingStudents(grades: Array<Int>) = grades.map {
    var grade = it
    if (grade > 37) {
        val remainder = grade % 5
        if (remainder > 2) grade += 5 - remainder
    }
    grade
}.toTypedArray()
