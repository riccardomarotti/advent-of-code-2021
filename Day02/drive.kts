val lines = java.io.File("input").readLines()
fun getValue(command: String) = command.split(" ")[1].toInt()

val horizontal = lines.filter { it.startsWith("forward") }.map { getValue(it) }.reduce { acc, i -> acc+i }
var depth = lines.filter { it.startsWith("down") }.map { getValue(it) }.reduce { acc, i -> acc+i }
depth -= lines.filter { it.startsWith("up") }.map { getValue(it) }.reduce { acc, i -> acc+i }

println(depth*horizontal)

