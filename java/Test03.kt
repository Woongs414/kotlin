fun main(){
    val a: Int = 1 // 정수형 변수 a 선언하고 1을 할당
//    val b: Double = a //자료형 불일치 오류발생
//    val c: Int = 1.1 //자료형 불일치 오류발생

    val b: Double = a.toDouble() //변환 메서드 사용

    val result = 1L+3 // Long+Int의 결과는 Long형

    val c: Int = 128
    val d: Int = 128
    println(c == d) // true
    println(c === d) //true

    val a1: Int = 128
    val b1: Int = 128
    println(a1 == b1)   //true
    println(a1 === b1) /* false */
}