

fun main() {
   println(isIsomorphic("egg", "add")) // true
    println(isIsomorphic("foo", "bar")) // false
    println(isIsomorphic("paper", "title")) // true
    println(isIsomorphic("badc", "baba")) // false

}

fun isIsomorphic(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    var hashMap: HashMap<String, String> = HashMap<String, String>()
    val sList = s.toMutableList()
    val tList = t.toMutableList()
    sList.forEachIndexed { index, c ->
        if (hashMap.containsKey(c.toString()) || hashMap.containsKey(tList[index].toString())) {
            if (hashMap[c.toString()].equals(tList[index].toString()).not()) {
                return false
            }
        } else {
            hashMap[c.toString()] = tList[index].toString()
        }

    }
    return true
}
