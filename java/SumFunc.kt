
//Any ― 모든 타입 가능
//Unit ― 반환문이 없는 함수

//일반적인 함수의 모습
//fun sum(a: Int, b: Int): Int {
//return a + b
//}

//간략화된 함수
//fun sum(a: Int, b: Int): Int = a + b

//반환 자료형 생략
//fun sum(a: Int, b: Int) = a +

fun sum(a: Int, b: Int):Int {
    var sum = a+ b
    return sum
}

fun main(){
    val result1 = sum(3,2)
//InteliJ IDEA에서 매개변수(a:3, b:2)를 보여줌
    val result2 = sum(6,7)

    println(result1)
    println(result2)
}