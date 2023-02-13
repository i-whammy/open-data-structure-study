package intro

import java.io.BufferedReader
import kotlin.system.measureTimeMillis

fun reverseOrder(reader: BufferedReader, array: Array<String>, target: Int) {
        reader.use {
            for (i in 1..target) {
                array[i - 1] = reader.readLine()
            }
            for (i in target downTo 1) {
                println(array[i - 1])
            }
        }
}

fun reverseOrderBy50Lines(reader: BufferedReader, array: Array<String?>, target: Int) {
    val time = measureTimeMillis {
        reader.use {
            for (i in 0 until target / 50) {
                for (j in array.indices) {
                    array[j] = reader.readLine()
                }
                for (k in array.size downTo 1) {
                    println(array[k-1])
                    array[k-1] = null
                }
            }
        }
    }
    println("execution time: $time ms")
}

fun print42LinesBefore(reader: BufferedReader, array: Array<String>) {
    for (i in 0 until 42) {
        array[i] = reader.readLine()
    }
    var isProcessing = true
    var index = 42
    while (isProcessing) {
        val line = reader.readLine()
        if (line.isBlank()) {
            println(array[index % 42])
            isProcessing = false
        } else {
            array[index % 42] = line
            index++
        }
    }
}

fun findNew(reader: BufferedReader, array: Array<String?>) {
    var index = 0
    var processing = true
    while (processing) {
        val line = reader.readLine()
        if (array.find { it == line } == null) {
            println(line)
            processing = false
        } else {
            array[index] = line
            index++
        }
    }
}

fun findExisting(reader: BufferedReader, set: HashSet<String>) {
    for (i in 0 until 100_000) {
        val line = reader.readLine()
        if (set.contains(line)) println(line)
        set.add(line)
    }
}

fun sort(reader: BufferedReader, set: HashSet<String>) {
    for (i in 0 until 100_000) {
        val line = reader.readLine()
        set.add(line)
    }
    set.sorted().forEach { println(it) }
}

fun sortWithDuplication(reader: BufferedReader, list: ArrayList<String>) {
    for (i in 0 until 100_000) {
        val line = reader.readLine()
        list.add(line)
    }
    list.sorted().forEach { println(it) }
}

fun printEvenOdd(reader: BufferedReader, list: ArrayList<String>) {
    for (i in 0 until 100_000) {
        val line = reader.readLine()
        list.add(line)
    }
    for (i in 0 until list.size / 2) {
        println(list[i * 2])
    }
    for (i in 0 until list.size / 2) {
        println(list[i * 2] + 1)
    }
}