fun main() {
    println(twoSum(arrayOf(2, 7, 11, 15).toIntArray(), 9).toList()) //[0,1]
    println(twoSum(arrayOf( 7, 11, 15,2).toIntArray(), 9).toList()) //[0,3]
    println(twoSum(arrayOf(3, 2, 4).toIntArray(), 6).toList()) //[1, 2]
    println(twoSum(arrayOf(3, 3).toIntArray(), 6).toList()) //[0, 1]
}


fun twoSum(nums: IntArray, target: Int): IntArray {

    val diffMap = mutableMapOf<Int, Int>()
    nums.forEachIndexed { index, int ->
        diffMap[int]?.let {
            return intArrayOf(it, index)
        }
        diffMap[target - int] = index
    }
    return intArrayOf()
}
