fun main() {
    println(maxProfit(arrayOf(7,1,5,3,6,4).toIntArray()))
    println(maxProfit(arrayOf(7,6,4,3,1).toIntArray()))

}

fun maxProfit(prices: IntArray): Int {
    var min = prices[0]
    var maxProfit = 0
    prices.forEach {
        min = Math.min(min, it)
        maxProfit = Math.max(maxProfit, it - min)
    }
    return maxProfit
}

fun maxProfit1(prices: IntArray): Int {
   val profit = (prices.minOrNull()?.let { prices.indexOf(it) }?.let { prices.drop(it) })?.maxOrNull()
        ?.minus(prices.minOrNull()!!) ?: 0

    return profit
}
