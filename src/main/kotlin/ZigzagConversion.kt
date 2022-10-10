
 fun main() {

    println(convert("PAYPALISHIRING", 3))
    println(convert("PAYPALISHIRING", 4))
    println(convert("A", 1))

}

fun convert(s: String, numRows: Int): String {
    if (numRows == 1) return s
    val n = s.length
    var res = ""
    var cnt = numRows

    for (i in 0 until numRows) {
        cnt = if (cnt - 1 == 0) numRows-1 else cnt-1

        var x = cnt*2
        var j = i
        while (j < n) {
            res += s[j]
            j += x
            if ((numRows-1)*2-x != 0)
                x = (numRows-1)*2-x
        }
    }
    return res
}