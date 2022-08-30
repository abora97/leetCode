fun main(){
    println(removeElement(arrayOf(3,2,2,3).toIntArray(),3))
}

fun removeElement(nums: IntArray, `val`: Int): Int {
    val listNum=nums.toMutableList()
    listNum.removeIf { it==`val` }
    listNum.forEachIndexed { i, n -> nums[i] = n}
    return listNum.size
}