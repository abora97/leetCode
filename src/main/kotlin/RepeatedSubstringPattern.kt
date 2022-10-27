fun main() {
    println(repeatedSubstringPattern("abab"))  //true  b abab a
    println(repeatedSubstringPattern("aba"))  //false  baab
    println(repeatedSubstringPattern("abcabcabcabc")) //true  a bcabcabcabcabcabcabcab c
    println(repeatedSubstringPattern("a")) //false
    println(repeatedSubstringPattern("abaababaab")) //true  abaab abaababaab abaab
    println(repeatedSubstringPattern("aabaaba")) //false
    println(repeatedSubstringPattern("abac")) //false acab
    println(repeatedSubstringPattern("ababab")) //true bababababa
    println(repeatedSubstringPattern("babbabbabbabbab")) //true bababa

}

// abcabc abcab

fun repeatedSubstringPattern(s: String): Boolean {

    return  (s + s).run {
        substring(1, lastIndex)
    }.contains(s)

//    return (s.removeRange(0 until s.length/2)+s.removeRange(s.lastIndex-s.length/2+1 until s.lastIndex)) in s
}
