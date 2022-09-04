
fun main() {
    println(searchInsert(arrayOf(1,2,3,4,5,6,7).toIntArray(),4)) //3
    println(searchInsert(arrayOf(1,3,5,6).toIntArray(),5))      //2
    println(searchInsert(arrayOf(1,3,5,6).toIntArray(),2))      //1
    println(searchInsert(arrayOf(1,3,5,6).toIntArray(),7))      //4
    println(searchInsert(arrayOf(2,3,5,6).toIntArray(),1))      //0
    println(searchInsert(arrayOf(1, 2, 5).toIntArray(), 4))     //2
}


fun searchInsert(nums: IntArray, target: Int): Int {
    if (nums.contains(target)) return nums.indexOf(target)

    if (target > nums[nums.size - 1]) return nums.size
    var old = 0
    var new = 0
    nums.forEachIndexed { index, i ->
        new=i
        if (target in (old + 1) until new) {
            return index
        }
        old=new
    }

    return 0

}

fun searchInsert1(nums: IntArray, target: Int): Int {
    val pos: Int = nums.binarySearch(target)
    return if (pos >= 0) pos else -pos -1
}