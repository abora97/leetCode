fun main() {
    println(hammingWeight(10000000000000000000000010000000).toString())
    println(hammingWeight(00000000000000000000000010000000).toString())
}

fun hammingWeight(n:Int):Int {
    var num=n
    var numOfOne=0
    for (i in 0..31){
        if (num and 1 == 1){
            numOfOne++
        }
        num = num shr 1 //shifts your bits to right
                        /** move 1 num at first */
    }

    return numOfOne
}

//fun hammingWeight(n:Int):Int {
//    val num=n.toString().toMutableList()
//    var numOfOne=0
//    for (i in 0..31){
//        if (num[i]=='1'){
//            numOfOne++
//        }
//    }
//
//    return numOfOne
//}

//fun hammingWeight(n:Int):Int {
//    return n.toString().replace("0","").toMutableList().size
//}