package basic.basic05_types

fun main() {
    
    strSingleLine()
    strMultiLine()
    strMultiLine_trimIndent()
    string_templates()
}

fun strSingleLine() {
    
    var str = "hello world"
    
    println()
    println("str = $str")
}

fun strMultiLine() {
    
    var multiline = """
        this is
        multi line
        text
    """

    println()
    println("multiline = $multiline")
}

fun strMultiLine_trimIndent() {
    
    var multiline = """
        this is
        multi line
        text
    """.trimIndent()

    println()
    println("multiline trimIndent = $multiline")
}

fun string_templates() {
    
    var str = "hello"

    println()
    println("string_templates")
    println("$str.length is ${str.length}")
}