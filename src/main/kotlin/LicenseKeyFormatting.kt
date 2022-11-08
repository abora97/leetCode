fun main(){
        println(licenseKeyFormatting("5F3Z-2e-9-w", 4)) //5F3Z-2E9W
    println(licenseKeyFormatting("2-5g-3-J", 2)) //2-5G-3J
}

fun licenseKeyFormatting(s: String, k: Int): String {
    return s.filter { it != '-' }.reversed().chunked(k).joinToString("-").reversed().toUpperCase()
}



fun licenseKeyFormatting1(s: String, k: Int): String {
    val rowString= s.replace("-", "")
    var text =""
    var count=k
    rowString.reversed().forEachIndexed { index, c ->
        text += c
        count--
        if (count==0&& index != rowString.length-1){
            text+="-"
            count=k
        }
    }

    return text.reversed().toUpperCase()
}