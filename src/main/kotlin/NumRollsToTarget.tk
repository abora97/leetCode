fun main(){
      println(numRollsToTarget(1,6,3))
    println(numRollsToTarget(2,6,7))
    println(numRollsToTarget(30,30,500))

}


fun numRollsToTarget(d: Int, f: Int, t: Int): Int {
    val MOD = (10.0.pow(9.0) + 7).toLong()
    val dp = Array(d) {
        LongArray(
            t + 1
        )
    }
    var j = 1
    while (j <= t && j <= f) {
        dp[0][j] = 1 //with single dice, we have only 1 way
        j++
    }
    for (i in 1 until dp.size) {
        for (j in i + 1..t) {
            for (k in 1..Math.min(j, f)) {
                dp[i][j] = (dp[i][j] + dp[i - 1][j - k]) % MOD
            }
        }
    }
    return dp[dp.size - 1][t].toInt()
}

fun numRollsToTarget2(n: Int, k: Int, target: Int): Int {
    val dp = Array(n + 1) {
        IntArray(
            target + 1
        )
    }
    dp[0][0] = 1
    val m = 1000000007
    for (i in 1..n) {
        for (j in 1..target) {
            for (face in 1..k) {
                if (j - face < 0) continue
                dp[i][j] = (dp[i][j] % m + dp[i - 1][j - face] % m) % m
            }
        }
    }
    return dp[n][target]
}