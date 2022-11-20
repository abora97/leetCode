fun main() {
    println(permute(arrayOf(1, 2, 3).toIntArray()))
}

fun permute(nums: IntArray): List<List<Int>>? {
    val result = mutableListOf<List<Int>>()
    doPermute(nums.asList(), result, listOf(), nums.size)

    return result
}

fun doPermute(nums: List<Int>, result: MutableList<List<Int>>, acc: List<Int>, size: Int) {
    if(acc.size == size) {
        result.add(acc)
        return
    }

    nums.forEachIndexed { index, elem ->
        doPermute(nums - elem, result, acc + elem, size)
    }
}
