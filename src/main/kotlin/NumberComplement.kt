fun main() {
    println(findComplement(5))
    println(findComplement(1))
   println(findComplement(4))
}


fun findComplement(num: Int): Int {
    val binaryString = num.toString(2)
    return binaryString.replace("0","-").replace("1","0").replace("-","1").toBigInteger(2).toInt()
}

