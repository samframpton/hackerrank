package algorithms

fun timeConversion(s: String): String {
    var hour = s.take(2).toInt()
    if (hour == 12 && s[8] == 'A') {
        hour = 0
    } else if (hour < 12 && s[8] == 'P') {
        hour += 12
    }
    return hour.toString().padStart(2, '0') + s.substring(2, 8)
}
