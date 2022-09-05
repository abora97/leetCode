fun main() {
    println(lengthOfLastWord("Hello World"))
    println(lengthOfLastWord("  fly me   to   the moon  "))
    println(lengthOfLastWord("luffy is still joyboy"))
}


fun lengthOfLastWord(s: String): Int {
    val stringList=s.trim().split(" ")
    return stringList[stringList.size-1].length
}
