fun main(){
    println(isHappy(166))
    println("false ********************************")
    println(isHappy(19))
    println("true ********************************")
    println(isHappy(2))
    println("false ********************************")
    println(isHappy(20))
    println("false ********************************")
    println(isHappy(190))
    println("true ********************************")
    println(isHappy(7))
    println("true ********************************")
    println(isHappy(11))
    println("false ********************************")
}

fun isHappy(n: Int): Boolean {
    return checkIsHappy(n.toString().map { it.toString().toInt() }.toIntArray())
}

fun checkIsHappy(arrNum: IntArray,submits:MutableList<Int> = arrayListOf()): Boolean {
    var total = 0

    arrNum.map { total += it*it }
    if (submits.isNullOrEmpty().not()){
        if (submits.contains(total)){
            return false
        }
    }
    submits.add(total)
    return if (total == 1) {
        true
    } else {
        checkIsHappy(total.toString().map { it.toString().toInt() }.toIntArray(),submits)
    }

}