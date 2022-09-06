fun main() {
println(plusOne(arrayOf(1,2,3).toIntArray()).toList())
    println(plusOne(arrayOf(4,3,2,1).toIntArray()).toList())
    println(plusOne(arrayOf(9).toIntArray()).toList())
    println(plusOne(arrayOf(9,9,9,9,9,9,9).toIntArray()).toList())
    println(plusOne(arrayOf(9,9,9,8,9,9,9).toIntArray()).toList())
    println(plusOne(arrayOf(7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6).toIntArray()).toList())
}

fun plusOne(digits: IntArray): IntArray {
    for (i in (digits.size-1) downTo 0) {
        if(digits[i] == 9) {
            digits[i] = 0
            if(i == 0) {
                return intArrayOf(1,*digits) //the asterisk before *digits is similar to a spread operator
            }
        } else {
            digits[i] = digits[i] + 1
            break
        }
    }
    return digits
}