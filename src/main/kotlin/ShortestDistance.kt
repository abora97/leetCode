
fun main() {

    println(
        shortestDistance(
            arrayOf("practice", "makes", "perfect", "coding", "makes"),
            "coding",
            "practice"
        )
    )

    println(
        shortestDistance(
            arrayOf("coding", "perfect", "makes", "practice", "makes"),
            "makes",
            "coding"
        )
    )

    println(
        shortestDistance(
            arrayOf("practice", "makes", "perfect", "coding", "makes"),
            "makes",
            "coding"
        )
    )
}


fun shortestDistance(wordsDict: Array<String>, word1: String, word2: String): Int {

    var word1Index: Int? = null
    var word2Index: Int? = null
    var shortDistance = wordsDict.size + 1
    wordsDict.forEachIndexed { index, s ->
        when (s) {
            word1 -> {
                word1Index = index
            }
            word2 -> {
                word2Index = index
            }
        }

        if (word1Index != null && word2Index != null) {
            val temp = if (word1Index!! > word2Index!!) {
                word1Index!! - word2Index!!
            } else {
                word2Index!! - word1Index!!
            }
            if (temp < shortDistance) {
                shortDistance = temp
            }
        }
    }

    return shortDistance
}
