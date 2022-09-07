fun main() {
    println(addBinary("11","1"))
    println(addBinary("1010","1011"))
}

fun addBinary(a: String, b: String): String {
    return (a.toBigInteger(2)  +  b.toBigInteger(2)).toString(2)
}