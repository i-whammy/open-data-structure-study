package intro

class Bag() {
    private val list = mutableListOf<String>()

    fun add(x: String) {
        list.add(x)
    }

    fun remove(x: String) {
        list.remove(x)
    }

    fun find(x: String): String? {
        return list.find { it == x }
    }

    fun findAll(x: String): List<String> {
        return list.filter { it == x }
    }
}
