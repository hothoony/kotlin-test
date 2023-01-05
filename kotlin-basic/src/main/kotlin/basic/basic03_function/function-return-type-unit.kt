package basic.basic03_function

fun main() {
    
    printSum1(1, 2);
    printSum2(1, 2);
    
}

fun printSum1(a: Int, b:Int): Unit {
    println("a + b = ${a + b}");
}

// 리턴 타입 Unit 은 생략 가능 (디폴트 값이 Unit)
// 리턴 타입 Unit 은 값을 반환하지 않는다
fun printSum2(a: Int, b:Int) {
    println("a + b = ${a + b}");
}
