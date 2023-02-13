import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {

    val reader = BufferedReader(InputStreamReader(object{}.javaClass.enclosingClass.classLoader.getResourceAsStream("sample.txt")!!))
    val list = mutableListOf<String>()

    val time = measureTimeMillis {
        // TODO: implement target function
    }
    println("execution time: $time ms")
}
