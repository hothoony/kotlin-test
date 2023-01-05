package basic.basic07_loop

fun main() {
    
    var items = listOf("apple", "banana", "kiwi")
    
    var index = 0
    while (index < items.size) {
        println("$index => ${items[index]}")
        index++
    }
}