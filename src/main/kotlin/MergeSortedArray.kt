fun main() {
    merge(arrayOf(2,3,4,0,0).toIntArray(), 3,arrayOf(2,1).toIntArray(),2)
    merge(arrayOf(1,2,3,0,0,0).toIntArray(), 3,arrayOf(2,5,6).toIntArray(),3)
    merge(arrayOf(0).toIntArray(), 0,arrayOf(1).toIntArray(),1)

}

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    val result=(nums1.toMutableList().dropLast(nums1.size -m) + nums2.toMutableList().dropLast(nums2.size -n)).sorted()
}