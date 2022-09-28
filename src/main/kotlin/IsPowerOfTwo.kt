
fun main() {
    println(isPowerOfTwo(1))
    println(isPowerOfTwo(16))
    println(isPowerOfTwo(3))
    println(isPowerOfTwo(6))
}

fun isPowerOfTwo(n: Int): Boolean {
    if (n == 0) return false
    return n.toLong() and n.toLong() - 1 == 0L
}