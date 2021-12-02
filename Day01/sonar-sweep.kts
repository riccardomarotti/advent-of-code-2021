val count = java.io.File("input").readLines().map { it.toInt() }.zipWithNext().count { (a, b) -> a < b }

println(count)
