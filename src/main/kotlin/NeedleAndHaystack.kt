
fun main(){
    println(strStr("hello","ll"))
    println(strStr("aaaaa","bba"))
    println(strStr("mississippi","issip"))
}



fun strStr(haystack: String, needle: String): Int {

    if (haystack.contains(needle)){
        haystack.replace(needle,"@").toCharArray().forEachIndexed { index, c ->
            if (c == '@'){
                return index
            }
        }
    }

    return -1
}
