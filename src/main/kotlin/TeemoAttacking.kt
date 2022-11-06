class Solution {
    fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
    var sum = 0
    for (i in timeSeries.indices) {
        sum += if (i == timeSeries.size - 1) {
            duration
        } else {
            Math.min(timeSeries[i + 1] - timeSeries[i], duration)
        }
    }
    return sum
}
}