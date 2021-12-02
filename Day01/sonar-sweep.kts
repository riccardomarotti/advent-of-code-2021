var previousLine = Int.MAX_VALUE.toString()
var count = 0

java.io.File("input").forEachLine {
    when {
        it.toInt() > previousLine.toInt() -> count += 1
    }

    previousLine = it
}

println(count)