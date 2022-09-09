fun main() {
   println(climbStairs(2)) // 1+1 - 2
    println(climbStairs(3)) // 1+1+1 - 2+1 - 1+2
    println(climbStairs(4)) // 1+1+1+1 - 2+2 - 2+1+1 - 1+2+1 - 1+1+2
}

fun climbStairs(n: Int): Int {
    var prevPrev = 1
    var prev = 1
    for(i in 2 until n + 1){
        val temp = prev
        prev += prevPrev
        prevPrev = temp
    }
    return prev
}
