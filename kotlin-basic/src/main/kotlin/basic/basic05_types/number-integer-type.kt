package basic.basic05_types

fun main() {

    integerType_Byte()
    integerType_Short()
    integerType_Int()
    integerType_Long()
}

fun integerType_Byte() {
    
    // Byte
    var numByteMin: Byte = -128
    var numByteMax: Byte = 127
    
    println()
    println("--------------------------Byte")
    println("numByteMin = $numByteMin")
    println("numByteMax = $numByteMax")
}

fun integerType_Short() {

    // Short
    var numShortMin: Short = -32768
    var numShortMax: Short = 32767

    println()
    println("--------------------------Short")
    println("numShortMin = $numShortMin")
    println("numShortMax = $numShortMax")
}

fun integerType_Int() {

    // Int
    var numInt1: Int = -2147483648
    var numInt2 = 2147483647

    println()
    println("--------------------------Int")
    println("numInt1 = $numInt1")
    println("numInt2 = $numInt2")
}

fun integerType_Long() {
    
    // Long
    // 뒤에 L 을 붙인다
    var numLong1: Long = -92233720368547758L
    var numLong2 = 9223372036854775807L

    println()
    println("--------------------------Long")
    println("numLong1 = $numLong1")
    println("numLong2 = $numLong2")
}