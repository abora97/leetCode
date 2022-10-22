fun main() {
    println(canMakeArithmeticProgression(arrayOf(3, 5, 1).toIntArray())) // true
    println(canMakeArithmeticProgression(arrayOf(1, 2, 4).toIntArray())) // false
    println(canMakeArithmeticProgression(arrayOf(0, 12, 4, 8).toIntArray())) // true
    println(canMakeArithmeticProgression(arrayOf(12, 40, 11, 20).toIntArray())) // false
    println(canMakeArithmeticProgression(arrayOf(0,0,1).toIntArray())) // false

}

fun canMakeArithmeticProgression(arr: IntArray): Boolean {
    val sortedArr = arr.toMutableList().sorted()

    var diff : Int? = null

    sortedArr.forEachIndexed { index, i ->
        if (index < sortedArr.size-1) {
            val tempDiff = sortedArr[index] - sortedArr[index + 1]
            if (diff != null && diff != tempDiff) {
                return false
            }
            diff = tempDiff
        }
    }

    return true
}