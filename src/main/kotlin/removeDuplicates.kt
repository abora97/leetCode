fun main(){
    println(removeDuplicates(arrayOf(1,1,2).toIntArray()))
    println(removeDuplicates(arrayOf(0,0,1,1,1,2,2,3,3,4).toIntArray()))

}

fun removeDuplicates(nums: IntArray) = nums.toList().distinct().also { it.forEachIndexed { i, n -> nums[i] = n} }.size
