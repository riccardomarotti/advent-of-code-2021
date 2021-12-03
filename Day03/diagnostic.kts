val input = java.io.File("input").readLines().map { it.toCharArray().map { it.toString().toInt() } }
val numberOfBits = input[0].size
var gamma: Double = 0.0
var epsilon: Double = 0.0

for (i in 0 until numberOfBits) {
    val currentColumn = input.map { it[i] }
    val bits = currentColumn.groupingBy { it }.eachCount().toList().sortedByDescending { (_, v) -> v }.toMap().keys
    val position: Double = (numberOfBits - i - 1).toDouble()

    gamma += bits.first() * Math.pow(2.0, position)
    epsilon += bits.last() * Math.pow(2.0, position)
}

println((gamma * epsilon).toInt())

