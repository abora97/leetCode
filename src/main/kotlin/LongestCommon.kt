fun main() {

    println(longestCommonPrefix(arrayOf("flower", "flow", "flight")))
    println(longestCommonPrefix(arrayOf("dog", "racecar", "car")))
    println(longestCommonPrefix(arrayOf("a")))
    println(longestCommonPrefix(arrayOf("cir", "car")))
    println(longestCommonPrefix(arrayOf("flower", "flower", "flower", "flower")))
}

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.size <= 1) return strs.getOrNull(0) ?: ""

    var minLength = strs[0].length

    for (str in strs) if (str.length < minLength) minLength = str.length

    var result = StringBuilder()

    for (i in 0 until minLength) {
        var count = 0
        var currentItem = ""

        for (str in strs) {
            if (currentItem == "" || str[i].toString() == currentItem) {
                count++
                currentItem = str[i].toString()
            }
        }

        if (count == strs.size) {
            result.append(strs[0][i].toString())
        } else {
            return result.toString()
        }
    }

    return result.toString()
}
