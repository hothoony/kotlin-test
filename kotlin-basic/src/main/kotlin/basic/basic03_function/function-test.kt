package basic.basic03_function

fun main() {
    
    println(sum1(1, 2));
    println(sum2(1, 2));
    println(sum3(1, 2));
    
}

fun sum1(a: Int, b: Int): Int {
    return a + b;
}

// 변수 뒤에 타입을 공백없이 붙여 씀
fun sum2(a:Int, b:Int):Int {
    return a + b;
}

// 펑션을 한 줄로 정의
fun sum3(a: Int, b: Int) = a + b
