fun main() {
    println(isPalindrome("A man, a plan, a canal: Panama"))
    println(isPalindrome("race a car"))
    println(isPalindrome(" "))
}

fun isPalindrome(s: String): Boolean {
    val re = Regex("[^A-Za-z0-9]")
    val cleanText = re.replace(s, "").lowercase()
    return cleanText == cleanText.reversed()
}