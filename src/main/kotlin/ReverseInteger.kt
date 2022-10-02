
fun main(){
    println(reverse(123))
    println(reverse(-123))
    println(reverse(120))
    println(reverse(1534236469))

}

fun reverse(x: Int): Int {
    val xString = x.toString()
    return try {
        if (xString.contains("-")) {
            ("-${xString.drop(1).reversed()}").toInt()
        } else {
            xString.reversed().toInt()
        }

    } catch (e: Exception) {
        0
    }

}