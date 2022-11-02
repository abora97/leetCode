fun main (){

    println(canPlaceFlowers(arrayOf(1, 0, 0, 0, 1).toIntArray(), 1)) // true
    println(canPlaceFlowers(arrayOf(1, 0, 0, 0, 1).toIntArray(), 2)) // false
    println(canPlaceFlowers(arrayOf(1, 0, 0, 0, 0, 1).toIntArray(), 2)) // false
    println(canPlaceFlowers(arrayOf(1,0,0,0,0,0,1).toIntArray(), 2)) // true
}

fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {

    var counter = 0
    for (i in flowerbed.indices) {
        val left = if (i == 0) 0 else flowerbed[i - 1]
        val right = if (i == flowerbed.lastIndex) 0 else flowerbed[i + 1]
        if (left == 0 && right == 0 && flowerbed[i] == 0) {
            flowerbed[i] = 1
            counter++
        }
    }

    return counter >= n
}