interface Bird11 { //인터페이스 선언구성
    val wings: Int //추상 프로퍼티
    fun fly() //추상 메서드
    fun jump() = println("bird jump!")
    // 단일구현 {}생략가능, 구현부있는 일반메서드
}
interface Horse {
    val maxSpeed: Int
    fun run()
    fun jump() = println("jump!, max speed: $maxSpeed")
}
class Pegasus: Bird11, Horse {
    override val wings: Int = 2
    override val maxSpeed: Int = 100
    override fun fly() = println("Fly!")
    override fun run() = println("Run!")
    override fun jump() {
        super<Horse>.jump()
        println("and Jump!")
    }
}
fun main() {
    val pegasus = Pegasus()
    var jump= pegasus.jump()
}
