import java.util.*
import kotlin.collections.HashMap

fun main() {
    println(romanToInt("III"))
    println(romanToInt("LVIII"))
    println(romanToInt("MCMXCIV"))
}
// M CM XC IV
// 1000 + 900 + 90 + 4

fun romanToInt(s: String): Int {

    val romanHashMap: HashMap<String, Int> = HashMap()
    romanHashMap["I"] = 1
    romanHashMap["V"] = 5
    romanHashMap["X"] = 10
    romanHashMap["L"] = 50
    romanHashMap["C"] = 100
    romanHashMap["D"] = 500
    romanHashMap["M"] = 1000
    romanHashMap["IV"] = 4
    romanHashMap["IX"] = 9
    romanHashMap["XL"] = 40
    romanHashMap["XC"] = 90
    romanHashMap["CD"] = 400
    romanHashMap["CM"] = 900

    val romanNumList = s.toCharArray()
    var loopCount = 0
    var total=0
    do {
       if (loopCount+1 < romanNumList.size && romanHashMap.containsKey("${romanNumList[loopCount]}${romanNumList[loopCount+1]}")){
           total+= romanHashMap["${romanNumList[loopCount]}${romanNumList[loopCount+1]}"]!!
           loopCount+=2
       }else{
           total+=romanHashMap["${romanNumList[loopCount]}"]!!
           loopCount++
       }
    } while (loopCount < romanNumList.size)


    return total
}


