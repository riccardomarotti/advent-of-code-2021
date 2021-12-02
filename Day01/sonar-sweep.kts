val input = java.io.File("input").readLines().map { it.toInt() }

val partOneCount = input.zipWithNext().count { (a, b) -> a < b }
println(partOneCount)

val partWtoCount = input.windowed(3).map { it.sum() }.zipWithNext().count { (a, b) -> a < b }
println(partWtoCount)
