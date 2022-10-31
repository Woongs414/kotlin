class Bird { //클래스의 정의
    //프로퍼티들(속성)
    var name: String = "mybird"
    var wing: Int = 2
    var beak: String = "short"
    var color: String = "blue"

    //메서드들(함수)
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}
fun main() {
    val coco = Bird() //코틀린은 New연산자 사용안함
    coco.color = "red"

    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}

