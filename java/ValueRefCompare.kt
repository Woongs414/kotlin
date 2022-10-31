fun main(){
    val a: Int = 128
    val b = a

    println(a === b) //자료형이 기본형인 int가 되어 값이 동일 true
    val c:Int? = a
    val d:Int? = a
    val e:Int? = c
    println(c ==  d)
    println(c === d)
    println(c === e)
}