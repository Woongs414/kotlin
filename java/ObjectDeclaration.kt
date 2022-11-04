// (1) object 키워드를 사용한 방식
object OCustomer {
    var name = "Kildong"
    fun greeting() = println("Hello World!")
    val HOBBY = Hobby("Basketball")
    init { //블록초기화(object선언은 생성자로 초기화하는 대신에 사용)
        println("Init!")
    }
}

class Hobby(val name: String)
fun main() {
    OCustomer.greeting() // 객체의 접근 시점(이때 객체 생성)
    OCustomer.name = "Dooly"
    println("name = ${OCustomer.name}")
    println(OCustomer.HOBBY.name)

}