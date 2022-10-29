fun main() {
    println(validWordSquare(listOf("abcd", "bnrt", "crmy", "dtye"))) // true
    println(validWordSquare(listOf("abcd", "bnrt", "crm", "dt"))) // true
    println(validWordSquare(listOf("ball", "area", "read", "lady"))) // false
    println(validWordSquare(listOf("ball", "asee", "let", "lep"))) // false
}


fun validWordSquare(words: List<String>): Boolean {
    for (i in words.indices) {
        var tempString = ""
        for (j in words.indices) {
            if (i <= words[j].length - 1) {
                tempString += words[j][i].toString()
            }
        }
        if (tempString != words[i]) {
            return false
        }
    }
    return true
}