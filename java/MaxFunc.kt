fun main(){ //최초의 스택 프레임
    val num1=10
    val num2 = 3
    val result: Int

    result = max(num1, num2) // 두 번째 스택 프레임
    println(result)
}

fun max(a: Int, b: Int) = if (a> b ) a
else b
//a 와 b는 max의 임시 변수

