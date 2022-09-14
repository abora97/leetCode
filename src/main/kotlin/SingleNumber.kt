fun main() {
    println(singleNumber(arrayOf(2,2,1).toIntArray()))
    println(singleNumber(arrayOf(4,1,2,1,2).toIntArray()))
    println(singleNumber(arrayOf(1).toIntArray()))
}

fun singleNumber(nums: IntArray): Int {
    /**
     * in case iteration
     *                  1- acc is the result of the last iteration
     *                  2- i is the second element
     *
     */
    return nums.reduce { acc, i -> acc xor i }
}