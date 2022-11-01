fun main(){
    println(detectCapitalUse("USA")) // true
    println(detectCapitalUse("leetcode")) // true
    println(detectCapitalUse("Google")) // true
    println(detectCapitalUse("FlaG")) // false
}


fun detectCapitalUse(word: String): Boolean {
    var capitalCount = 0
    word.forEach {
        if (it.isUpperCase())
            capitalCount += 1
    }

    if (capitalCount == 1 && word[0].isUpperCase())
        return true
    if (capitalCount == word.length || capitalCount==0)
        return true

    return false
}