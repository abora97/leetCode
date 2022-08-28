fun main() {
    println(isValid("()")) // true
    println(isValid("()[]{}")) // true
    println(isValid("(]")) // false
    println(isValid("{[]}")) //true
    println(isValid("([)]")) //false
}

fun isValid(s: String): Boolean {
    if (s == "") { return true }
    val simplified = s.replace("()", "").replace("{}", "").replace("[]", "")
    if (simplified == s) { return false }
    return isValid(simplified)
}
