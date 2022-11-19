fun main() {
    println(majorityElement(arrayOf(3, 2, 3).toIntArray()))
    println(majorityElement(arrayOf(2,2,1,1,1,2,2).toIntArray()))
}

fun majorityElement(nums: IntArray): Int {

    var majorNum=0
    var majorCount=0

    nums.distinct().forEach {currentNum ->
        if (majorCount < nums.count { it == currentNum }){
            majorNum=currentNum
            majorCount=nums.count { it == currentNum }
        }

    }


    return majorNum
}