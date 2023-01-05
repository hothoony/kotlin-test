package basic.basic07_loop

fun main() {
    
    var items = listOf("apple", "banana", "kiwi")
    
    println()
    for (item in items) {
        println(item)
    }

    println()
    for (index in items.indices) {
        println("$index => ${items[index]}")
    }
    
}
