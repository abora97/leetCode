fun main() {
    println(numRabbits(arrayOf(0,1,0,2,0,1,0,2,1,1).toIntArray()))    //11   0=4==4 1=4==4  2=2==3
    println(numRabbits(arrayOf(0,0,1,1,1).toIntArray()))    //6
    println(numRabbits(arrayOf(2,1,2,2,2,2,2,2,1,1).toIntArray()))    //13
    println(numRabbits(arrayOf(1, 0, 1, 0, 0).toIntArray()))    //5
    println(numRabbits(arrayOf(1, 1, 2).toIntArray()))  //5
    println(numRabbits(arrayOf(10, 10, 10).toIntArray()))   //11
}



fun numRabbits(answers: IntArray): Int {
    var rabbitsCount = 0
    if (answers.isEmpty()) return 0
    val colorsHashMap = HashMap<Int, Int>()
    answers.forEach {
        if (colorsHashMap.containsKey(it)) {
            val k = colorsHashMap[it]!!
            if (k <= it) {
                colorsHashMap[it] = k + 1
            } else {
                rabbitsCount += it + 1
                colorsHashMap[it] = 1
            }
        } else {
            rabbitsCount += it + 1
            colorsHashMap[it] = 1
        }
    }

    return rabbitsCount
}

//fun numRabbits(answers: IntArray): Int {
//    var rabbitsCount = 0
//    val hashMap: HashMap<Int, Int> = HashMap()
//    answers.forEach {
//        if (it==0){
//            rabbitsCount+=1
//        }else{
//            if (hashMap.containsKey(it)){
//                hashMap[it]= hashMap[it]!!.plus(1)
//            }else{
//                hashMap[it]=1
//            }
//        }
//    }
//
//    hashMap.forEach { (key, value) ->
//        if (value > key+1){
//            rabbitsCount+=value+key
//        }else{
//            rabbitsCount+=key+1
//        }
//    }
//
//    return rabbitsCount
//}

//fun numRabbits(answers: IntArray): Int {
//    var rabbitsCount = 0
//    val tempColors: MutableList<Int> = arrayListOf()
//    answers.sorted().forEach {
//        if (it == 0) {
//            rabbitsCount+=1
//        } else {
//            if (tempColors.contains(it).not()){
//                rabbitsCount += it + 1
//
//                tempColors.add(it)
//            }
//        }
//    }
//
//    return rabbitsCount
//}