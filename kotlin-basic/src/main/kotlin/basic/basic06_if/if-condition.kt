package basic.basic06_if

fun main() {
    
    println("max1 = ${max1(10, 20)}")
    println("max2 = ${max2(10, 20)}")
}

fun max1(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b;
    }
}

fun max2(a: Int, b: Int) = if (a > b) a else b
