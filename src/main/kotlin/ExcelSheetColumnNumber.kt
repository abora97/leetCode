fun main() {
  println(  titleToNumber("A"))
  println(  titleToNumber("AB"))
  println(  titleToNumber("ZY"))
}

fun titleToNumber(columnTitle: String): Int {
    if (columnTitle == null) return -1
    var sum = 0
    // for each loop so we don't need to mess with index values.
    for (c in columnTitle.toUpperCase().toCharArray()) {
        sum *= 26
        sum += c.toInt() - 'A'.toInt() + 1
    }
    return sum

}